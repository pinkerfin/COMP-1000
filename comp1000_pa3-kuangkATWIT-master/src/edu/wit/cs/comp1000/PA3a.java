package edu.wit.cs.comp1000;
import java.util.Scanner;

/*
1. Get the three side lengths from the user (which might have decimal values): a, b, c.

2. Check to ensure that the sides are valid for a triangle. Importantly, the sum of the lengths of any 
two sides must be larger than the length of the third side (you must check all three sides this way).

3. Calculate the semiperimeter (s)

4. Calculate the area: 

FORMAT:
Enter the length of side a: 
"" b
"" c
The area is 6.00
*/	

//TODO: document this class
public class PA3a {
	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
	double a, b, c;	
	double semi, area;
	//	
		System.out.print("Enter the length of side a: ");
		a = input.nextDouble();
		System.out.print("Enter the length of side b: ");
		b = input.nextDouble();
		System.out.print("Enter the length of side c: ");
		c = input.nextDouble();
	
		// OUTPUT
		if ((a < 0) || (b < 0) || (c < 0) ){ 
			System.out.println("Side lengths must all be positive");
			System.exit(0);
		}
		else if (a > b + c){
			System.out.println("Side a is too long");
			System.exit(0);
		}else if (b > a + c) {
			System.out.println("Side b is too long");
			System.exit(0);
		}
		else if (a + b < c) {
		System.out.println("Side c is too long");
		System.exit(0);
	}
		else {
			 semi = (a+b+c)/2;
			 area = semi*(semi - a)*(semi - b)*(semi - c);
			 area = Math.sqrt(area);
			 
			System.out.printf("The area is %.2f", area);
		}
			System.out.println();	
		

	
		
	}

}
