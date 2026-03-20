package sce.generator.pcn;

import java.util.ArrayList

class PcnGenTemplates {
	
	/** 
	 *	Template for the base XMI code
	 *	@param entities is the template for the Entities
	 *	@return the Xtend template for the base XMI code
	 */		
	def String baseCode(String entities) {
		return
    	'''
    	<?xml version="1.0" encoding="UTF-8"?>
    	<pcn:PCNDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:pcn="http://www.kybele.es/elastic/models/pcn/1.0">
    	  «entities»
    	</pcn:PCNDiagram>
    	'''
	}	
		
	/** 
	 *	Template for the Entities XMI
	 *	@param orders is the list of Entities orders
	 *	@param names is the list of Entities names
	 *	@param steps is the templates list for the Steps XMI code
	 *	@return the Xtend template for the Entities XMI code
	 */		
	def String entitiesTemplate(ArrayList<String> orders, ArrayList<String> names, ArrayList<String> steps) {
		return
		'''
		«IF orders.size > 0»
			«FOR i : 0..orders.size-1»
				<diagramEntities name="«names.get(i)»" order="«orders.get(i)»">
				  «steps.get(i)»
				</diagramEntities>
	    	«ENDFOR»
    	«ENDIF»
    	'''
	}	

	/** 
	 *	Template for the Steps XMI code
	 *	@param steps is the templates list for the Steps XMI code
	 *	@return the Xtend template for the Steps XMI code
	 */	
	def String stepsTemplate(ArrayList<String> steps) {
		return
		'''
    	«FOR step : steps»
    		«step»
    	«ENDFOR»		
    	'''
	}		
	
	/** 
	 *	Template for a Step XMI code
	 * 	@param type is the Step type of the Step
	 * 	@param domainRegion is the domain region of the Step
	 * 	@param action is the action of the step
	 * 	@param dependencies is the templates list for the Dependencies XMI code
	 * 	@param tags is the templates for the Tags XMI code
	 *	@return the Xtend template for the Step function
	 */		
	def String stepTemplate(String type, String domainRegion, String action, ArrayList<String> dependencies, String tags) {
		return 
    	'''
    	«IF type == "PCNDecisionStep"»
    	    <«domainRegion» xsi:type="pcn:«type»" PCNStandardDependencySource="«dependencies.get(0)»" PCNDelayedDependencySource="«dependencies.get(1)»" PCNPositiveDecisionSource="«dependencies.get(2)»" PCNNegativeDecisionSource="«dependencies.get(3)»" action="«action»" PCNPositiveDecision="«dependencies.get(4)»" PCNNegativeDecision="«dependencies.get(5)»">
    	      «tags»
    	    </«domainRegion»>
    	«ELSE»
    	    <«domainRegion» xsi:type="pcn:«type»" PCNStandardDependencySource="«dependencies.get(0)»" PCNDelayedDependencySource="«dependencies.get(1)»" PCNPositiveDecisionSource="«dependencies.get(2)»" PCNNegativeDecisionSource="«dependencies.get(3)»" action="«action»" PCNStandardDependency="«dependencies.get(4)»" PCNDelayedDependency="«dependencies.get(5)»">
    	      «tags»
    	    </«domainRegion»>
    	«ENDIF»
    	'''
	}
	
	/** 
	 *	Template for a Dependency XMI code
	 *	@param entityId is the Entity ID of the Dependency Step
	 * 	@param domainRegion is the domain region of the Dependency Step
	 * 	@param domainRegionId is the domain region ID of the Dependency Step
	 *	@return the Xtend template for a Dependency XMI code
	 */	
	def String dependencyTemplate(String entityId, String domainRegion, String domainRegionId) {
		return
		'''//@diagramEntities.«entityId»/@«domainRegion».«domainRegionId»'''		
	}
				
	/** 
	 *	Template for Step Tags XMI code
	 *	@param tags is the list of Tag names 
	 *	@param tagParams is the list of Tag parameters
	 *	@return the Xtend template for the Step Tags XMI code
	 */		
	def String tagsTemplate(ArrayList<String> tagNames, ArrayList<ArrayList<String>> tagParams) {		
		return
    	'''
    	«IF tagNames.size > 0»
	    	«FOR i : 0..tagNames.size-1»
	    		«switch tagNames.get(i) {  			
	    			case "NonmonetaryBenefitsTag": '''<nonMonetaryBenefits/>'''
	    			case "NonmonetaryCostsTag": '''<nonMonetaryCosts/>'''
	    			case "MonetaryCompensationsTag": '''<monetaryBenefits/>'''
	    			case "MonetaryCostsTag": '''<monetaryCosts/>'''
	    			case "TextTag" : '''<textualTags tag="«tagParams.get(i).get(0)»"/>'''
	    			case "ProbabilitiesTag": '''<probabilitiesTags yesProbability="«tagParams.get(i).get(0)»" noProbability="«tagParams.get(i).get(1)»"/>'''
	    			case "DelayTimeTag": '''<delayTimeTags delayTime="«tagParams.get(i).get(0)»"/>'''
	    			case "SynchronizationTag": '''<syncTags/>'''
	    		}»
	    	«ENDFOR»
    	«ENDIF»
    	'''		
	}		
}