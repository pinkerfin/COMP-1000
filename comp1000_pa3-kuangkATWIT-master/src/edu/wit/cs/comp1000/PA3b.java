package edu.wit.cs.comp1000;
import java.util.Scanner;
public class PA3b {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	int month, day;	
	System.out.print("Enter your birth month (1-12): ");	
	month = input.nextInt();
	System.out.print("Enter your birth day (1-31): ");	
	day = input.nextInt();	
	// end of user input	

	if ((month < 1 || month > 12)) {
		System.out.println("Month must be between 1 and 12!");
	}
		
	if ((day < 1 || day > 31)) {
		System.out.println("Day must be between 1 and 31!");}
	

	
	else if ((day>=21 && month == 3) || (day<= 19 && month == 4)){ 
		System.out.println("You are an Aries!");
		System.out.println("Look behind you.");
	}
	else if ((day>=20 && month == 4) || (day<= 20 && month == 5)){ 
		System.out.println("You are a Taurus!");
		System.out.println("You will get blown up into chunks");
		if (month == 4 && day == 26) {
			System.out.print("omg twinsies");
		}
	}
	else if ((day>=21 && month == 5) || (day<= 21 && month == 6)){ 
		System.out.println("You are a Gemini!");
		System.out.println("Tomorrow you will see the light, my friend.");
	}
	else if ((day>=22 && month == 6) || (day<= 22 && month == 7)){ 
		System.out.println("You are a Cancer!");
		System.out.println("I hate you!");
	}
	else if ((day>=23 && month == 7) || (day<= 22 && month == 8)){ 
		System.out.println("You are a Leo!");
		System.out.println("rawr means i love you in XD");
	}
	else if ((day>=23 && month == 8) || (day<= 22 && month == 9)){ 
		System.out.println("You are a Virgo!");
		System.out.println("dp you listen to weezer?");
	}
	else if ((day>=23 && month == 9) || (day<= 22 && month == 10)){ 
		System.out.println("You are a Libra!");
		System.out.println("The evil cure be like Friday I'm in hate");
	}
	else if ((day>=23 && month == 10) || (day<= 21 && month == 11)){ 
		System.out.println("You are a Scorpio!");
		System.out.println("evil");
	}
	else if ((day>=22 && month == 11) || (day<= 21 && month == 12)){ 
		System.out.println("You are a Sagittarius!");
		System.out.println("Follow the gnome behind your house.");
	}
	else if ((day>=22 && month == 12) || (day<= 19 && month == 1)){ 
		System.out.println("You are a Capricorn!");
		System.out.println("The kid is not my son");
		if (month == 12 && day == 22) {
			System.out.print("Heyyyyy Caleboo! xoxo");
		}
	}
	else if ((day>=20 && month == 1) || (day<= 18 && month == 2)){ 
		System.out.println("You are an Aquarius!");
		System.out.println("just like my grandmama fr");
	}
	else if ((day>=19 && month == 2) || (day<= 20 && month == 3)){ 
		System.out.println("You are a Pisces!");
		System.out.println("MY GLUB GLUB");
	}

	
	// END OF CODE 	
	}
}
