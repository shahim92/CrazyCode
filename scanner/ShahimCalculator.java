package scanner;

import java.util.Scanner;

public class ShahimCalculator {

public static void main(String [] args) {
	Scanner keyboardInput =new Scanner(System.in);
	// i use Scanner to get input from the users
	//keyboardInput is the name of the scanner
	
	System.out.println("Enter a number: ");
	double num1 = keyboardInput.nextDouble();
	// i use double data types for storing num1
	
	System.out.println("Enter a Operator: ");
	String Op = keyboardInput.next();
	// here i use op as an operator(ex +,-,*,/)
	// i use string for storing data types
	
	System.out.println("Enter another number: ");
	double num2 = keyboardInput.nextDouble();
	
	// here i use if statement to do the math
	//.equals is a special string to add 
	if (Op.equals("+")) {
		System.out.println(num1 + num2);
		
	} else if (Op.equals("-")) {
		System.out.println(num1 - num2);
		
	} else if (Op.equals("/")) {
		System.out.println(num1 / num2);
		
	} else if (Op.equals("*")) {
		System.out.println(num1 * num2);
	} else {
		System.out.println("Invalid Input");
	}
	
	
	
	
	
}

}
