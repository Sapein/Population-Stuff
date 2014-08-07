//This project was created By Sapein sometime in July.
package com.github.populationstuff; //This is the package

public class PopulationStuffMain { //This is the main class 
	public static void main(String[] args){
		System.out.println("Deer Population Simulator V1.0 Alpha      By: Sapein"); //Simply Displays my name and what the program is
		Variables.getUserDays(); //This is for getting the amount of days the user wants to use
		Variables.printDays(); //This is for prnting the amount of days
		Variables.printVariables(); //This is for printing the variables
		Formulas.doCalculations(); //this does the calculations
		Formulas.finalOutput(); //this displays the final output
	}
	

}
