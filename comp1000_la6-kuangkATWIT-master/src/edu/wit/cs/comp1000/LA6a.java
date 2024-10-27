package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA6a {
	
	/**
	 * Error to show if value is not positive.
	 */
	static final String E_VALUE = "Value must be positive.";
	
	/**
	 * Error to show if guess is not positive.
	 */
	static final String E_GUESS = "Guess must be positive.";
	
	/**
	 * Error to show if error tolerance is not positive.
	 */
	static final String E_TOLERANCE = "Error tolerance must be positive.";
	
	/**
	 * Computes the absolute value of an input
	 * 
	 * @param value input value
	 * @return absolute value of input
	 */
	public static double absoluteValue(double value) {
		if (value <0) {
			return value*-1;
		}
		else {
			return value;
		}
	}
	
	/**
	 * Computes the square root of a value via
	 * the Babylonian method:
	 * 
	 * 0) lastGuess := initialGuess
	 * 1) Loop
	 *  a) nextGuess := (lastGuess + value/lastGuess) / 2
	 *  b) difference := | lastGuess - nextGuess |
	 *  c) lastGuess := nextGuess
	 *  d) if difference < errorTolerance, quit loop
	 * 2) return nextGuess
	 * 
	 * @param x value for which to take the square root
	 * @param initialGuess initial guess as to the answer
	 * @param err error tolerance
	 * @return square root
	 */
	public static double squareRoot(double x, double initialGuess, double errTolerance) {
		double lastGuess = initialGuess;
		double nextGuess = 0;
		double difference = absoluteValue(lastGuess-nextGuess);
		
		while (difference > errTolerance) {
			nextGuess = ((lastGuess + (x/lastGuess))/2);
			difference = absoluteValue(lastGuess - nextGuess);
			lastGuess = nextGuess;
			
		}
		return nextGuess;
	}
	/**
	 * Program execution point:
	 * inputs value, initial guess, tolerance,
	 * outputs sqrt(value) via the Babylonian method
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		final Scanner kbInput = new Scanner(System.in); // scanner is here

		double val, errorTolerance, initialGuess;
		
		do {
			System.out.printf("Enter a value for which to take the square root: ");
			val = kbInput.nextDouble();
			if (val <= 0) {
				System.out.printf("%s%n", E_VALUE);
			}
		} while (val <= 0);
			do {
			System.out.print("Enter an initial guess as to the answer: ");
			initialGuess = kbInput.nextDouble();
			if (initialGuess <= 0) {
					System.out.println(E_GUESS);
			}
		} while (initialGuess <= 0);
			do {
				System.out.print("Enter an error tolerance for the calculation: ");
					errorTolerance = kbInput.nextDouble();
					if (errorTolerance <= 0) {
						System.out.println(E_TOLERANCE);
					}
				} while (errorTolerance <= 0); 

				System.out.printf("sqrt(%.5f) ~ %.5f%n", val, squareRoot(val,initialGuess,errorTolerance));
			
			}
	}