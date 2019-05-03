package scanner;

public class Book {
	String title;
	String author;
	int pages;
	String language;
    
	//below we created a constructor 
	public Book(String title, String author, int pages, String language) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.language = language;
	}
}

//Constructor is allow us to give our object a default information when we created.