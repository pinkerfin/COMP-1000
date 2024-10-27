package edu.wit.cs.comp1000;
import java.util.Scanner;
//TODO: document this class
public class PA7b {
	/**
	 * Program execution point:
	 * input text via console input,
	 * output counts for each letter
	 * found in the input (case-insensitive)
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		// TODO: write your code here
Scanner input = new Scanner(System.in);
        
        int c[] = new int[26];
                for(int i = 0; i<26; i++) {
                    c[i] = 0;
                }
                String text = "";
                System.out.printf("Enter text: ");
                
                while (input.hasNext()) {
                    text = input.next().toUpperCase();
                    for (int i = 0; i < text.length(); i++) {
                        if (Character.isLetter(text.charAt(i))) {
                            c[text.charAt(i) - 'A'] += 1;
                        }
                    }
                }
                
                
                if(text.isEmpty()) {
                    System.out.println();
                }
                else if(text.charAt(0) < ' ' || text.charAt(0) < '@') {
                    System.out.println();
                }
                else if (text.charAt(0) < 'A' || text.charAt(0) > 'Z') {
                }
                
                for  (int i = 0; i < c.length; i++) {
                    if(c[i]>0) {
                        System.out.printf("%c: %d%n", (char)(i + 'A'), c[i]);
                    }
                }
    }

}
