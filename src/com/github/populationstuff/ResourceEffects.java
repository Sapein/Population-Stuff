package com.github.populationstuff;
//Right now this class only manages when the resources drop below a certain point(mainly with food and water at this time).
public class ResourceEffects {
	public void lackOfFood(){
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
	}
	
	public void lackOfWater(){
		if(Variables.waterAmount <= 0){
			if(Variables.deerPopulation > 0){
				Variables.deerPopulation = Variables.deerPopulation - 8;
				Variables.waterAmount = Variables.waterAmount + 4;
			}
			
			else if(Variables.deerPopulation == 0){
				Variables.waterAmount = Variables.waterAmount + 3;
			}
			else if(Variables.deerPopulation > 0){
				Variables.deerPopulation = Variables.deerPopulation - 2;
				Variables.waterAmount = Variables.waterAmount + 2;
			}
		}
	}
}
