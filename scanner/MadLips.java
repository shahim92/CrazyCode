package scanner;

import java.util.Scanner;

public class MadLips {
	public static void main(String [] args ) {
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a color:");
		String color = keyboardInput.nextLine();
		
		System.out.print("Enter a pluralNoun:");
		String pluralNoun = keyboardInput.nextLine();
		
		System.out.print("Enter a celebrity:");
		String celebrity = keyboardInput.nextLine();
		
		
		
		System.out.println("Roses are " + color + "," + pluralNoun + " are blue, I love " + celebrity + " ");
		
	}

}
