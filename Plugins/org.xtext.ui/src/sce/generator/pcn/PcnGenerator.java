package sce.generator.pcn;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xtext.smaC.Clause;
import org.xtext.smaC.Constructor;
import org.xtext.smaC.Contract;
import org.xtext.smaC.Event;
import org.xtext.smaC.File;
import org.xtext.smaC.InputParam;
import org.xtext.smaC.Modifier;

public class PcnGenerator {
	private PcnGenTemplates template = new PcnGenTemplates();
	private EList<Clause> functions;
	
	public void generate(Resource resource, IFile file) throws CoreException {
		// Obtiene el objeto Contract del recurso
		Contract contract = ((File) resource.getContents().get(0)).getContracts().get(0);

		// Obtiene el código generado para el fichero salida
		String fileContent = generatedCode(contract);
		// Escribe el código generado en el fichero salida
		file.setContents(new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8)), true, true, null);
	}
  
    private String generatedCode(Contract contract) {  
    	// Obtiene el constructor del Contract
    	Constructor constructor = contract.getConstructors().get(0);

    	// Obtiene del constructor las líneas de inicialización de las Entities
    	EList<String> entitiesInit = constructor.getAttributesInitialization(); 
    	entitiesInit.remove(entitiesInit.size()-1);
    	
    	// Obtiene las funciones del Contract
    	functions = contract.getClauses();

    	// Obtiene la plantilla Xtend con los nombres y órdenes de las Entities
    	String entities = entities(entitiesInit);
    	
    	return template.baseCode(entities);	
    } 
    
    private String entities(EList<String> entitiesInit) {
    	// Obtiene de la declaración de cada Entity su nombre y orden y lo almacena en un map
    	ArrayList<String> orders = new ArrayList<String>();
    	ArrayList<String> names = new ArrayList<String>();  	
    	Pattern pattern = Pattern.compile("Entity\\(([^,]+), \"([^\"]+)\", [^\\)]+\\)");
        for (int i = 0; i < entitiesInit.size(); i++) {
            Matcher matcher = pattern.matcher(entitiesInit.get(i));
            if (matcher.find()) {
            	orders.add(matcher.group(1));
            	names.add(matcher.group(2));
            }
        }
        
        // Obtiene un array con las plantillas Xtend con los Steps de cada Entity
        ArrayList<String> steps = steps(entitiesInit);

    	return template.entitiesTemplate(orders, names, steps);
    }
    
    private ArrayList<String> steps(EList<String> entitiesInit) {  
    	ArrayList<String> stepsTemplates = new ArrayList<String>();  
    	ArrayList<String> steps = new ArrayList<String>();
    	for (int i = 0; i < entitiesInit.size(); i++) {
    		for (Clause function : functions) {   
    			String entityId = function.getInputParamsModifier().get(0).getValueInput().replace("\"", "");    			
    			if (i==Integer.parseInt(entityId)) {
    				steps.add(step(function));
    			}    		
    		}    		
    		stepsTemplates.add(template.stepsTemplate(steps));
    		steps.clear();
    	}
    	return stepsTemplates;	
    }     
    
    private String step(Clause function) { 
    	String type = function.getInputParamsEvent().get(0).getValueInput().replace("\"", ""); 
    	String domainRegion = function.getInputParamsEvent().get(1).getValueInput().replace("\"", "");
    	String action = function.getInputParamsEvent().get(3).getValueInput().replace("\"", "");
    	ArrayList<String> dependencies = dependencies(function, type);	
    	String tags = tags(type, function);
    	
		return template.stepTemplate(type, domainRegion, action, dependencies, tags);	
    } 
            
    private ArrayList<String> dependencies(Clause function, String type) {
    	String stepId = function.getInputParamsModifier().get(2).getValueInput();
    	ArrayList<String> dependencies = new ArrayList<String>();

    	String standardDependenciesSource = "";
		String delayedDependenciesSource = "";
		String positiveDependenciesSource = "";
		String negativeDependenciesSource = "";		
    	String positiveDependencies = "";
        String negativeDependencies = "";
    	String standardDependencies = "";
    	String delayedDependencies = "";
    	
    	EList<Clause> functions = new BasicEList<>(EcoreUtil.copyAll(this.functions));
    	ArrayList<String> dependencyNames = new ArrayList<String>();
		ArrayList<ArrayList<String>> dependencyParams = new ArrayList<ArrayList<String>>();
		for (Clause f : functions) {
			// Elimina los modificadores "sobrantes" que no pertenecen a Dependencies
        	EList<Modifier> modifiersDependencies = f.getPersonalizedModifier();  
        	modifiersDependencies.subList(0, 1).clear();
    		EList<InputParam> paramDependencies = f.getInputParamsModifier();
    		paramDependencies.subList(0, 1).clear();
    		
    		// De cada modificador, obtiene su nombre junto a la lista de sus parámetros y se guardan en listas
    		ArrayList<String> dependencyNamesAux = new ArrayList<String>();
    		ArrayList<ArrayList<String>> dependencyParamsAux = new ArrayList<ArrayList<String>>();
    		for (Modifier modifierDependency : modifiersDependencies) {
    			dependencyNames.add(modifierDependency.getName());
    			int dependencyParamNum = modifierDependency.getInputParams().size();	                			
    			dependencyParamsAux.add((ArrayList<String>)paramDependencies.subList(0, dependencyParamNum).stream().map(InputParam::getValueInput).map(param -> param.replace("\"", "")).collect(Collectors.toList()));	               	
    			paramDependencies.subList(0, dependencyParamNum).clear();	
    		}
    		dependencyNames.addAll(dependencyNamesAux);
    		dependencyParams.addAll(dependencyParamsAux);
		}
    	
		EList<Clause> functions_ = new BasicEList<>(EcoreUtil.copyAll(this.functions));
    	for (Clause f : functions_) {
    		String stepId_ = f.getInputParamsModifier().get(2).getValueInput();
    		String entityId = f.getInputParamsModifier().get(0).getValueInput().replace("\"", "");  
	    	String domainRegion = f.getInputParamsEvent().get(1).getValueInput().replace("\"", "");
	    	String domainRegionId = f.getInputParamsEvent().get(2).getValueInput();
	    	
    		for (int i=0; i < dependencyNames.size(); i++) {    		
    			switch (dependencyNames.get(i)) {
    				case "standardDependency": {
    					if (dependencyParams.get(i).get(0).equals(stepId) && dependencyParams.get(i).get(1).equals(stepId_)) {
    						standardDependencies += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					if (dependencyParams.get(i).get(0).equals(stepId_) && dependencyParams.get(i).get(1).equals(stepId)) {
    						standardDependenciesSource += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					break;
    				}
    				case "delayedDependency": {
    					if (dependencyParams.get(i).get(0).equals(stepId) && dependencyParams.get(i).get(1).equals(stepId_)) {
    						delayedDependencies += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					if (dependencyParams.get(i).get(0).equals(stepId_) && dependencyParams.get(i).get(1).equals(stepId)) {
    						delayedDependenciesSource += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					break;
    				} 
    				case "positiveDependency": {
    					if (dependencyParams.get(i).get(0).equals(stepId) && dependencyParams.get(i).get(1).equals(stepId_)) {
    						positiveDependencies += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					if (dependencyParams.get(i).get(0).equals(stepId_) && dependencyParams.get(i).get(1).equals(stepId)) {
    						positiveDependenciesSource += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					break;
    				} 
    				case "negativeDependency": {
    					if (dependencyParams.get(i).get(0).equals(stepId) && dependencyParams.get(i).get(1).equals(stepId_)) {
    						negativeDependencies += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					if (dependencyParams.get(i).get(0).equals(stepId_) && dependencyParams.get(i).get(1).equals(stepId)) {
    						negativeDependenciesSource += template.dependencyTemplate(entityId, domainRegion, domainRegionId) + " ";
    					}
    					break;
    				}			
    			}
    		}
    	}
    	
    	dependencies.add(standardDependenciesSource);
    	dependencies.add(delayedDependenciesSource);
    	dependencies.add(positiveDependenciesSource);
    	dependencies.add(negativeDependenciesSource);	
    	if (type == "PCNDecisionStep") {
    		dependencies.add(positiveDependencies);
    		dependencies.add(negativeDependencies);
    	}
    	else {
    		dependencies.add(standardDependencies);
    		dependencies.add(delayedDependencies);		
    	}

		return dependencies;
    }
    
    private String tags(String type, Clause f) { 
    	Clause function = EcoreUtil.copy(f);
    	// Elimina los eventos "sobrantes" que no pertenecen a Tags
    	EList<Event> eventsTags = function.getEvent();
		eventsTags.subList(0, 1).clear();
		EList<InputParam> paramTags = function.getInputParamsEvent();
		paramTags.subList(0, 4).clear();	
		switch (type) {
			case "PCNStandardStep": {
				eventsTags.subList(eventsTags.size() - 1, eventsTags.size()).clear();
				break;
			}
			case "PCNOutsourcedStep": {
				eventsTags.subList(eventsTags.size() - 1, eventsTags.size()).clear();
				break;
			}
			case "PCNInnovationStep": {
				eventsTags.subList(eventsTags.size() - 2, eventsTags.size()).clear();
				break;
			}
			case "PCNDecisionStep": {
				eventsTags.subList(eventsTags.size() - 1, eventsTags.size()).clear();
				break;
			}
			default :
				break;
		}
		
		// De cada evento de Tag, obtiene su nombre junto a la lista de sus parámetros y se guardan en listas
		ArrayList<String> tagNames = new ArrayList<String>();
		ArrayList<ArrayList<String>> tagParams = new ArrayList<ArrayList<String>>();
		for (Event eventTag : eventsTags) {
			tagNames.add(eventTag.getName());
			int tagParamNum = eventTag.getInputParams().size();	                			
			tagParams.add((ArrayList<String>)paramTags.subList(0, tagParamNum).stream().map(InputParam::getValueInput).map(param -> param.replace("\"", "")).collect(Collectors.toList()));	               	
			paramTags.subList(0, tagParamNum).clear();	
		} 
    	
		return template.tagsTemplate(tagNames, tagParams);	
    } 
}