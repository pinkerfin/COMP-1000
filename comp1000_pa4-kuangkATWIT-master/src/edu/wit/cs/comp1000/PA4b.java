package edu.wit.cs.comp1000;

import java.util.Random;
import java.util.Scanner;
//TODO: document this class
public class PA4b {

	// TODO: document this method
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////
		// DO NOT CHANGE IN FINAL SUBMISSION
		//////////////////////////////////////////////////////////////////////////////
		
		Long seed;
		if (args.length != 1) {
			seed = null; // you can temporarily change this to assist in debugging
			             // the value must end in L, such as 1070L
		} else {
			seed = Long.valueOf(args[0]);
		}
		
		// Gets a random number between 1 and 100
		// Use the target variable as the correct answer for guessing
		Random random;
		if (seed == null) {
			random = new Random();
		} else {
			random = new Random(seed);
		}
		int target = (Math.abs(random.nextInt()) % 100) + 1;
		
		//////////////////////////////////////////////////////////////////////////////
		//The above code generate a 'target' value for you to match in your own code
		//You don't need to create your own target value
		//////////////////////////////////////////////////////////////////////////////
		
		
		// TODO: delete this line before attempting unit tests or submitting work
	//	System.out.printf("%d%n", target);
		
		// TODO: write your code here		
		
		Scanner input = new Scanner(System.in);
		int guess;
		
		do {
		System.out.print("Enter your guess (between 1 and 100): ");
		guess = input.nextInt();
			if (guess < 1 || guess > 100){
				System.out.println("Invalid guess, try again!");
			}
		else if (guess == target) {
				System.out.println("You win!");
			}
		else if (guess > target) {
				System.out.println("Too high!");
			}
			
			 else if (guess < target) {
				System.out.println("Too low!");
			}


			 }
		while (guess < target || guess > target);{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
