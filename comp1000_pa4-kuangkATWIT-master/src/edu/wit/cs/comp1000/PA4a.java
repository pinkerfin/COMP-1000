package edu.wit.cs.comp1000;
import java.util.Scanner;
//TODO: document this class
public class PA4a {

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
	
	Scanner input = new Scanner(System.in);	
	System.out.print("Enter the current price of the item: $");
		double price = input.nextDouble();
		System.out.print("Enter the number of years: ");
		int year = input.nextInt();
		System.out.print("Enter the inflation rate as a percentage: ");
		double percent = input.nextDouble();
		percent = percent/100 ;
		

		int i = 1;
		while (i <= year) {
		
		price = price*(1+percent);
		i = i + 1;
		}
		

		if (year < 0) {
			System.out.print("The number of years must be at least 0!");
			System.out.println();
			System.exit(0);
		}
		else if (price < 0) {
			System.out.print("The current price must be at least 0!");
			System.out.println();
			System.exit(0);
		}
		else if(percent < 0) {
			System.out.print("The inflation rate must be at least 0!");
			System.out.println();
			System.exit(0);
		}
		else if (year == 1) {
		System.out.print("After "+ year +" year, the price will be ");
		System.out.printf("$%.2f", price);
		System.out.println();
		}
		else {
		System.out.print("After "+ year +" years, the price will be ");
		System.out.printf("$%.2f", price);
		System.out.println();
		}
		
	}

} 
