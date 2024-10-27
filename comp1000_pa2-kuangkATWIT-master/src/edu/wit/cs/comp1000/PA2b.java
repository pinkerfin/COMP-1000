package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// reads 5 whole numbers from the user
		/*
	Enter five whole numbers: -1 1 -2 2 -3
	The sum of the 2 positive numbers: 3
	The sum of the 3 non-positive numbers: -6
	The sum of the 5 numbers: -3
		 **/
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter five whole numbers: ");	
	int num1 = input.nextInt();
	int num2 = input.nextInt();	
	int num3 = input.nextInt();	
	int num4 = input.nextInt();	
	int num5 = input.nextInt();

	// SUM OF POSITIVE NUMBERS
	int posNum = 0;
	double posSum = 0;
	
	if (num1 > 0){
		posSum = num1;
		posNum = 1;
	}
	if (num2 > 0){
		posSum = posSum + num2;
		posNum = posNum + 1;
	}
	if (num3 > 0){
		posSum = posSum + num3;
		posNum = posNum + 1;
	}
	if (num4 > 0){
		posSum = posSum + num4;
		posNum = posNum + 1;
	}
	if (num5 > 0){
		posSum = posSum + num5;
		posNum = posNum + 1;
	}
//	if (posNum == 1) {
//	System.out.print("The sum of the " + posNum + " positive number: " + posSum);
//	} else
//	System.out.print("The sum of the " + posNum + " positive numbers: " + posSum);
	
	if (posNum == 1){
		System.out.print("The sum of the " + posNum); 
		System.out.printf(" positive number: %.0f%n", posSum);
	} else {
	System.out.print("The sum of the " + posNum); 
	System.out.printf(" positive numbers: %.0f%n", posSum);}
	
	
	// SUM OF NON-POSITIVE NUMBERS
	int negNum = 0;
	double negSum = 0;
	
	if (num1 <= 0) {
	negSum = num1;	
	negNum = 1;
	}
	if (num2 <= 0) {
		negSum = negSum + num2;
		negNum = negNum + 1;
	}
	if (num3 <= 0) {
		negSum = negSum + num3;
		negNum = negNum + 1;
	}
	if (num4 <= 0) {
		negSum = negSum + num4;
		negNum = negNum + 1;
	}
	if (num5 <= 0) {
		negSum = negSum + num5;
		negNum = negNum + 1;
	}
	if (negNum == 1) {
		System.out.print("The sum of the " + negNum); 
		System.out.printf(" non-positive number: %.0f%n", negSum);
	} else {
	System.out.print("The sum of the " + negNum); 
	System.out.printf(" non-positive numbers: %.0f%n", negSum);}
	// ALL NUMBER SUM
	double sum = num1+num2+num3+num4+num5;
	System.out.printf("The sum of the 5 numbers: %.0f%n", sum);
	

	// ========================== SUM OF NUMBERS ENDS HERE  ==============================
	// The average of the 2 positive numbers: 1.50
	// The average of the 3 non-positive numbers: -2.00
	// The average of the 5 numbers: -0.60

	//System.out.println(); // spacer
	
	
	if ((posNum > 0.00) || (negNum > 0.00)){
			double avgAll = sum/5;
	double posAvg = posSum/posNum;	
	double negAvg = negSum/negNum;

	
	if (posNum == 1){
		System.out.print("The average of the " + posNum); 
		System.out.printf(" positive number: %.2f%n", posAvg);
	} else if(posNum == 0) {
		System.out.println("The average of the " + posNum + " positive numbers: 0.00");
	}else {
	System.out.print("The average of the " + posNum); 
	System.out.printf(" positive numbers: %.2f%n", posAvg);
	}
	
	
	if (negNum == 1){
		System.out.print("The average of the " + negNum); 
		System.out.printf(" non-positive number: %.2f%n", negAvg);
	} else if(negNum == 0) {
		System.out.println("The average of the " + negNum + " non-positive numbers: 0.00"); 
	}
	else {
	System.out.print("The average of the " + negNum); 
	System.out.printf(" non-positive numbers: %.2f%n", negAvg);	}
	
	System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
	
	
	}
	}
}
