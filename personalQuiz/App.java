package personalQuiz;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	//bellow i use 2 question
	//i save the datatype as string and name as a1
	String a1 = "What is the capital of USA?\n"
			+ "(a)NY\n (b)NJ\n (c)DC";
	String a2 = "What is the color of  egg\n"
			+ "(a)RED\n (b)ORANGE\n (c)WHITE\n";
	
	Quiz []Questions = { // create a array of question
			new Quiz(a1,"c"),
			new Quiz (a2,"c")
	};
	taketest(Questions); // name this method as taketest
}
	// bellow i create new method , this method has 1 parameter call quiz and has array od quesitons

	public static void taketest(Quiz [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in); //this scanner method for user input
		
		//bellow i use for loop 
		//its looping through all the quiz question 
		
	
		for(int i = 0; i <questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].Answer)) {
				score++;
			}
			
		}
		System.out.println("You got " + score + " / " +  questions.length);
		
	}
	
}

