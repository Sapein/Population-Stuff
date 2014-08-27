package com.github.populationstuff;

public class EndingChecks {

	public static void endSimulationCheck(){
		if(Variables.deerPopulation == 0 && Variables.offSpring == 0){
			System.out.println("Deer Died");
			Variables.totalDays = Variables.days;
		}
	}
}
