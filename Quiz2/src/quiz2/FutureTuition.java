package quiz2;

import java.util.Scanner;

public class FutureTuition {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int years = 1;
		
		// Prompt user to enter the current tuition
		System.out.println("Please enter the current tuition: ");
		double tuition = input.nextDouble();
		
		// Prompt user to enter the percent increase
		System.out.println("Please enter the percent increase: ");
		double increase = input.nextDouble() / 100;
		
		
		// Let total equal the tuition paid in year 1
		double total = tuition;
		
		// Increase total by the next year's tuition for every year spent in college
		while (years < 4) {
			total += tuition * Math.pow((1 + increase), years);
			years ++; 
		}
		
		// Print the amount spent on tuition for four years of college
		System.out.printf("The total cost of 4 years of college is $%4.2f", total);
		
		}
		
		
		
		
}
