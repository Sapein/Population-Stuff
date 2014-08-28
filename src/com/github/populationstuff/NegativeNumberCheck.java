package com.github.populationstuff;
//This is just here to prevent negative numbers
public class NegativeNumberCheck {
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
