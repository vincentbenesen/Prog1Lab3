import java.util.Scanner;

public class BookQuestion50{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Write the temperature today > ");
		int temperature = sc.nextInt();

		if (temperature > 110 || temperature < -5) {
			System.out.println("The temperature entered is outside the valid range");
		} else if (temperature >= 90) {
			System.out.println("It is summer");
		} else if (temperature >= 70 && temperature < 90) {
			System.out.println("It is spring ");
		} else if (temperature >= 50 && temperature < 70) {
			System.out.println("It is fall");
		} else if (temperature < 50) {
			System.out.println("It is winter");
		}
	}
}
