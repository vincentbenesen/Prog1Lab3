import java.util.Scanner;
import java.text.DecimalFormat;

/*This code calculates the area of a circle, based on a radius given by the user. 
If the input is negative, or zero, the program should not calculate the area, but warn the user of the mistake.
*/

public class RadiusOfCircle{
	public static void main ( String [] args ){

		Scanner scan = new Scanner(System.in);
		System.out.print("\nProvide a radius to calculate the area of the circle > ");
		double radius = scan.nextDouble ();
		Double area;
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");

		if (radius <= 0){
			System.out.println ("The value that you put is INVALID" + 
					    "\nMake sure to put a value that is greater than zero");
		}else{
			area = Math.PI * (Math.pow(radius, 2));
			System.out.println("The area of circle is " + twoDecimals.format(area));
		}
	}
}
