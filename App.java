package scanner;

public class App {
	public static void main (String [] args) {
		
		/*Book book1 = new Book();
		book1.title = "Harray porter";
		book1.author= "JK Rowling";
		book1.pages= 500;
		book1.language = "English";
		
		Book book2 = new Book();
		book2.title = "Bangladesh View";
		book2.author= "Shahim Ahmad";
		book2.pages= 400;
		book2.language = "English";
		System.out.println(book2.author);
		*/
		
		
		//Use of constructor:
		Book book1 = new Book("Harray porter","JK Rowling",500,"English");
		System.out.println(book1.pages);
		// we can create a lots of book or information like this constructor.
	}

}
