import java.util.Scanner;

public class BookQuestion42{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Indicate the number of times you hit the ball > ");
		int numberOfHits = scan.nextInt();
		System.out.print("Indicate the number of at-bats for a batter > ");
		int numberOfAtBats = scan.nextInt();
		double hittingPercetage = (double) numberOfHits/numberOfAtBats;

		if (hittingPercetage > 0.300){
			System.out.println("\nYour average hit is " + hittingPercetage);
			System.out.println("You are eligible for the All Star Game");
		} else{
			System.out.println("Your average hit is " + hittingPercetage);
			System.out.println("You are not eligible for the All Star Game");
		}
	}
}