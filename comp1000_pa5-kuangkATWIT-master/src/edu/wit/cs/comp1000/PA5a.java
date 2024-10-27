package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA5a {

	// TODO: document this method
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Input message: ");
	String message = input.nextLine();
	int length = message.length();
	for (int count = 0; length !=0 ; length--) {
		char letter = message.charAt(count);
	
		if (letter == 'h' || letter == 'H') {
			h();
		}
		else if(letter == 'e' || letter == 'E')  {
			e();
		}
		else if(letter == 'l' || letter == 'L')  {
			l();
		}
		else if(letter == 'o' || letter == 'O')  {
			o();
		}
		else if(letter == 'w' || letter == 'W')  {
			w();
		}
		else if (letter == 'r' || letter == 'R') {
			r();
		}
		else if(letter == 'd' || letter == 'D')  {
			d();
		}
		else if (letter == ' ') {
			 blank();
			 //System.out.println();
		 }
		count++;
	}
	
}

	// ==== LETTERS ====
	public static void d() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf(" *   * %n");
		System.out.printf("  ***  %n");
		System.out.printf("%n");
	}
	
	public static void e() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*  *  *%n");
		System.out.printf("*  *  *%n");
		System.out.printf("*  *  *%n");
		System.out.printf("*  *  *%n");
		System.out.printf("%n");
	}
	
	public static void h() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("   *   %n");
		System.out.printf("   *   %n");
		System.out.printf("   *   %n");
		System.out.printf("*******%n");
		System.out.printf("%n");
	}
	
	public static void l() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*      %n");
		System.out.printf("*      %n");
		System.out.printf("*      %n");
		System.out.printf("*      %n");
		System.out.printf("%n");
	}
	
	public static void o() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf("*******%n");
		System.out.printf("%n");
	}
	
	public static void r() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("   *  *%n");
		System.out.printf("  **  *%n");
		System.out.printf(" * ****%n");
		System.out.printf("*      %n");
		System.out.printf("%n");
	}
	
	public static void w() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*      %n");
		System.out.printf("****   %n");
		System.out.printf("*      %n");
		System.out.printf("*******%n");
		System.out.printf("%n");
	}
	
	public static void blank() {
		System.out.printf("%n%n%n");
	}
	
	// end of code
}
