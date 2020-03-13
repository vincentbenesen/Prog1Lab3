import java.util.Scanner;

public class BookQuestion47{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you password > ");
		String password1 = sc.next();
		System.out.print("Verify your password > ");
		String password2 = sc.next();

		if (password1.equals(password2)) {
			System.out.println("You are now registered as a new user");
		} else {
			System.out.println("Sorry, there is a typo in your password");
		}
	}
}