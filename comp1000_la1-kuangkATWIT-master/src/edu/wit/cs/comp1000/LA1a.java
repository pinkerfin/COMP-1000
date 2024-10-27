package edu.wit.cs.comp1000;
import java.util.Scanner;
public class LA1a {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	double one, two, three, four, five, sum, mean;
	
	System.out.print("Enter five numbers: ");
	one = input.nextDouble();
	two = input.nextDouble();
	three = input.nextDouble();
	four = input.nextDouble();
	five =	input.nextDouble();
	
	sum = one + two + three + four + five;
	mean = sum/5;
	
	System.out.printf("Sum: %.2f", sum);
	System.out.printf("%nMean: %.2f" , mean);	

	
	// differences
	one = one-mean;
	two = two-mean;
	three = three-mean;
	four= four-mean;
	five= five-mean;
	
	// square
	one = Math.pow(one, 2);
	two = Math.pow(two, 2);
	three= Math.pow(three, 2);
	four= Math.pow(four, 2);
	five= Math.pow(five, 2);
	
	double population = (one + two + three + four + five)/5;
	population = Math.sqrt(population);
	
	System.out.printf("%nPopulation Standard Deviation: %.2f%n", population);	
	
		
		
		
		
		
		
	}

}
