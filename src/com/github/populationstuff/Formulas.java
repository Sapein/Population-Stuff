package com.github.populationstuff;
/*
 *  This class is what does the Formulas and calcuations, I mainly put this here to make the Main class more compact.
 */
public class Formulas {
	
	//This simply loads up what is needed to run the calculations
	static DeerPopulationCalculations deerPopulationCalc = new DeerPopulationCalculations(); 
	static ResourceComsumption Consumption = new ResourceComsumption(); 
	static ResourceEffects Effects = new ResourceEffects();
	static NegativeNumberCheck Check = new NegativeNumberCheck();
	static ResourceRegrowth Regrowth = new ResourceRegrowth();
	static EndingChecks EndingChecks = new EndingChecks();
	
	
	/*
	 * This does the Calculations of the Program, this is in all actuality the heart of the program, and is where most of the data is put
	 */
	public static void doCalculations(){
		while(Variables.totalDays < Variables.days){ 
			EndingChecks.endSimulationCheck(); 
			deerPopulationCalc.deerPopulationCalculations();
			EndingChecks.endSimulationCheck(); 
			Check.checkForNegativeNumbers(); 
			Consumption.FoodConsumption(); 
			Consumption.WaterConsumption(); 
			Regrowth.foodRegrowth();  
			Regrowth.waterRegen();
			Check.checkForNegativeNumbers();
			Effects.lackOfFood(); 
			Effects.lackOfWater(); 
			EndingChecks.endSimulationCheck();
			Check.checkForNegativeNumbers(); 
			System.out.println(Variables.totalDays);
			Variables.totalDays++;
		}
	}
	
	/*
	 * Simply Outputs the Results
	 */
	public static void finalOutput(){ 
		System.out.println(" "); 
		System.out.println("The end of the " + Variables.days + " are up, these are the results"); 
		Variables.printVariables(); 
		System.out.println("Thank-you for Participating"); 
	}
	
}
