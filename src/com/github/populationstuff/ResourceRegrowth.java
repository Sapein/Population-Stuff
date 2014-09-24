package com.github.populationstuff;
/*
 * This allows the resources to regrow.
 */
public class ResourceRegrowth {
	/* 
	 *  This simply Reqrows food. 
	 */
	public void foodRegrowth(){
		Variables.foodAmount = Variables.foodAmount + 100;
	}
	
	/*
	 * Simply Regens Water
	 */
	public void waterRegen(){
		Variables.waterAmount = Variables.waterAmount + 100;
	}

}
