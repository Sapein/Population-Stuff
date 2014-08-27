package com.github.populationstuff;

public class Formulas {
	//This simply loads up what is needed to run the calculations
	static DeerPopulationCalculations deerPopulationCalc = new DeerPopulationCalculations(); 
	//static EndingChecks checkEnd = new EndingChecks(); 
	static ResourceComsumption Consumption = new ResourceComsumption(); 
	static ResourceEffects Effects = new ResourceEffects();
	static NegativeNumberCheck Check = new NegativeNumberCheck();
	static ResourceRegrowth Regrowth = new ResourceRegrowth();
	public static void doCalculations(){ //This does the Calculations
	
		while(Variables.totalDays < Variables.days){ //This is the Beggining of the Calculations
			EndingChecks.endSimulationCheck(); //checks to see if we should end the simulation
			deerPopulationCalc.deerPopulationCalculations(); //Does the Calculations for Deer Population
			EndingChecks.endSimulationCheck(); //Checks to see if we should end
			Check.checkForNegativeNumbers(); //corrects any possible negative numbers we have
			Consumption.FoodConsumption(); //Changes the amount of Food
			Consumption.WaterConsumption(); //Changes the amount of water
			Regrowth.foodRegrowth();  //Regrows food 
			Regrowth.waterRegen(); //Rainfall occurs
			Check.checkForNegativeNumbers(); //Changes any negative numbers to 0
			Effects.lackOfFood(); //if we have 0 food then this runs
			Effects.lackOfWater(); //if we have 0 water then this runs
			EndingChecks.endSimulationCheck(); //checks to see if the simulation should end
			Check.checkForNegativeNumbers(); //Fizes any negative numbers we have
			System.out.println(Variables.totalDays);
			Variables.totalDays++;
		}
	}
	public static void finalOutput(){ //This is the Final Output. 
		System.out.println(" "); //creates a blank line
		System.out.println("The end of the " + Variables.days + " are up, these are the results"); //This is printed out
		Variables.printVariables(); //prints the variables
		System.out.println("Thank-you for Participating"); //Displays this
	}
	
}
