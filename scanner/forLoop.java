package scanner;

public class forLoop {
	public static void main(String[] args) {
		
		String[] friends = {"Sam", "Tim", "Nam", "Lock", "Sakil"};
		//i use array to store a collection of data in the array data structure
		//String data type , friends is the name of that string.
		
		
		//down i use i = index variable and .length is allow access the total number of data.
		// also here use of for loop
		for(int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
			// here i printing out what is inside the friends and [i] means the inside of that index 
		}
	}

}
     //i++ is incremental index