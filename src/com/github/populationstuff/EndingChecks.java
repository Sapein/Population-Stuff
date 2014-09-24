package com.github.populationstuff;
/*
 * This is simply checking to see if both deer points have died off and as such will end the Simulation early as there would be no point in 
 * continuing. This also used to check if the maximum anout of days had passed, but it was bugged so I removed it.  
 */
public class EndingChecks {
	/*
	 * This is simply for ending checks.
	 */
	public void endSimulationCheck(){
		if(Variables.deerPopulation == 0 && Variables.offSpring == 0){
			System.out.println("Deer Died");
			Variables.totalDays = Variables. days;
		}
	}
}
