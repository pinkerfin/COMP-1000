package edu.wit.cs.comp1000;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PA8b {
	/**
	 * Program execution point:
	 * input an input file name,
	 * output the smallest and largest
	 * integers found in the file (or invalid
	 * if not only integers in the file)
	 * 
	 * @param args command-line arguments (ignored)
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompts for the file name
		System.out.print("Enter the name of the input file: ");
		String inputFileName = input.nextLine();
		
		input.close(); //closes the scanner
		
		// reads into the file
		try(Scanner fin = new Scanner(new File(inputFileName))){
		File file = new File(inputFileName);
			
			int x;
			int min = 1;
			int max = 0;
			
			while (fin.hasNext()) {
				x = fin.nextInt();
				
				if(x > max) {
					max = x;
				}
				
				if(x < max) {
					min = x;
				}
			}
			
			if (file.length() == 0) {
				System.out.println("File: invalid");
			} else {
				System.out.printf("File: [%d, %d]%n", min, max);
			}
			
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("File: invalid");
			System.exit(0);
		}
		catch(InputMismatchException ex) {
			System.out.println("File: invalid");
			System.exit(0);
		}
		catch(NoSuchElementException ex) {
			System.out.println("File: invalid");
			System.exit(0);
		}
		
		
	} // end of main

} // end of class