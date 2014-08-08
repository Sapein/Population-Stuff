package com.github.populationstuff;

public class EndingChecks {

	public void endSimulationCheck(){
		if(Variables.deerPopulation == 0 && Variables.offSpring == 0){
			System.out.println("Deer Died");
			Variables.totalDays = Variables.days;
		}
		if(Variables.deerPopulation > 0 || Variables.offSpring > 0){
			Variables.totalDays = Variables.totalDays + 0;
		}
	}
}
