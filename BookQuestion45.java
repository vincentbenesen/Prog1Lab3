import java.util.Scanner;

public class BookQuestion45{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Write a sentence");
		String sentence = sc.nextLine();

		if (sentence.endsWith(".")) {
			System.out.println("This is a declaratice sentence");
		} else if (sentence.endsWith("?")) {
			System.out.println(("This is an interogative sentence"));
		} else if (sentence.endsWith("!")) {
			System.out.println("This is an exclamatory sentence");
		} else {
			System.out.println("Your sentence is missing a punctuation mark");
		}
	}
}