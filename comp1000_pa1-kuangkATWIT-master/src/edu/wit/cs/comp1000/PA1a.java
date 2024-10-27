package edu.wit.cs.comp1000;
import java.util.Scanner;
/*
Your program must compute the total number of inches by converting each
of the three inputs into inches and summing them all together. 
Finally, print out the total length in inches.
Recall that 1 yard = 3 feet, and 1 foot = 12 inches.

*/

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
	Scanner input = new Scanner(System.in);
		int y, i, f, total;
		
		System.out.print("Enter number of yards: ");
		y = input.nextInt();
		
		System.out.print("Enter number of feet: ");
		f = input.nextInt();
		
		System.out.print("Enter number of inches: ");
		i = input.nextInt();
		
		total = i + (f*12 + y*36);
		
		System.out.println("Total number of inches: "+ total);
		
	}

}
