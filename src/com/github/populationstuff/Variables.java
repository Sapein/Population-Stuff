package com.github.populationstuff;

import java.util.Scanner;
/*
 * This is just to hold the program's variables and also to handel any functions not related to calulation but simply related to the variables
 * such as the displaying of Variables and setting the amount of time the user wants to simulate. 
 */
public class Variables {
	//This class Mainly holds our variables I may remove this later and merge it with Formulas
	public static int deerPopulation = 10;
	public static int foodAmount = 100; 
	public static int shelterAmount = 20;
	public static int waterAmount = 100;
	public static int offSpring = 0;
	public static int deathDays = 1825;
	public static int totalDays = 0;
	public static int days;
	
	/*
	 * This is to print out the variables, as I do this twice and didn't want to have to rewrite this. 
	 */
	public static void printVariables(){ 
		System.out.println("The amount of Deer in the Wild is " + deerPopulation);
		System.out.println("The amount of Food in the Wild is " + foodAmount);
		System.out.println("The amount of offspring in the wild is " + offSpring);
		System.out.println("The amount of Shelter in the Wild is " + shelterAmount);
		System.out.println("The amount of Water in the Wild is " + waterAmount);
	}
	
	/*
	 * This allows the user to input the amount of time they want simulate (where time is in days).
	 */
	public static void getUserDays(){ 
		System.out.println("How many days do you want to simulate?");
		Scanner scan = new Scanner(System.in);
		days = scan.nextInt();
	}
	
	/*
	 * This is designed to print out the days the user input.  
	 */
	public static void printDays(){
		System.out.println("The Amount of Days to simulate is " + days); 
	}
}
