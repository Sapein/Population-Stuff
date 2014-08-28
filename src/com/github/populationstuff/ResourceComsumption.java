package com.github.populationstuff;
/*
 * This simply is about the resource consumption using my 'formula' I plan on either changing this to work with Dynamic Deer,
 * and/or balancing this out. 
 */
public class ResourceComsumption { //This is the resource Consumption
	public void FoodConsumption(){
		Variables.foodAmount = Variables.foodAmount - Variables.deerPopulation + 2;
		if(Variables.offSpring > 0){
			Variables.foodAmount = Variables.foodAmount - Variables.offSpring;
		}
	}
	public void WaterConsumption(){
		Variables.waterAmount = Variables.waterAmount - (Variables.deerPopulation/2);
	}
}
