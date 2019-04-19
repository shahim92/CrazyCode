package scanner;

public class IfStatementAndComparison {
	public static void main(String[] args ) {
		System.out.println(Max(500, 50, 6));
	}
	// start of new method
	public static int Max(int num1, int num2, int num3) {
		//here we use data type int value by comparison
		//return type method
		
		if(num1 >= num2 && num2 >= num3) {
			return num1;	
		} else if(num2 >= num1 && num2 >= num3) {
		return num2;
		} else {
			return num3;
		}
		
	}


}
