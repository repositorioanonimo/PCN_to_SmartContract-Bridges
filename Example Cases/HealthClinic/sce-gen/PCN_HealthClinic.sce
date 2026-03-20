// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.2 <0.9.0;

contract PCN_HealthClinic {
	
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
		entity[0] = Entity(1, "Health Clinic", 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);
		entity[1] = Entity(2, "Patient", 0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2);
		entity[2] = Entity(3, "Insurance Company", 0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db);
		entity[3] = Entity(4, "Pharmacy", 0x78731D3Ca6b7E34aC0F824c42a7cC18A495cabaB);
		
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
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "procure lab tools");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: procure lab tools");
		completedStep[1] = true;
		
		delayedDependencyInit[1] = block.timestamp;	
	}
	
	function step2() public domain(0)
	standardDependency(6, 2)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "submit payment claim");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: submit payment claim");
		completedStep[2] = true;
	}
	
	function step3() public domain(0)
	delayedDependency(1, 3, 600)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "clean lab tools");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: clean lab tools");
		completedStep[3] = true;
	}
	
	function step4() public domain(0)
	delayedDependency(1, 4, 780)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 1, "train staff on tools");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: train staff on tools");
		completedStep[4] = true;
		
		delayedDependencyInit[4] = block.timestamp;	
	}
	
	function step5() public domain(0)
	standardDependency(3, 5)
	standardDependency(8, 5)
	delayedDependency(4, 5, 300)
	{  	    		
		emit StepInfo("PCNDoAndWaitStep", "rightSurrogateInteractions", 0, "analyze blood");
		
		if (waitInit[5]==0) {
		
			//
			// Functional logic
			//
		
			waitInit[5] = block.timestamp;
		} else {
			require(block.timestamp >= waitInit[5] + 3600,
			"Wait not finished yet");
		
			emit StepCompleted(msg.sender, "Done: analyze blood");
			completedStep[5] = true;
		}
	}
	
	function step6() public domain(0)
	standardDependency(7, 6)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 1, "call in prescription");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: call in prescription");
		completedStep[6] = true;
	}
	
	function step7() public domain(0)
	standardDependency(5, 7)
	{  	    		
		emit StepInfo("PCNDoAndWaitStep", "rightDirectInteractions", 0, "prescribe mediction");
		
		if (waitInit[7]==0) {
		
			//
			// Functional logic
			//
		
			waitInit[7] = block.timestamp;
		} else {
			require(block.timestamp >= waitInit[7] + 120,
			"Wait not finished yet");
		
			emit StepCompleted(msg.sender, "Done: prescribe mediction");
			completedStep[7] = true;
		}
	}
	
	function step8() public domain(0)
	standardDependency(9, 8)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "take blood");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: take blood");
		completedStep[8] = true;
	}
	
	function step9() public domain(1)
	standardDependency(10, 9)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "discuss symptoms");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: discuss symptoms");
		completedStep[9] = true;
	}
	
	function step10() public domain(1)
	standardDependency(11, 10)
	{  	    		
		emit StepInfo("PCNWaitStep", "leftSurrogateInteractions", 0, "wait");
		emit NonmonetaryBenefitsTag();
		
		if (waitInit[10]==0) {
			waitInit[10] = block.timestamp;
		} else {		
			require(block.timestamp >= waitInit[10] + 1500,
			"Wait not finished yet");
		
			emit StepCompleted(msg.sender, "Done: wait");
			completedStep[10] = true;
		}
	}
	
	function step11() public domain(1)
	standardDependency(13, 11)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 1, "check-in at kiosk");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: check-in at kiosk");
		completedStep[11] = true;
	}
	
	function step12() public domain(1)
	standardDependency(0, 12)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "feel weak");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: feel weak");
		completedStep[12] = true;
	}
	
	function step13() public domain(1)
	standardDependency(12, 13)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 1, "drive to clinic");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: drive to clinic");
		completedStep[13] = true;
	}
	
	function step14() public domain(1)
	standardDependency(7, 14)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 2, "drive to pharmacy");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: drive to pharmacy");
		completedStep[14] = true;
	}
	
	function step15() public domain(1)
	standardDependency(18, 15)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 3, "take medication");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: take medication");
		completedStep[15] = true;
	}
	
	function step16() public domain(1)
	standardDependency(15, 16)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 4, "feel better");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: feel better");
		completedStep[16] = true;
	}
	
	function step17() public domain(1)
	standardDependency(14, 17)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "show ID");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: show ID");
		completedStep[17] = true;
	}
	
	function step18() public domain(1)
	standardDependency(28, 18)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "give payment");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: give payment");
		completedStep[18] = true;
	}
	
	function step19() public domain(2)
	standardDependency(20, 19)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "pay covered amount");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: pay covered amount");
		completedStep[19] = true;
	}
	
	function step20() public domain(2)
	standardDependency(2, 20)
	delayedDependency(21, 20, 1800)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 1, "review claim");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: review claim");
		completedStep[20] = true;
	}
	
	function step21() public domain(2)
	standardDependency(0, 21)
	{  	    		
		emit StepInfo("PCNOutsourcedStep", "centerIndependentInteractionsActivities", 0, "develop payment schedule");
		
		//
		// Functional logic
		//
		
		address outsource = 0x617F2E2fD72FD9D5503197092aC168c91465E7f2;
		emit StepCompleted(outsource, "Done: develop payment schedule");
		completedStep[21] = true;
		
		delayedDependencyInit[21] = block.timestamp;	
	}
	
	function step22() public domain(2)
	standardDependency(24, 22)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "process payment");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: process payment");
		completedStep[22] = true;
	}
	
	function step23() public domain(2)
	delayedDependency(21, 23, 1800)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "establish medication coverage agreement");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: establish medication coverage agreement");
		completedStep[23] = true;
	}
	
	function step24() public domain(3)
	standardDependency(26, 24)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "submit payment claim");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: submit payment claim");
		completedStep[24] = true;
	}
	
	function step25() public domain(3)
	standardDependency(27, 25)
	standardDependency(6, 25)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "fill prescription");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: fill prescription");
		completedStep[25] = true;
	}
	
	function step26() public domain(3)
	standardDependency(25, 26)
	standardDependency(23, 26)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 1, "check coverage");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: check coverage");
		completedStep[26] = true;
	}
	
	function step27() public domain(3)
	standardDependency(17, 27)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "check ID");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: check ID");
		completedStep[27] = true;
	}
	
	function step28() public domain(3)
	standardDependency(26, 28)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "tell copay amount");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: tell copay amount");
		completedStep[28] = true;
	}
}
