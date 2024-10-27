package edu.wit.cs.comp1000;
import java.util.Scanner;
public class LA2a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double s;
		
		System.out.print("Enter number of sides: ");
		 n = input.nextInt();	// number of sides	

		System.out.print("Enter side length: ");
		 s = input.nextDouble(); //side length
		
		 
		 
		 // END CODE IF
		if (n<3) {
		System.out.println("A polygon must have at least 3 sides.");
		System.exit(0);
		}
		else if(s<=0) {
			System.out.println("Side length must be positive.");
			System.exit(0);
		}
		
		// CALCULATIONS
		 double area = ((s*s)*(n)) / (4 * (Math.tan(Math.PI/n)));
		 double peri = (n*s);
		 double angle= (180-(360.0/n));
		 
		 //OUTPUT
		 System.out.printf("Area: %.3f%n", area);
		 System.out.printf("Perimeter: %.3f%n", peri);
		 System.out.printf("Interior Angle: %.3f degrees%n", angle);


	}
	
}
