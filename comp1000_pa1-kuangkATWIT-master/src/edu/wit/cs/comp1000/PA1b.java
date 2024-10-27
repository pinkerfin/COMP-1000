package edu.wit.cs.comp1000;
import java.util.Scanner;

/*
Write a program to do the reverse of Problem a. It prompts the user for a length in inches, then converts
that total number of inches into yards, feet, and inches. 
Note that you do not convert the number of inches separately into yards, then feet, then inches. 
Instead the program must calculate how many yards there are in the given number of inches, then convert the remaining inches into feet, and finally have the left over
inches directly. 

For example, if the user enters 50 for the total number of inches, your program should
compute that that is equal to 1 yard, 1 foot, and 2 inches. The following represents a run of the program
using this sample input (again, pay very careful attention to spacing, spelling, and capitalization).

Enter number of inches: 50
Yards: 1
Feet: 1
Inches: 2

1 yard: 36 inches
1 feet: 12 inches


 */


// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		int inch, yard, feet, left;
		
		System.out.print("Enter number of inches: ");
		inch = input.nextInt();	// 50
		
		yard = inch/36; // 1
		left = inch % 36; // remainder of 14
		System.out.println("Yards: " + yard);
		
		feet = left/12; // 1
		left %= 12; // left = left % 12 remainder of 2
		
		System.out.println("Feet: " + feet);
		System.out.println("Inches: " + left);
		
		
	}

}
