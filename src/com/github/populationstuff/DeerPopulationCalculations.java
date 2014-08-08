package com.github.populationstuff;

public class DeerPopulationCalculations {
	public void deerPopulationCalculations(){
		int growthDays = 365;
		if(Variables.deerPopulation >= 2){ //checks to see the amount of deer is greater than or equal to 2
			Variables.offSpring = Variables.offSpring + 5; //creates 5 offspring
		}
		if(Variables.totalDays == growthDays){ //checks to see the total amount of days passed
			Variables.deerPopulation = Variables.deerPopulation + Variables.offSpring/2; //turns Children into adults(Adults are Deer which have reached Sexual Maturity)
			growthDays = growthDays + 365;
		}
		if(Variables.totalDays == Variables.deathDays){ //checks to see if deer should die off naturally during this day
			if(Variables.deerPopulation >= 10){ //checks to see if Deer Population is greater than or equal to 10
			Variables.deerPopulation = Variables.deerPopulation - 10; //If DeerPopulation is Greater than or equal to 10, then we loose 10 deer
			 Variables.deathDays =  Variables.deathDays + 1825; //Sets the next time a death occurs naturally 1825 days(5 years) away
			}
			else if(Variables.deerPopulation < 10){ //Checks to see if we have less than 10 deer
				Variables.deerPopulation = Variables.deerPopulation - Variables.deerPopulation; //If Deer Population is less than 10 we just kill all of them off
				Variables.deathDays = Variables.deathDays + 1825; //sets next death day 1825 (5 years) away
			}
			else if(Variables.deerPopulation == 0){ //checks to see if the deers are dead
				Variables.deathDays =  Variables.deathDays + 1825; //sets death day 1825(5 years) away
			}
		}
	}
}
