package edu.wit.cs.comp1000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//TODO: document this class
public class PA8a {
	
	/**
	 * Error to output when a file cannot be opened.
	 */
	static final String E_NOT_FOUND = "Error! File not found!";
	
	/**
	 * Reads all integers in input scanner,
	 * outputs positive ones to output each on
	 * its own line
	 * 
	 * @param input input source
	 * @param output output destination 
	 */
	public static void process(Scanner input, PrintWriter output) {
		while (input.hasNextInt()) {
			int number = input.nextInt();
			if(number > 0) {
				output.println(number);
			}
	}

			
	}

	/**
	 * Program execution point:
	 * input an input file name and an output file name,
	 * for each positive number in the input file 
	 * print on its own line to the output file
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		String inputFileName;
		String outputFileName;
		
		// prompts the user for a file name
		System.out.print("Enter the name of the input file: ");
		inputFileName = input.nextLine();
		
		System.out.print("Enter the name of the output file: ");
		outputFileName = input.nextLine();

		input.close(); //closes the scanner
		
		try(
			Scanner fin = new Scanner(new File(inputFileName)); //searches for file with the user input
			PrintWriter fout = new PrintWriter(new File(outputFileName)); // creates the new output file
			){
			process(fin, fout); //prints out the method
		}	
		
		catch(FileNotFoundException ex) {
			System.out.println(E_NOT_FOUND);
			System.exit(0);
		}

	}
	
		

}
