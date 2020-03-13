import java.util.Scanner;

public class BookQuestion48{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your user ID >");
		String userID = sc.next();
		int numberOfLetters= userID.length();

		if (numberOfLetters > 5 && numberOfLetters < 11) {
			System.out.println("Welcome, " + userID);
		} else {
			System.out.println("Sorry, user ID invalid");
		}
	}
}