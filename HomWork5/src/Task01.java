import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		if ((str.matches("^[A-Za-z]{1}.*$") || str.startsWith("_") || str.startsWith("$"))
				&& !(str.equalsIgnoreCase("null") || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false"))) {
			System.out.println("The string is an identifier");
		} else {
			System.out.println("String is not an identifier");
		}

	}

}
