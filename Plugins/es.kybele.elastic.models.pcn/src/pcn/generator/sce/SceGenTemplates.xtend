package pcn.generator.sce

import pcn.PCNRegularProcessStep
import pcn.PCNProcessStepWithTags
import pcn.PCNProcessEntity
import pcn.PCNTag
import pcn.PCNDelayTimeTag
import pcn.PCNProbabilitiesTag
import pcn.PCNSyncTag
import pcn.PCNTextualTag
import org.eclipse.emf.common.util.EList
import java.util.ArrayList

class SceGenTemplates {
	
	/** 
	 *	Template for the base code (mappings, constructor, modifiers, events)
	 *	@param contratName is the Contract class name
	 *	@param entityAddresses is the template for the Entities addresses
	 * 	@param steps is the template for the Steps
	 *	@return the Xtend template for the base code
	 */		
	def String baseCode(String contractName, String entityAddresses, String steps) {
		return
    	'''
    	// SPDX-License-Identifier: GPL-3.0
    	
    	pragma solidity >=0.8.2 <0.9.0;
    	
    	contract «contractName» {
    		
    	    struct Entity{
    			uint order;
    	        string name;
    			address addr;
    	    }	
    		
    		mapping(uint => Entity) private entity;
    		mapping(uint => bool) private completedStep;
    		mapping(uint => uint) private waitInit;
    		mapping(uint => bool) private decision;
    		mapping(uint => uint) private delayedDependencyInit;
    		
    		constructor() { 
    			«entityAddresses»	
    			completedStep[0] = true;
    		}
    		
    		modifier domain(uint _entity) {
    			require(msg.sender == entity[_entity].addr,
    		    "This step isn't part of your domain");
    		    _;
    		}
    		
    		modifier standardDependency(uint _source, uint _target) {
    		    require(completedStep[_source],
    		    "Dependencies not complete for this step");
    		        
    		    require(!completedStep[_target],
    		    "This step has already been done");
    		    _;
    		}
    		
    		modifier delayedDependency(uint _source, uint _target, uint _duration) {
    		    require(completedStep[_source],
    		    "Dependencies not complete for this step");
    		
    		    require(!completedStep[_target],
    		    "This step has already been done");
    		
    		     require(block.timestamp >= delayedDependencyInit[_source] + _duration,
    		    "You must wait a while before executing this step");
    		    _;
    		}
    		
    		modifier positiveDependency(uint _source, uint _target) {
    		    require(completedStep[_source],
    		    "Dependencies not complete for this step");
    		        
    		    require(!completedStep[_target],
    		    "This step has already been done");
    		
    		    require(decision[_source]==true,
    		    "The decision taken is negative");
    		    _;
    		}
    		
    		modifier negativeDependency(uint _source, uint _target) {
    		    require(completedStep[_source],
    		    "Dependencies not complete for this step");
    		        
    		    require(!completedStep[_target],
    		    "This step has already been done");
    		
    		    require(decision[_source]==false,
    		    "The decision taken is positive");
    		    _;
    		}
    		
    		event StepInfo(string _class, string _domainRegion, int _domainRegionId, string _action);
    		event StepCompleted(address _entity, string _name);
    		
    		event Innovation();
    		
    		event MonetaryCompensationsTag();
    		event MonetaryCostsTag();
    		event NonmonetaryBenefitsTag();
    		event NonmonetaryCostsTag();
    		event TextTag(string _text);
    		event DelayTimeTag(string _time);
    		event ProbabilitiesTag(string _yes, string _no);
    		event SynchronizationTag();
    		«steps»	    		
    	}
    	'''
	}	
	
	/** 
	 *	Template for the Entity addresses
	 *	@param entities is the list of Entities
	 *	@param addresses is the list of Entity addresses introduced
	 *	@return the Xtend template for the Entities
	 */		
	def String entitiesTemplate(EList<PCNProcessEntity> entities, ArrayList<String> addresses) {
		return
		'''
		«IF entities.size > 0»
			«FOR i : 0..entities.size-1»
				entity[«i»] = Entity(«entities.get(i).getOrder», "«entities.get(i).getName»", «addresses.get(i)»);
	    	«ENDFOR»

    	«ENDIF»
    	'''
	}	

	/** 
	 *	Template for the Steps
	 *	@param steps is the Steps templates list of an Entity
	 *	@return the Xtend template for the Steps
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
	 *	Template for Step functions
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 * 	@param entity is the Entity that performs the Step
	 * 	@param dependencies is the list of Dependencies with other Steps
	 * 	@param domainRegion is the region of the Domain in which the Step is located
	 * 	@param tags is the list of Tags that the Step has
	 * 	@param body is the exclusive code part of each Step
	 *	@return the Xtend template for the Step function
	 */		
	def String stepTemplate(PCNProcessStepWithTags step, int stepId, String action, int entityId, String dependencies, String domainRegion, int domainRegionId, String tags, String body) {
		return 
    	'''
    	
    	function step«stepId»() public domain(«entityId»)
    	«dependencies»
    	{  	    		
    		emit StepInfo("«step.eClass.getName»", "«domainRegion»", «domainRegionId», "«step.getAction»");
    		«tags»    		
    		«body»
    	}
    	'''
	}

	/** 
	 *	Template for Step Dependencies
	 *	@param dependencies is the Dependencies templates list of the Step
	 *	@return the Xtend template for the Dependencies
	 */	
	def String dependenciesTemplate(ArrayList<String> dependencies) {
    	'''
		«FOR dependency : dependencies»
			«dependency»
		«ENDFOR»
    	'''
	}
	
	/** 
	 *	Template for Standard Dependencies
	 *	@param sourceId is the source step ID of the Dependency
	 * 	@param targetId is the target step ID of the Dependency
	 *	@return the Xtend template for the standard Dependency
	 */	
	def String standardDependencyTemplate(int sourceId, int targetId) {
		return
		'''
		standardDependency(«sourceId», «targetId»)
		'''	
	}

	/** 
	 *	Template for Delayed Dependencies
	 *	@param sourceId is the source step ID of the Dependency
	 * 	@param targetId is the target step ID of the Dependency
	 * 	@param dependencyDelay is the delay itroduced for the Dependency
	 *	@return the Xtend template for the Delayed Dependency
	 */		
	def String delayedDependencyTemplate(int sourceId, int targetId, int dependencyDelay) {
		return
		'''
		delayedDependency(«sourceId», «targetId», «dependencyDelay»)
		'''	
	}

	/** 
	 *	Template for Positive Dependencies
	 *	@param sourceId is the source step ID of the Dependency
	 * 	@param targetId is the target step ID of the Dependency
	 *	@return the Xtend template for the Positive Dependency
	 */		
	def String positiveDependencyTemplate(int sourceId, int targetId) {
		return
		'''
		positiveDependency(«sourceId», «targetId»)
		'''	
	}

	/** 
	 *	Template for Negative Dependencies
	 *	@param sourceId is the source step ID of the Dependency
	 * 	@param targetId is the target step ID of the Dependency
	 *	@return the Xtend template for the Negative Dependency
	 */		
	def String negativeDependencyTemplate(int sourceId, int targetId) {
		return
		'''
		negativeDependency(«sourceId», «targetId»)
		'''	
	}			
	
	/** 
	 *	Template for Step Tags
	 *	@param tags is the Tags list of the Step
	 *	@param delayTimeTah is the possible DelayTime tag of the Step
	 *	@param probabilitiesTag is the possible Probabilities Tag of the Step
	 * 	@param syncTag is the possible Sync Tag of the Step
	 *	@return the Xtend template for the Step Tags
	 */		
	def String tagsTemplate(EList<PCNTag> tags, PCNDelayTimeTag delayTimeTag, PCNProbabilitiesTag probabilitiesTag, PCNSyncTag syncTag) {		
		return
    	'''
    	«FOR tag : tags»
    		«switch tag.eClass.getName {  			
    			case "PCNNonMonetaryBenefit": "emit NonmonetaryBenefitsTag();"
    			case "PCNNonMonetaryCost": "emit NonmonetaryCostsTag();"
    			case "PCNMonetaryBenefit": "emit MonetaryCompensationsTag();"
    			case "PCNMonetaryCost": "emit MonetaryCostsTag();"
    			case "PCNTextualTag" : '''emit TextTag("«(tag as PCNTextualTag).getTag»");'''
    		}»
    	«ENDFOR»
    	«IF probabilitiesTag !== null »
    		emit ProbabilitiesTag("«probabilitiesTag.getYesProbability»", "«probabilitiesTag.getNoProbability»");
    	«ENDIF»
    	«IF delayTimeTag !== null »
    		emit DelayTimeTag("«delayTimeTag.getDelayTime»");
    	«ENDIF»
    	«IF syncTag !== null »
    		emit SynchronizationTag();
    	«ENDIF»
    	'''		
	}
		
	/** 
	 *	Template for the body of a Standard Step function
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 *	@return the Xtend template for the Standard Step function
	 */	
	def String standardStepTemplate(PCNRegularProcessStep step, int stepId, String action) {
		return 
		'''

		//
		// Functional logic
		//

		emit StepCompleted(msg.sender, "Done: «action»");
		completedStep[«stepId»] = true;
		«IF !(step).getPCNDelayedDependency.isEmpty»

			delayedDependencyInit[«stepId»] = block.timestamp;	
		«ENDIF»
		'''
	}
	
	/** 
	 *	Template for the body of a DoAndWait Step function
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 * 	@param waitingTime is the waiting time introduced for the Step
	 *	@return the Xtend template for the DoAndWait Step function
	 */	
	def String doAndWaitStepTemplate(PCNRegularProcessStep step, int stepId, String action, int waitingTime) {
		return 
		'''

		if (waitInit[«stepId»]==0) {

			//
			// Functional logic
			//

			waitInit[«stepId»] = block.timestamp;
		} else {
			require(block.timestamp >= waitInit[«stepId»] + «waitingTime»,
			"Wait not finished yet");

			emit StepCompleted(msg.sender, "Done: «action»");
			completedStep[«stepId»] = true;
			«IF !(step).getPCNDelayedDependency.isEmpty»

				delayedDependencyInit[«stepId»] = block.timestamp;	
			«ENDIF»
		}
		'''
	}
	
	/** 
	 *	Template for the body of a Innovation Step function
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 *	@return the Xtend template for the Innovation Step function
	 */	
	def String innovationStepTemplate(PCNRegularProcessStep step, int stepId, String action) {
		return 
		'''

		//
		// Functional logic
		//

		emit Innovation();
		emit StepCompleted(msg.sender, "Done: «action»");
		completedStep[«stepId»] = true;
		«IF !(step).getPCNDelayedDependency.isEmpty»

			delayedDependencyInit[«stepId»] = block.timestamp;	
		«ENDIF»
		'''
	}

	/** 
	 *	Template for the body of a Outsourced Step function
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 * 	@param outsource is the outsource address introduced for the Step
	 *	@return the Xtend template for the Outsourced Step function
	 */	
	def String outsourcedStepTemplate(PCNRegularProcessStep step, int stepId, String action, String outsource) {
		return 
		'''

		//
		// Functional logic
		//

		address outsource = «outsource»;
		emit StepCompleted(outsource, "Done: «action»");
		completedStep[«stepId»] = true;
		«IF !(step as PCNRegularProcessStep).getPCNDelayedDependency.isEmpty»

			delayedDependencyInit[«stepId»] = block.timestamp;	
		«ENDIF»
		'''
	}	

	/** 
	 *	Template for the body of a Wait Step function
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 * 	@param waitingTime is the waiting time introduced for the Step
	 *	@return the Xtend template for the Wait Step function
	 */		
	def String waitStepTemplate(PCNRegularProcessStep step, int stepId, String action, int waitingTime) {
		return 
		'''

		if (waitInit[«stepId»]==0) {
			waitInit[«stepId»] = block.timestamp;
		} else {		
			require(block.timestamp >= waitInit[«stepId»] + «waitingTime»,
			"Wait not finished yet");

			emit StepCompleted(msg.sender, "Done: «action»");
			completedStep[«stepId»] = true;
			«IF !(step as PCNRegularProcessStep).getPCNDelayedDependency.isEmpty»

				delayedDependencyInit[«stepId»] = block.timestamp;	
			«ENDIF»
		}
		'''
	}

	/** 
	 *	Template for the body of a Decision Step function
	 *	@param step is the Step itself
	 *	@param stepId is the Step ID
	 *	@param action is the Step action
	 *	@return the Xtend template for the Decision Step function
	 */		
	def String decisionStepTemplate(PCNProcessStepWithTags step, int stepId, String action) {
		return 
		'''

		bool selection;

		//
		// Functional logic using 'selection' variable to decide between
		// the affirmative dependency (variable set to 'true')
		// or the negative dependency (variable set to 'false')
		«IF step.getProbabilitiesTags !== null»
			// Keep in mind the probability of each decision indicated in the Tag event
			// Yes: «step.getProbabilitiesTags.getYesProbability», No: «step.getProbabilitiesTags.getNoProbability»
		«ENDIF»
		//

		if (!selection) {
			decision[«stepId»] = false;
		} else {
			decision[«stepId»] = true;
		}

		emit StepCompleted(msg.sender, "Done: «action»");
		completedStep[«stepId»] = true;
		'''
	}			
}