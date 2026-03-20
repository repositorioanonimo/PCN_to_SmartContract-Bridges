package pcn.generator.sce;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;

import pcn.PCNDelayTimeTag;
import pcn.PCNDiagram;
import pcn.PCNProbabilitiesTag;
import pcn.PCNProcessEntity;
import pcn.PCNProcessStep;
import pcn.PCNProcessStepWithTags;
import pcn.PCNRegularProcessStep;
import pcn.PCNSyncTag;
import pcn.PCNTag;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import java.util.ArrayList;

public class SceGenerator {
	private SceGenInterfaces ui = new SceGenInterfaces();
	private SceGenTemplates template = new SceGenTemplates();
	private HashMap<PCNProcessStep, Integer> stepsMap = new HashMap<PCNProcessStep, Integer>();
	private HashMap<PCNProcessEntity, Integer> entitiesMap = new HashMap<PCNProcessEntity, Integer>();
	
	public void generate(Resource resource, IFile file) throws CoreException {
		// Obtiene el PCN Diagram del recurso
		PCNDiagram diagram = (PCNDiagram) resource.getContents().get(0);
		// Obtiene la lista de entidades del PCN Diagram
		EList<PCNProcessEntity> entities = diagram.getDiagramEntities();
		// Crea el nombre de la clase del contrato
		String contractName = (file.getName().substring(0, 1).toUpperCase() + file.getName().substring(1)).replace(".sce", "");
		
		// Obtiene el código generado para el fichero salida
		String fileContent = generatedCode(diagram, entities, contractName);
		// Escribe el código generado en el fichero salida
		file.setContents(new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8)), true, true, null);
	}
  
    private String generatedCode(PCNDiagram diagram, EList<PCNProcessEntity> entities, String contractName) {   		  	   	
    	// Asocia cada Entity y cada Step con un ID y los almacena en un Map
    	int entityId = 0;
    	int stepId = 1;
    	for (PCNProcessEntity entity : entities) {
    		entitiesMap.put(entity, entityId);
    		entityId++;
    		
    		EList<PCNProcessStep> steps = new BasicEList<>();
    		steps.addAll(entity.getLeftDirectInteractions());
    		steps.addAll(entity.getLeftSurrogateInteractions());
    		steps.addAll(entity.getCenterIndependentInteractionsActivities());
    		steps.addAll(entity.getRightSurrogateInteractions());
    		steps.addAll(entity.getRightDirectInteractions());
    		for (PCNProcessStep step : steps) {
    			stepsMap.put(step, stepId);
    			stepId++;
    		}    		
    	} 
    	// Obtiene la plantilla Xtend con las direcciones de las Entities
    	String entityAddresses = entityAddresses(entities);   
    	// Obtiene la plantilla Xtend con los Steps
    	String steps = steps(entities);
    	   	     
    	// Devuelve la plantilla Xtend con todo el codigo generado
    	return template.baseCode(contractName, entityAddresses, steps); 	
    } 
    
    private String entityAddresses(EList<PCNProcessEntity> entities) {
    	// Obtiene las direcciones de las Entities mediante UI
    	ArrayList<String> addresses = new ArrayList<String>();
    	if (!entities.isEmpty()) {
    		addresses = ui.askEntityAddresses(entities);
    	}
    	// Devuelve la plantilla Xtend con las direcciones de las Entities
    	return template.entitiesTemplate(entities, addresses);  	
    }
    
    private String steps(EList<PCNProcessEntity> entities) {
    	// Para cada Entity y por cada región del Domain, obtiene la plantilla de cada Step por separado y se almacenan en una lista
    	ArrayList<String> steps = new ArrayList<String>();   	
    	for (PCNProcessEntity entity : entities) {
    		int entityId = entitiesMap.get(entity);
    		int domainRegionId;
    		
    		domainRegionId = 0;
    		for (PCNProcessStep step : entity.getLeftDirectInteractions()) {
    			steps.add(step(entityId, (PCNProcessStepWithTags) step, "leftDirectInteractions", domainRegionId));	
    			domainRegionId++;
    		}
    		domainRegionId = 0;
    		for (PCNProcessStep step: entity.getLeftSurrogateInteractions()) {
    			steps.add(step(entityId, (PCNProcessStepWithTags) step, "leftSurrogateInteractions", domainRegionId));
    			domainRegionId++;
    		}
    		domainRegionId = 0;
    		for (PCNProcessStep step: entity.getCenterIndependentInteractionsActivities()) {
    			steps.add(step(entityId, (PCNProcessStepWithTags) step, "centerIndependentInteractionsActivities", domainRegionId));
    			domainRegionId++;
    		}
    		domainRegionId = 0;
    		for (PCNProcessStep step: entity.getRightSurrogateInteractions()) {
    			steps.add(step(entityId, (PCNProcessStepWithTags) step, "rightSurrogateInteractions", domainRegionId));
    			domainRegionId++;
    		}
    		domainRegionId = 0;
    		for (PCNProcessStep step: entity.getRightDirectInteractions()) {
    			steps.add(step(entityId, (PCNProcessStepWithTags) step, "rightDirectInteractions", domainRegionId));
    			domainRegionId++;
    		}
    	}
    	
    	// Devuelve la plantilla Xtend con los Steps
    	return template.stepsTemplate(steps);  	
    }    
    
    private String step(int entityId, PCNProcessStepWithTags step, String domainRegion, int domainRegionId) {		
		// Obtiene la plantilla Xted con las Dependencies del Step
		String dependencies = dependencies(step);
		// Obtiene la plantilla Xtend con las Tags del Step
		String tags = tags(step);

		// Dependiendo de su tipo, obtiene la plantilla del cuerpo del Step
		int stepId = stepsMap.get(step);
		String action = step.getAction();
		var body = "";		
		switch (step.eClass().getName()) {
			case "PCNStandardStep": {
				body = template.standardStepTemplate((PCNRegularProcessStep) step, stepId, action);		
				break;
			}			
			case "PCNDoAndWaitStep": {
				int waitingTime = ui.askWaitingTime(step); // Obtiene el tiempo de espera del Step mediante UI
				body = template.doAndWaitStepTemplate((PCNRegularProcessStep)step, stepId, action, waitingTime);
				break;
			}
			case "PCNInnovationStep": {
				body = template.innovationStepTemplate((PCNRegularProcessStep) step, stepId, action);	
				break;
			}
			case "PCNOutsourcedStep": {
				String outsource = ui.askOutsourceAddress(step); // Obtiene la dirección del Step mediante UI
				body = template.outsourcedStepTemplate((PCNRegularProcessStep) step, stepId, action, outsource);
				break;
			}	
			case "PCNWaitStep": {
				int waitingTime = ui.askWaitingTime(step); // Obtiene el tiempo de espera del Step mediante UI
				body = template.waitStepTemplate((PCNRegularProcessStep) step, stepId, action, waitingTime);
				break;
			}
			case "PCNDecisionStep": {				
				body = template.decisionStepTemplate(step, stepId, action);	
				break;
			}
		}
		
		// Devuelve la plantilla Xtend del Step
    	return template.stepTemplate(step, stepId, action, entityId, dependencies, domainRegion, domainRegionId, tags, body);	
    }    
    
    private String dependencies(PCNProcessStepWithTags target) {      	
    	// Obtiene si el Step objetivo tiene Dependencies
    	boolean dependenciesFound = !(target.getPCNStandardDependencySource().isEmpty() &&
								target.getPCNDelayedDependencySource().isEmpty() &&
								target.getPCNPositiveDecisionSource().isEmpty() &&
								target.getPCNNegativeDecisionSource().isEmpty());
    	
    	// Se obtiene la plantilla de cada Dependency por separado y se almacenan en una lista
    	int targetId = stepsMap.get(target);
    	ArrayList<String> dependencies = new ArrayList<String>();									
		if (!dependenciesFound) {
			dependencies.add(template.standardDependencyTemplate(0, targetId));	
		}
		else {	
			for (PCNProcessStepWithTags source : target.getPCNStandardDependencySource()) {
				int sourceId = stepsMap.get(source);
				dependencies.add(template.standardDependencyTemplate(sourceId, targetId));
			}
			for (PCNProcessStepWithTags source : target.getPCNDelayedDependencySource()) {
				int sourceId = stepsMap.get(source);
				int dependencyDelay = ui.askDependencyDelay(source, target); // Obtiene el tiempo de retardo de la Dependency mediante UI
				dependencies.add(template.delayedDependencyTemplate(sourceId, targetId, dependencyDelay));
			}		
			for (PCNProcessStepWithTags source : target.getPCNPositiveDecisionSource()) {
				int sourceId = stepsMap.get(source);
				dependencies.add(template.positiveDependencyTemplate(sourceId, targetId));
			}
	 		for (PCNProcessStepWithTags source : target.getPCNNegativeDecisionSource()) {
				int sourceId = stepsMap.get(source);
				dependencies.add(template.negativeDependencyTemplate(sourceId, targetId));
			}		
		}
			
		// Devuelve la plantilla Xted con las Dependencies de un Step
    	return template.dependenciesTemplate(dependencies);	
    } 
    
    private String tags(PCNProcessStepWithTags step) {   
    	// Obtiene las posibles Tags del Step   	
		EList<PCNTag> tags = new BasicEList<>();
		tags.addAll(step.getNonMonetaryBenefits());
		tags.addAll(step.getNonMonetaryCosts());
		tags.addAll(step.getMonetaryBenefits());
		tags.addAll(step.getMonetaryCosts());
		tags.addAll(step.getTextualTags());
		PCNDelayTimeTag delayTimeTag = step.getDelayTimeTags();    	
    	PCNProbabilitiesTag  probabilitiesTag = step.getProbabilitiesTags(); 	
    	PCNSyncTag syncTag = step.getSyncTags();
    	  
		// Devuelve la plantilla Xtend con las Tags de un Step
    	return template.tagsTemplate(tags, delayTimeTag, probabilitiesTag, syncTag);
    }                                   
}