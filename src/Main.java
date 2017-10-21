import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String month = "";
		
		System.out.print("Enter the month: ");
		month = s.next();
		
		//the string call the method to transform to lower case and than cuts the string to get only the first three letters
		month = month.toLowerCase();
		month = month.substring(0, 3);
		
		//if statements to decide which month is		
		if(month.equals("jan")) {
			System.out.println("January!");
		}
		
		else if(month.equals("feb")) {
			System.out.println("February!");
		}
		
		else if(month.equals("mar")) {
			System.out.println("March!");
		}
		
		else if(month.equals("apr")) {
			System.out.println("April!");
		}
		
		else if(month.equals("may")) {
			System.out.println("May!");
		}
		
		else if(month.equals("jun")) {
			System.out.println("June!");
		}
		
		else if(month.equals("jul")) {
			System.out.println("July!");
		}
		
		else if(month.equals("aug")) {
			System.out.println("August!");
		}
		
		else if(month.equals("sep")) {
			System.out.println("September!");
		}
		
		else if(month.equals("oct")) {
			System.out.println("October!");
		}
		
		else if(month.equals("nov")) {
			System.out.println("November!");
		}
		
		else if(month.equals("dec")) {
			System.out.println("December!");
		}
		
		//Closing the scanner
		s.close();

	}

}
