package scanner;

public class Methods {
	public static void main(String []args ) {
		
		//public static void main(String []args )-- is a method/function in java 
		//System.out.println("Hello Sakil"); //example
		
		
		String myName = "Shahim";
		sayHi("Sakil", 27);
		
		//System.out.println("Hello Sam"); //example
		//java execute line by line 
		//
	}
	// Different method start after the 1st curly bracket
	public static void sayHi(String name, int Age ) {
		//This is a second method
		//sayHi is a name of method
		//we are using parameter
		
		System.out.println("Hello " + name + " you are " + Age + ""); // use of parameter
	}

}
