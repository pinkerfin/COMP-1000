package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA6a {
	/**
	 * Error to output if year is not positive
	 */
	static final String E_YEAR = "The year must be positive!";
	
	/**
	 * Error to output if the day is not between 0 and 6
	 */
	static final String E_DAY = "The day of January 1st must be between 0 and 6!";
	
	/**
	 * Determines if an input is a leap year
	 * 
	 * @param year year in question
	 * @return true if a leap year
	 */
	public static boolean isLeapYear(int year) {
		
		//if is leap year
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
			
		}if (year % 100 == 0 && year % 400 == 0) {
			return true;
		
		//if not leap year
		}else {
			return false;
		
		}
	}
	
	/**
	 * Outputs a month to the console
	 * 
	 * @param month title
	 * @param startDay 0=Sunday ... 6=Saturday
	 * @param numDays number of days in the month
	 * @return day of the week after the last day of the month
	 */
	public static int printMonth(String month, int startDay, int numDays) {
	
		//variables
		int i;
		int count = 0;

		//prints the month
		System.out.println(month);
		System.out.print(" ");
		
		
		//initial spaces
		for (i = 0; i < startDay; i = i + 1 ) {
		
		if(startDay == 0) {
			System.out.print("");
		}else {
			System.out.print("   ");
			count = count + 1;
		}
		}
		
		//print days of month
		for (i = 1; i <= numDays;i = i + 1) {
			
			if (i < 10) {
				System.out.print(" " + i);
				
			}else {
				System.out.print(i);
			}
			
			count = count + 1;
			
			if (count == 7) {
				count = 0;
				System.out.println();
				
				if(i < numDays) {
				System.out.print(" ");
				}
				
			}else {
				if(i < numDays)
				System.out.print(" ");
			}
			
		}
		
		//if month doesn't end on Saturday
		if(count > 0) {
		
		System.out.println();
		System.out.println();
		
		//if month ends on Saturday
		}else {
			System.out.println();
		}
		
		return (count); 
		
	}

	/**
	 * Program execution point:
	 * input year, day of the week (0-6) of January 1
	 * output calendar for that year
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//prompts for the year
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		//prompts for the start day
		System.out.print("Enter the day of the week of January 1st (0=Sunday, 1=Monday, ... 6=Saturday): ");
		int start_day = input.nextInt();
		
		//if year LESS than 0, print error
		if (year < 0) {
			System.out.println(E_YEAR);
			System.exit(1);
		}
		
		//if day is GREATER than 0 or LESS than 6, print error
		if(start_day < 0 || start_day > 6) {
			System.out.println(E_DAY);
			System.exit(1);
		}
		
		//variables
		String array_month;
		int array_numdays;
		
		//months and last day of months arrays
		// starts at 0
		String Month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int last_days[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		//print calendar for year (loop)
		for(int i = 0; i < Month.length && i < last_days.length; i = i + 1) {
		
			array_month = Month[i];
			array_numdays = last_days[i];
		
		if (isLeapYear(year) == true) {
			last_days[1] = 29;
		}
		// if NOT leap year, Feb only has 28 days
		else {
			last_days[1] = 28; 
		}
	
		// prints the calendar
		start_day = printMonth(array_month, start_day, array_numdays);
		
		}
	
	
	}

}