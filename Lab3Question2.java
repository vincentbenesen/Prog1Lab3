import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3Question2{


    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Write your weight in pounds >");
        double weight = scan.nextDouble();
        System.out.print("Write your height in feet > ");
        double height = scan.nextDouble();
        
        double poundsToKilogram = weight*0.4535;
        double ftToMeters = height*0.3040;
        double yourBMI = poundsToKilogram/(Math.pow(ftToMeters, 2));

        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        System.out.println ("\nYour BMI is " + twoDecimals.format(yourBMI));

        if (yourBMI < 18.5){
            System.out.println("You're Underweight");
        }else if (18.5 >= yourBMI && yourBMI <= 24.9){
            System.out.println("You're Normal");
        }else if (25.0 >= yourBMI && yourBMI <= 29.9){
            System.out.println("You're Overweight");
        }else if (yourBMI > 30.0){
         System.out.println("You're Obese"); 
        }
      
       }
    }