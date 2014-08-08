package com.github.populationstuff;

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
