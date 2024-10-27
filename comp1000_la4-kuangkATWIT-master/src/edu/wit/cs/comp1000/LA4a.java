package edu.wit.cs.comp1000;
import java.util.Scanner;
public class LA4a {
	
	/**
	 * Error to output if either input is not positive
	 */
	static final String E_POSITIVE = "Inputs must both be positive.";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = input.nextInt(); 
		
		System.out.print("Enter b: ");
		int b = input.nextInt();
		 
		if (a <= 0) {
			System.out.println(E_POSITIVE); 
			System.exit(0);
		}
		if(b <= 0) {
			System.out.println(E_POSITIVE); 
			System.exit(0);
		}
		System.out.printf("The GCD of %d and %d is %d%n", a, b, gcd(a, b));

	}
	
	/**
	 * Returns the greatest common denominator (gcd) of two positive integers
	 * 
	 * @param num1 integer 1
	 * @param num2 integer 2
	 * @return gcd of integers 1 and 2
	 */
	public static int gcd(int num1, int num2) {
	if (num2 == 0) return num1;
		return gcd(num2, num1%num2);
		
	}

}
