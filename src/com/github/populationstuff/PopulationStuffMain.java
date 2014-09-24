//This project was created By Sapein sometime in July.

package com.github.populationstuff; 

/*
 * This loads the program up, this also calls the other classes, to set the variables correctly in the case of User Input, to printing the 
 * variables, to make the calculations occur and to output the final line, along with a short top menu thing. 
 */
public class PopulationStuffMain {
	public static void main(String[] args){
		System.out.println("Deer Population Simulator V1.1 Alpha      By: Sapein"); 
		Variables.getUserDays();
		Variables.printDays(); 
		Variables.printVariables(); 
		Formulas.doCalculations(); 
		Formulas.finalOutput(); 
	}
	

}
