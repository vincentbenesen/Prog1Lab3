import java.util.Scanner;
import java.util.Date;

public class YourBirthday{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nWrite your Birth date in the format of (YYYY-MM-DD)");
		String yourBirthday = scan.nextLine();

		String yearOfBirth = yourBirthday.substring(0,4);
		int yearOfBirthAsIntegers = Integer.parseInt(yearOfBirth);
		String dayOfBirth = yourBirthday.substring(8);
		int dayOfBirthAsIntegers = Integer.parseInt(dayOfBirth);
		String monthOfBirth = yourBirthday.substring(5,7);
		int monthOfBirthAsIntegers = Integer.parseInt(monthOfBirth);

		Date dateToday = new Date();
		int currentYear = dateToday.getYear()+1900;
		int currentDay = dateToday.getDay();
		int currentMonth = dateToday.getMonth();
		int yourAge, daysUntilBirthday, daysAfterBirthday;
		int twelveMonths = currentMonth + 1;
		int actualDay = currentDay + 1;

		if (monthOfBirthAsIntegers > twelveMonths){
			yourAge = (currentYear - yearOfBirthAsIntegers)-1;
			System.out.println("You're " + yourAge + " years old");
			if (dayOfBirthAsIntegers > actualDay){
				daysUntilBirthday = (dayOfBirthAsIntegers - actualDay) + ((monthOfBirthAsIntegers - twelveMonths)*31);
				System.out.println("Your Birthday is in " + daysUntilBirthday + " days");
			} else if (dayOfBirthAsIntegers < actualDay){
				daysUntilBirthday = (actualDay - dayOfBirthAsIntegers) + ((monthOfBirthAsIntegers - twelveMonths)*31);
				System.out.println("Your Birthday is in " + daysUntilBirthday + " days");
			}
		} else if (monthOfBirthAsIntegers < twelveMonths){
			yourAge = currentYear - yearOfBirthAsIntegers;
			System.out.println("You're " + yourAge + " years old");
			if (dayOfBirthAsIntegers > actualDay){
				daysAfterBirthday = (dayOfBirthAsIntegers - actualDay) - (twelveMonths - monthOfBirthAsIntegers)*31;
				System.out.println("Your Birthday was " + Math.abs(daysAfterBirthday) + " days ago");
			} else if (dayOfBirthAsIntegers <= actualDay){
				daysAfterBirthday = (actualDay - dayOfBirthAsIntegers) - (twelveMonths - monthOfBirthAsIntegers)*31;
				System.out.println("Your Birthday was " + Math.abs(daysAfterBirthday) + " days ago");	
			}	
		} else if (monthOfBirthAsIntegers == twelveMonths){
			if (dayOfBirthAsIntegers > actualDay){
				yourAge = (currentYear - yearOfBirthAsIntegers)-1;
				daysUntilBirthday = dayOfBirthAsIntegers - actualDay;
				System.out.println("You're " + yourAge + "years old");
				System.out.println("Your Birthday is in " + daysUntilBirthday + " days");
			} else if (dayOfBirthAsIntegers == actualDay){
				yourAge = currentYear - yearOfBirthAsIntegers;
				System.out.println("Today is your Birthday!!!");
				System.out.println("You are turning " + yourAge + " today");
				System.out.println("HAPPY BIRTHDAY!!!");
			} else if (dayOfBirthAsIntegers < actualDay){
				daysAfterBirthday = actualDay - dayOfBirthAsIntegers;
				yourAge = currentYear - yearOfBirthAsIntegers;
				System.out.println("You're " + yourAge + " years old");
				System.out.println("Your Birthday was " + daysAfterBirthday + " days ago");
			}
		}
	}
}