package edu.wit.cs.comp1000;
import java.util.Scanner;
public class PA7a {
	/**
	 * Reads all values from the provided scanner
	 * into the supplied array (up to its size)
	 * and returns the number of integers read
	 * 
	 * @param input input source
	 * @param nums destination for read integers
	 * @return number of integers read
	 */
	public static int readIntoArray(Scanner input, int[] nums) {
		int count = 0;
		while(input.hasNextInt() && count < 100) {
		nums [count] = input.nextInt();
		count++;
		}
		return count;
	}
	
	/**
	 * Prints to the screen the average of the supplied array,
	 * up to the supplied size, and all integers in the array, 
	 * again up to the supplied size, that are larger than the average
	 * 
	 * @param nums array of numbers
	 * @param size number of valid elements
	 */
	public static void printAboveAverage(int[] nums, int size) {
		// TODO: write your code here
		int sum  = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + nums[i];
		}
		
		// finds the average or leaves it as 0
		double avg =  0;
		if (size > 0) {
			avg = sum /(double)size;
		}
		System.out.printf("Average: %.2f%n", avg);
		
		// loops second time and checks every element if it is above the avg
		System.out.print("Values above average: ");
		boolean hasAboveAverage = false;
		String output = "";
		for (int i = 0; i < size; i++) {
			if(nums[i] > avg) {
				hasAboveAverage = true;
				output +="nums["+ i + "]=" + nums[i] + ", ";
			}
		}
		
		if(!hasAboveAverage) {
		System.out.println("none");	
		}else {
			System.out.println(output.substring(0, output.length() - 2));
		}
		}
		
	/**
	 * Program execution point:
	 * input a sequence of integers (up to 100),
	 * output average of integers and those over the average
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		int [] nums = new int [100]; // 100 integers max
		System.out.print("Enter up to 100 integers: "); // prompts for inputs
		
		
		int count = readIntoArray(input, nums);
		printAboveAverage(nums, count);
		
	}
	
}