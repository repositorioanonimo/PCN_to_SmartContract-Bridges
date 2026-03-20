// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.2 <0.9.0;

contract PCN_Deliveroo {
	
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
		entity[0] = Entity(1, "Deliveroo", 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);
		entity[1] = Entity(2, "Customer", 0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2);
		entity[2] = Entity(3, "Restaurant", 0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db);
		entity[3] = Entity(4, "Delivery Man", 0x78731D3Ca6b7E34aC0F824c42a7cC18A495cabaB);
		
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
	standardDependency(4, 1)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Order food");
		emit MonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Order food");
		completedStep[1] = true;
	}
	
	function step2() public domain(0)
	standardDependency(9, 2)
	{  	    		
		emit StepInfo("PCNDecisionStep", "centerIndependentInteractionsActivities", 0, "Available zip zone?");
		emit ProbabilitiesTag("80%", "20%");
		
		bool selection;
		
		//
		// Functional logic using 'selection' variable to decide between
		// the affirmative dependency (variable set to 'true')
		// or the negative dependency (variable set to 'false')
		// Keep in mind the probability of each decision indicated in the Tag event
		// Yes: 80%, No: 20%
		//
		
		if (!selection) {
			decision[2] = false;
		} else {
			decision[2] = true;
		}
		
		emit StepCompleted(msg.sender, "Done: Available zip zone?");
		completedStep[2] = true;
	}
	
	function step3() public domain(0)
	negativeDependency(2, 3)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 1, "Communicate to customer");
		emit NonmonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Communicate to customer");
		completedStep[3] = true;
	}
	
	function step4() public domain(0)
	standardDependency(11, 4)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 2, "Process order");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Process order");
		completedStep[4] = true;
	}
	
	function step5() public domain(0)
	standardDependency(4, 5)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "Order delivery");
		emit MonetaryCostsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Order delivery");
		completedStep[5] = true;
	}
	
	function step6() public domain(0)
	standardDependency(8, 6)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 1, "Send available food");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Send available food");
		completedStep[6] = true;
	}
	
	function step7() public domain(0)
	positiveDependency(2, 7)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 2, "Send available restaurants");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Send available restaurants");
		completedStep[7] = true;
	}
	
	function step8() public domain(1)
	standardDependency(7, 8)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Select restaurant");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Select restaurant");
		completedStep[8] = true;
	}
	
	function step9() public domain(1)
	standardDependency(12, 9)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 1, "Write address");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Write address");
		completedStep[9] = true;
	}
	
	function step10() public domain(1)
	standardDependency(6, 10)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 2, "Select food");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Select food");
		completedStep[10] = true;
	}
	
	function step11() public domain(1)
	standardDependency(10, 11)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 3, "Pay");
		emit MonetaryCompensationsTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Pay");
		completedStep[11] = true;
	}
	
	function step12() public domain(1)
	standardDependency(0, 12)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Open Deliveroo App");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Open Deliveroo App");
		completedStep[12] = true;
	}
	
	function step13() public domain(1)
	standardDependency(11, 13)
	{  	    		
		emit StepInfo("PCNWaitStep", "centerIndependentInteractionsActivities", 1, "Wait");
		emit DelayTimeTag("30 min");
		
		if (waitInit[13]==0) {
			waitInit[13] = block.timestamp;
		} else {		
			require(block.timestamp >= waitInit[13] + 1800,
			"Wait not finished yet");
		
			emit StepCompleted(msg.sender, "Done: Wait");
			completedStep[13] = true;
		}
	}
	
	function step14() public domain(1)
	standardDependency(13, 14)
	standardDependency(22, 14)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Pick up");
		emit SynchronizationTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Pick up");
		completedStep[14] = true;
	}
	
	function step15() public domain(2)
	standardDependency(1, 15)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Receive order");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Receive order");
		completedStep[15] = true;
	}
	
	function step16() public domain(2)
	standardDependency(15, 16)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Cook food");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Cook food");
		completedStep[16] = true;
		
		delayedDependencyInit[16] = block.timestamp;	
	}
	
	function step17() public domain(2)
	delayedDependency(16, 17, 600)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Deliver order");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Deliver order");
		completedStep[17] = true;
	}
	
	function step18() public domain(3)
	standardDependency(17, 18)
	delayedDependency(20, 18, 900)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "Pick up food");
		emit SynchronizationTag();
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Pick up food");
		completedStep[18] = true;
	}
	
	function step19() public domain(3)
	standardDependency(5, 19)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Receive order");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Receive order");
		completedStep[19] = true;
	}
	
	function step20() public domain(3)
	standardDependency(19, 20)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Go to restaurant");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Go to restaurant");
		completedStep[20] = true;
		
		delayedDependencyInit[20] = block.timestamp;	
	}
	
	function step21() public domain(3)
	standardDependency(18, 21)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 1, "Go to destination");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Go to destination");
		completedStep[21] = true;
		
		delayedDependencyInit[21] = block.timestamp;	
	}
	
	function step22() public domain(3)
	delayedDependency(21, 22, 1200)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Deliver order");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Deliver order");
		completedStep[22] = true;
	}
}
