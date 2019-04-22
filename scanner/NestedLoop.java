package scanner;

public class NestedLoop {
	public static void main(String[] args ) {
		for(int i = 0; i < 3; i++) {  //1st for loop the variable i also datatype is int.
			for(int j = 1; j<4; j++) { //2nd for loop we name the variable j also datatype is int
				System.out.println("i= " + i + ", j= " + j + "");}
		}
	}

}
// nested loop is a special character in java which allows to write a loop inside another loop