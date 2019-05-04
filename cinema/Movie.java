package cinema;

public class Movie { // this class has 3 attribute
	String title;
	String Director;
	String rating;
	
	public Movie(String title, String director, String rating) {//Down a constructor
		this.rating = rating;
		this.Director = director;
		this.title = title;
		
	}
	public void setRating(String rating) {
		if(rating.equals("G") || rating.equals("PG") ||rating.equals("PG-13")||rating.equals("R")||rating.equals("NR")){
			this.rating = rating;
		}else {
		  this.rating = "NR";
	}

}
}

// we gonna use getter and setter. its a certain methods we gonna put inside classes and it allows us control how other classes access and interact other class.
//Like middle man
//SETTER use for outside to modify attribute of a class
