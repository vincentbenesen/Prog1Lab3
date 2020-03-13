import java.util.Scanner;

public class BookQuestion49{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Write a Web address ");
		String webAddress = sc.next();

		if (webAddress.startsWith("www.")) {
			if (webAddress.endsWith("gov")) {
				System.out.println("This is a goverment web address");
			} else if (webAddress.endsWith("edu")) {
				System.out.println("This is a university web address");
			} else if (webAddress.endsWith("com")) {
				System.out.println("This is a business web address");
			} else if (webAddress.endsWith("org")) {
				System.out.println("This is an organization web address");
			} else {
				System.out.println("This is a web address for another entity");
			}		
		} else {
			System.out.println("It is not a valid web address");
		}
	}
}