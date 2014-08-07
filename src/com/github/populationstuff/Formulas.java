package com.github.populationstuff;

public class Formulas {
	public static void doCalculations(){ //This stores all of the Calculations and Formulas that I am using, these will become split up overtime
		while(Variables.totalDays != Variables.days)
		{
			Variables.foodAmount = Variables.foodAmount + 100;
			Variables.waterAmount = Variables.waterAmount + 100;
			Variables.foodAmount = Variables.foodAmount - Variables.deerPopulation + 2;
			if(Variables.offSpring > 0){
				Variables.foodAmount = Variables.foodAmount - Variables.offSpring;
			}
			Variables.waterAmount = Variables.waterAmount - (Variables.deerPopulation/2);
			Variables.waterAmount = Variables.waterAmount - Variables.deerPopulation * 2;
			if(Variables.deerPopulation >= 2){
				Variables.offSpring = Variables.offSpring + 5;
			}
			if(Variables.foodAmount <= 0){
				if(Variables.deerPopulation >= 10){
					Variables.deerPopulation = Variables.deerPopulation - 10;
					Variables.foodAmount = Variables.foodAmount + 10;
				}
				if(Variables.deerPopulation < 10){
					Variables.foodAmount = Variables.foodAmount + 10;
					Variables.deerPopulation = Variables.deerPopulation - 2;
				}
				if(Variables.offSpring >= 2){
					Variables.offSpring = Variables.offSpring - 2;
					Variables.foodAmount = Variables.foodAmount + 5;
				}
				if(Variables.offSpring < 2){
					Variables.offSpring = Variables.offSpring - 1;
					Variables.foodAmount = Variables.foodAmount + 5;
				}
			}
			if(Variables.totalDays == 4){
				Variables.deerPopulation = Variables.deerPopulation + Variables.offSpring/2; 
			}
			if(Variables.waterAmount <= 0){
				if(Variables.deerPopulation > 0){
				Variables.deerPopulation = Variables.deerPopulation - 8;
				Variables.waterAmount = Variables.waterAmount + 4;
				}
				else if(Variables.deerPopulation == 0){
					Variables.waterAmount = Variables.waterAmount + 2;
				}
			}
			if(Variables.waterAmount <= 0){
				if(Variables.deerPopulation == 0){
					Variables.waterAmount = Variables.waterAmount + 3;
				}
				else if(Variables.deerPopulation > 0){
					Variables.deerPopulation = Variables.deerPopulation - 3;
					Variables.waterAmount = Variables.waterAmount +3;
				}
			}
			if(Variables.totalDays == Variables.deathDays){
				if(Variables.deerPopulation >= 5){
				Variables.deerPopulation = Variables.deerPopulation - 5; 
				 Variables.deathDays =  Variables.deathDays*3;
				}
				else if(Variables.deerPopulation < 5){
					Variables.deerPopulation = Variables.deerPopulation - Variables.deerPopulation;
					 Variables.deathDays = Variables.deathDays*3;
				}
				else if(Variables.deerPopulation == 0){
					 Variables.deathDays =  Variables.deathDays*3;
				}
			}
			if(Variables.deerPopulation == 0 && Variables.offSpring == 0){
				Variables.totalDays = Variables.days;
				System.out.println("Deer Died");
			}
			if(Variables.deerPopulation == 0){
				System.out.println("Adults Died on day " + Variables.totalDays);
			}
			if(Variables.deerPopulation > 0 || Variables.offSpring > 0){
				Variables.totalDays = ++Variables.totalDays;
			}
			if(Variables.deerPopulation < 0){
				Variables.deerPopulation = 0;
			}
			if(Variables.foodAmount < 0){
				Variables.foodAmount = 0;
			}
			if(Variables.waterAmount < 0){
				Variables.waterAmount = 0;
			}
			if(Variables.waterAmount < 0){
				Variables.waterAmount = 0;
			}
		}
	}
	public static void finalOutput(){ //This is the Final Output. 
		System.out.println(" ");
		System.out.println("The end of the " + Variables.days + " are up, these are the results");
		Variables.printVariables();
		System.out.println("Thank-you for Participating");
	}
	
}
