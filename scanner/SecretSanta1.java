package scanner;

import java.util.Scanner;

public class SecretSanta1 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);//use of Scanner class for to get information like double, string,int
		String SecretSanta ="shahim";
		String guess ="";
		int guessCount = 0;            //these are variable for perform the java code
		int guessLimit= 1;
		boolean outOfGuesses = false;  //also used boolean for outofguess result
		
		
		//down i use while loop which is !guess means not guess 
		//.equal is a funtion to state the equal in java.
		while(!guess.equals(SecretSanta) && !outOfGuesses) {
			if(guessCount < guessLimit) {//another if statement guessCount < guessLimit then print these..
				System.out.print("Enter a name");
				guess = keyboardInput.nextLine();
				guessCount++;
			
			}else {outOfGuesses = true;
			}
			
			System.out.print("Enter a name: ");
			guess = keyboardInput.nextLine();
			guessCount++;
			
			
		} if(outOfGuesses) {
		System.out.println("You lose");
		}
		else {
			System.out.println("You win");
		
		
		
		
	}
	}
}
