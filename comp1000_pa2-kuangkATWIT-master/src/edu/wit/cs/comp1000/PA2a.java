package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
	// Write a code that solves the quadratic function
		Scanner input = new Scanner(System.in);
	
		// variables
		double a, b, c, d;
		
		// enter integers
		System.out.print("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// discriminate calculation
		d = b*b - 4.00*a*c;

		// if and else
		
		if (d > 0.00) {
			double root1 = (-b + Math.pow(d, 0.50)) / (2.00*a);
			double root2 = (-b - Math.pow(d, 0.50)) / (2.00*a);
			System.out.printf("Roots: %.2f, %.2f%n", root2 , root1);
		} else if (d == 0.00) {
			double root1 = -b/(2.00*a);
			System.out.printf("Root: %.2f%n" , root1);
		} else{
			System.out.println("Roots: imaginary");
		}
		
		
		
	}

}
