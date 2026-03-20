// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.2 <0.9.0;

contract TransportationProvider {
	
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
		entity[0] = Entity(1, "Transportation Provider", 0x67b747001CBfE198eBA5D62b0613955C479Aca87);
		entity[1] = Entity(2, "Client", 0x57d3483c75dFC61820e1b55902896Edee3C90cAd);
		
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
	standardDependency(3, 1)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "Transport patient");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Transport patient");
		completedStep[1] = true;
		
		delayedDependencyInit[1] = block.timestamp;	
	}
	
	function step2() public domain(0)
	standardDependency(4, 2)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Provide schedule");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Provide schedule");
		completedStep[2] = true;
	}
	
	function step3() public domain(1)
	standardDependency(5, 3)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "Look up schedule");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Look up schedule");
		completedStep[3] = true;
	}
	
	function step4() public domain(1)
	delayedDependency(1, 4, 900)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Board transport");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Board transport");
		completedStep[4] = true;
	}
	
	function step5() public domain(1)
	standardDependency(0, 5)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Look up transport");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Look up transport");
		completedStep[5] = true;
	}
}
