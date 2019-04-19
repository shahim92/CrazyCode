package scanner;

public class IfStatements {
	public static void main(String [] args ) {
		
	
	boolean isMale = true;
	boolean isTall = false;
	
	// && -and operator
	// || - or operator
	// ! -is not operator
	
	if(isMale && isTall) {
		System.out.println("You are a tall Male");
	}
	
	else if(isMale && !isTall) {
		System.out.println("You are a short male");
	}
		
	else if(!isMale && isTall) {
		System.out.println("You are not a  Male, not tall");
	}
	else {
	
	
		System.out.println("You are not Male, not tall");
		
	}

}
}
