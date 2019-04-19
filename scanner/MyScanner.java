package scanner;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[]args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = keyboardInput.nextLine();
		
		System.out.print("Enter Your Age:");
		int Age = keyboardInput.nextInt();
		System.out.println("Hey " + name + " ,You are " + Age + " years old ");
		
		
	
	}

}
