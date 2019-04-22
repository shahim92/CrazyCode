package scanner;   
import java.util.Scanner;             //use of exception in java


public class TryCatchBlocks {
	public static void main(String[] args) {
		
		
		Scanner keyboardInput = new Scanner(System.in); // Scanner is user input class in java.
		System.out.print("Enter a Number");
		
		
		
		
		try {  // by using try catch statement we catch the exception
			Double num = keyboardInput.nextDouble();
			System.out.println(num);
			
		} catch(Exception e) { 
			// here Exception is class in java for most part it works as a data types in java
			// e is the name of that Exception.
			System.out.println("Invalid Input");
		}
		
		
		
		
	}

}


