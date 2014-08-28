package com.github.populationstuff;
/*
 * This allows the resources to regrow.
 */
public class ResourceRegrowth {
	public void foodRegrowth(){
		Variables.foodAmount = Variables.foodAmount + 100;
	}
	public void waterRegen(){
		Variables.waterAmount = Variables.waterAmount + 100;
	}
	public void allResourceRegrowth(){
		waterRegen();
		foodRegrowth();
	}
}
