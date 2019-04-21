package scanner;

public class SwitchStatements {
	//Switch statement is Special type of if statement
	//using Switch we can compair different values

 public static void main(String[] args) {
	 System.out.println(getDayName(6));
	 //getdayName is my variable which is String
	 //Also DayNum is a integer variable
	 //i type return statement (return dayName); at the end of the method
 }
 
 public static String getDayName(int dayNum) {
	 String dayName = "";
	 
	 switch(dayNum) {
	      case 0: dayName = "Sunday"; // i put a case name 0 and dayName 
	            break; //break; means its gonna end the switch statement.
	      case 1: dayName = "Monday";
                break;
	      case 2: dayName = "Tuesday";
                break;
	      case 3: dayName = "Wednesday";
                break;
	      case 4: dayName = "Thursday";
                break;
	      case 5: dayName = "Friday";
                break;
	      case 6: dayName = "Satarday";
                break;
          default: dayName = "Invalid dayname";// i use a default statement for none of the cases are true 
                break;
 }
	 return dayName;
 //see the top section where this return statement came from.
}

}