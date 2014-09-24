package com.github.populationstuff;
//This is just here to prevent negative numbers
public class NegativeNumberCheck {
	/*
	 * Simply checks to see if there are any negative numbers and fixes it
	 */
	public void checkForNegativeNumbers(){
		if(Variables.deerPopulation < 0){
			Variables.deerPopulation = 0;
		}
		if(Variables.foodAmount < 0){
			Variables.foodAmount = 0;
		}
		if(Variables.waterAmount < 0){
			Variables.waterAmount = 0;
		}
	}
}
