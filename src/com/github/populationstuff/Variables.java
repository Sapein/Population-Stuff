package com.github.populationstuff;

import java.util.Scanner;
/*
 * This contains most of the variables for the program, I may move this later, but for now it's staying here.
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
	
	public static void printVariables(){ //Simply prints out the starting Variables
		System.out.println("The amount of Deer in the Wild is " + deerPopulation);
		System.out.println("The amount of Food in the Wild is " + foodAmount);
		System.out.println("The amount of offspring in the wild is " + offSpring);
		System.out.println("The amount of Shelter in the Wild is " + shelterAmount);
		System.out.println("The amount of Water in the Wild is " + waterAmount);
	}
	public static void getUserDays(){ //This is how we get how many days a user wants to simulate
		System.out.println("How many days do you want to simulate?");
		Scanner scan = new Scanner(System.in);
		days = scan.nextInt();
	}
	public static void printDays(){
		System.out.println("The Amount of Days to simulate is " + days); // This simply displays the amount of days(I did this due to the fact I re-use printVariables in Forumals.java
	}
}
