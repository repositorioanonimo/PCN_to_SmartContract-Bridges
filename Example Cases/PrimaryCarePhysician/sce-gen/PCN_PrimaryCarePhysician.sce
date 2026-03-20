// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.2 <0.9.0;

contract PCN_PrimaryCarePhysician {
	
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
		entity[0] = Entity(1, "Primary Care Physician", 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);
		entity[1] = Entity(2, "Patient", 0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2);
		entity[2] = Entity(3, "Care Coordinator", 0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db);
		entity[3] = Entity(4, "Healthcare Specialist", 0x78731D3Ca6b7E34aC0F824c42a7cC18A495cabaB);
		entity[4] = Entity(5, "Transportation Provider", 0x617F2E2fD72FD9D5503197092aC168c91465E7f2);
		
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
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Notify CC");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Notify CC");
		completedStep[1] = true;
	}
	
	function step2() public domain(0)
	negativeDependency(4, 2)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "Process prescription");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Process prescription");
		completedStep[2] = true;
	}
	
	function step3() public domain(0)
	standardDependency(5, 3)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 1, "Process referral");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Process referral");
		completedStep[3] = true;
	}
	
	function step4() public domain(0)
	standardDependency(6, 4)
	{  	    		
		emit StepInfo("PCNDecisionStep", "rightDirectInteractions", 0, "Requires specialist?");
		
		bool selection;
		
		//
		// Functional logic using 'selection' variable to decide between
		// the affirmative dependency (variable set to 'true')
		// or the negative dependency (variable set to 'false')
		//
		
		if (!selection) {
			decision[4] = false;
		} else {
			decision[4] = true;
		}
		
		emit StepCompleted(msg.sender, "Done: Requires specialist?");
		completedStep[4] = true;
	}
	
	function step5() public domain(0)
	positiveDependency(4, 5)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "Provide referral");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Provide referral");
		completedStep[5] = true;
	}
	
	function step6() public domain(1)
	standardDependency(7, 6)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "Discuss symptoms");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Discuss symptoms");
		completedStep[6] = true;
	}
	
	function step7() public domain(1)
	standardDependency(8, 7)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Travel to clinic");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Travel to clinic");
		completedStep[7] = true;
	}
	
	function step8() public domain(1)
	standardDependency(0, 8)
	{  	    		
		emit StepInfo("PCNStandardStep", "centerIndependentInteractionsActivities", 0, "Health problem");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Health problem");
		completedStep[8] = true;
	}
	
	function step9() public domain(1)
	standardDependency(26, 9)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Discuss symptoms with specialist");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Discuss symptoms with specialist");
		completedStep[9] = true;
	}
	
	function step10() public domain(1)
	standardDependency(9, 10)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "Provide test data");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Provide test data");
		completedStep[10] = true;
	}
	
	function step11() public domain(1)
	standardDependency(10, 11)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 2, "Receive treatment");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Receive treatment");
		completedStep[11] = true;
	}
	
	function step12() public domain(2)
	standardDependency(21, 12)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "Follow-up with Patient");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Follow-up with Patient");
		completedStep[12] = true;
	}
	
	function step13() public domain(2)
	standardDependency(1, 13)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Review referral");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Review referral");
		completedStep[13] = true;
	}
	
	function step14() public domain(2)
	standardDependency(12, 14)
	{  	    		
		emit StepInfo("PCNDecisionStep", "leftSurrogateInteractions", 1, "Need PCP follow-up?");
		
		bool selection;
		
		//
		// Functional logic using 'selection' variable to decide between
		// the affirmative dependency (variable set to 'true')
		// or the negative dependency (variable set to 'false')
		//
		
		if (!selection) {
			decision[14] = false;
		} else {
			decision[14] = true;
		}
		
		emit StepCompleted(msg.sender, "Done: Need PCP follow-up?");
		completedStep[14] = true;
	}
	
	function step15() public domain(2)
	positiveDependency(14, 15)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 2, "Schedule Patient follow-up visit with PCP");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Schedule Patient follow-up visit with PCP");
		completedStep[15] = true;
	}
	
	function step16() public domain(2)
	standardDependency(18, 16)
	{  	    		
		emit StepInfo("PCNDecisionStep", "rightSurrogateInteractions", 0, "Transport need?");
		
		bool selection;
		
		//
		// Functional logic using 'selection' variable to decide between
		// the affirmative dependency (variable set to 'true')
		// or the negative dependency (variable set to 'false')
		//
		
		if (!selection) {
			decision[16] = false;
		} else {
			decision[16] = true;
		}
		
		emit StepCompleted(msg.sender, "Done: Transport need?");
		completedStep[16] = true;
	}
	
	function step17() public domain(2)
	standardDependency(0, 17)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Schedule patient with specialist");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Schedule patient with specialist");
		completedStep[17] = true;
	}
	
	function step18() public domain(2)
	standardDependency(20, 18)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "Discuss with patient");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Discuss with patient");
		completedStep[18] = true;
	}
	
	function step19() public domain(2)
	positiveDependency(16, 19)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 2, "Schedule transportation with patient");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Schedule transportation with patient");
		completedStep[19] = true;
		
		delayedDependencyInit[19] = block.timestamp;	
	}
	
	function step20() public domain(3)
	standardDependency(17, 20)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftDirectInteractions", 0, "Review patient situation");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Review patient situation");
		completedStep[20] = true;
	}
	
	function step21() public domain(3)
	standardDependency(22, 21)
	{  	    		
		emit StepInfo("PCNStandardStep", "leftSurrogateInteractions", 0, "Notify CC");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Notify CC");
		completedStep[21] = true;
	}
	
	function step22() public domain(3)
	standardDependency(24, 22)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "Analyze test data");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Analyze test data");
		completedStep[22] = true;
	}
	
	function step23() public domain(3)
	standardDependency(26, 23)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Discuss symptoms");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Discuss symptoms");
		completedStep[23] = true;
	}
	
	function step24() public domain(3)
	standardDependency(23, 24)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 1, "Gather test data");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Gather test data");
		completedStep[24] = true;
	}
	
	function step25() public domain(3)
	standardDependency(22, 25)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 2, "Provide treatment");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Provide treatment");
		completedStep[25] = true;
	}
	
	function step26() public domain(4)
	standardDependency(27, 26)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightSurrogateInteractions", 0, "Transport patient to specialist");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Transport patient to specialist");
		completedStep[26] = true;
	}
	
	function step27() public domain(4)
	delayedDependency(19, 27, 600)
	{  	    		
		emit StepInfo("PCNStandardStep", "rightDirectInteractions", 0, "Pick up patient");
		
		//
		// Functional logic
		//
		
		emit StepCompleted(msg.sender, "Done: Pick up patient");
		completedStep[27] = true;
	}
}
