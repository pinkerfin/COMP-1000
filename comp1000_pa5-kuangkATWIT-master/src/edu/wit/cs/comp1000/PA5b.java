package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA5b {

	// TODO: document this method
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String x;
	double average;
	
	while(true) {
		System.out.print("Enter a stream of non-negative numbers (negative when finished): ");
		
		average = prevNum(scan);
		
		System.out.printf("The average is: %.2f%nDo you want to compute another average (y/n)? ", average);
		x = scan.next();
		if(x.equals("y")) {
			
		}
		if(x.equals("n")) {
			break;
		}
		// CAPITAL
		else if(x.equals("Y")) {
			
		}
		else if(x.equals("N")) {
			break;
		}
	}
}	
	
	// METHOD
	public static double prevNum(Scanner input) {
		double average1;
		int count1 = 0;
		double sum1 = 0;
		
		while(true) {
			double dummy = input.nextDouble();
			if (dummy<0) {
				break;
			}
		else {
				sum1 = sum1 + dummy;
			}
			count1++;
		}
		
		average1 = sum1/count1;	
		if (count1 == 0) {
			average1 = 0;
		}
		return average1;
	}
}
