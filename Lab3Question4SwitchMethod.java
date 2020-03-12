/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3question4switchmethod;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class Lab3Question4SwitchMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Press (1) to convert meters to feet");
		System.out.println("Press (2) to convert CAD to USD");
		System.out.println("Press (3) to convert Celsius to Fahrenheit");
		System.out.println("Press (4) to convert Fahrenheit to Celsius");
		System.out.println("Press (5) to convert CAD to EUR");
		int numberChosen = scan.nextInt();
		double canadianDollars;
		DecimalFormat currency = new DecimalFormat ("0.00$");
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
	
        switch (numberChosen) {
            case 1:
                System.out.println("\nConversion of meters to feet");
                System.out.print("Write the value of meters you want to convert > ");
                double meters = scan.nextDouble();
                double metersToFt = meters * 3.28;
                System.out.println (meters + " meters is equal to " + metersToFt + " Ft");
                break;
            case 2:
                System.out.println("\nConversion of CAD to USD");
                System.out.print("Write the value of CAD you want convert to >");
                canadianDollars = scan.nextDouble();
                double canadianToUsd = canadianDollars * 0.75;
                System.out.println(currency.format(canadianDollars) + " CAD is equal to "
                                   + currency.format(canadianToUsd)+ " USD");
                break;
            case 3:
                System.out.println("\nConversion of Celsius to Fahrenheit");
                System.out.println("Write the the amount of Celsius you want to convert in Fahrenheit");
                int celsius = scan.nextInt();
                double celsiusToFahrenheit = (celsius * 1.8) + 32;
                System.out.println(celsius + " celsius is equal to "
                                   + celsiusToFahrenheit + " Fahrenheit");
                break;
            case 4:
                System.out.println("\nConversion of Fahrenheit to Celsius");
                System.out.println("Write the value of Fahrenheit you want to convert into Celsius");
                double fahrenheit = scan.nextDouble();
                double fahrenheitToCelsius = (fahrenheit - 32) / 1.8;
                System.out.println(fahrenheit + " Fahrenheit is equal to " +
                                   twoDecimal.format(fahrenheitToCelsius) + " Celsius");
                break;
            case 5:
                System.out.println("\nConversion of CAD to EUR");
                System.out.println("Write the amount of Canadian dollars you want to convert to Euro");
                canadianDollars = scan.nextDouble();
                double canadianToEur = canadianDollars * 0.66;
                System.out.println(currency.format(canadianDollars) + " CAD is equal to "
                                   + currency.format(canadianToEur) + " EUR");
                break;
            default:
                System.out.println ("INVALID");
                break;
        }
    }
    
}