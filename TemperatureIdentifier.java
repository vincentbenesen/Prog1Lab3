import java.util.Scanner;

/*This code prompts the user for the current temperature in Celsius and outputs different messages if it is above or below zero.
*/

public class TemperatureIdentifier{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the temperature (celsius) today > ");
		int temperature = scan.nextInt();

		String temperatureToday = (temperature < 0 ) ? "It is cold today" : "We have a nice weather today";
		System.out.println(temperatureToday);
	}
} 
