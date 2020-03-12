import java.util.Scanner;

public class TemperatureIdentifier{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the temperature (celsius) today > ");
		int temperature = scan.nextInt();

		String temperatureToday = (temperature < 0 ) ? "It is cold today" : "We have a nice weather today";
		System.out.println(temperatureToday);
	}
} 