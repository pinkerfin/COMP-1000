package edu.wit.cs.comp1000;
import java.util.Scanner;

public class LA3a {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double a, b, c;

		System.out.print("Enter three numbers: ");
				a = input.nextDouble();
		 		b = input.nextDouble();
				c = input.nextDouble();
		
				
		System.out.print("Enter operation: ");
		String operation = input.next();
			
				double min = Math.min(Math.min(a,b), c);
				double l1 = Math.abs(a) + Math.abs(b) + Math.abs(c);
				double l2 = Math.sqrt((a * a) + (b * b) + (c * c));
				
				if(operation.equals("min")) {
					System.out.printf("min(%.2f, %.2f, %.2f) = %.2f%n", a, b, c, min);
				}
				
				else if(operation.equals("l1")) {
					System.out.printf("l1(%.2f, %.2f, %.2f) = %.2f%n", a, b, c, l1);
				}
				
				else if(operation.equals("l2")) {
					System.out.printf("l2(%.2f, %.2f, %.2f) = %.2f%n", a, b, c, l2);
				}
				else {
					System.out.println("Invalid operation!");
					System.exit(0);
				}

	}

}
