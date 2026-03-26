// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.2 <0.9.0;

contract PCN_PizzaRestaurant {
	
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
		entity[0] = Entity(1, "Pizza restaurant", 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);
		entity[1] = Entity(2, "Hungry customer", 0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2);
		
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
	
	function step1() public domain(0)
	standardDependency(0, 1)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Forecast and purchase ingredients");
		emit MonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Forecast and purchase ingredients");
		completedStep[1] = true;
	}
	
	function step2() public domain(0)
	standardDependency(0, 2)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 1, "Supply cooking stuff");
		emit MonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Supply cooking stuff");
		completedStep[2] = true;
	}
	
	function step3() public domain(0)
	standardDependency(0, 3)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "Process order");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Process order");
		completedStep[3] = true;
	}
	
	function step4() public domain(0)
	standardDependency(1, 4)
	standardDependency(3, 4)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 1, "Assemble pizza");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Assemble pizza");
		completedStep[4] = true;
	}
	
	function step5() public domain(0)
	standardDependency(2, 5)
	standardDependency(4, 5)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 2, "Cook pizza");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Cook pizza");
		completedStep[5] = true;
	}
	
	function step6() public domain(0)
	standardDependency(5, 6)
	standardDependency(9, 6)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Deliver pizza");
		emit NonmonetaryBenefitsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Deliver pizza");
		completedStep[6] = true;
	}
	
	function step7() public domain(1)
	standardDependency(6, 7)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "Pay pizza");
		emit MonetaryCompensationsTag();
		emit TextTag("Cashier desk");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Pay pizza");
		completedStep[7] = true;
	}
	
	function step8() public domain(1)
	standardDependency(10, 8)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Place online order");
		emit TextTag("Website");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Place online order");
		completedStep[8] = true;
	}
	
	function step9() public domain(1)
	standardDependency(8, 9)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 1, "Travel to restaurant");
		emit NonmonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Travel to restaurant");
		completedStep[9] = true;
	}
	
	function step10() public domain(1)
	standardDependency(0, 10)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Need pizza");
		emit NonmonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Need pizza");
		completedStep[10] = true;
	}
	
	function step11() public domain(1)
	standardDependency(7, 11)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 1, "Travel home");
		emit NonmonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Travel home");
		completedStep[11] = true;
	}
	
	function step12() public domain(1)
	standardDependency(11, 12)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 2, "Eat pizza");
		emit NonmonetaryBenefitsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Eat pizza");
		completedStep[12] = true;
	}
}
