import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuffer myBuffer = new StringBuffer(str);

		if ((myBuffer.toString().matches("^[A-Za-z]{1}.*$") || myBuffer.toString().startsWith("_")
				|| myBuffer.toString().startsWith("$"))
				&& !(myBuffer.toString().equalsIgnoreCase("null") || myBuffer.toString().equalsIgnoreCase("true")
						|| myBuffer.toString().equalsIgnoreCase("false"))) {
			System.out.println("The string is an identifier");
		} else {
			System.out.println("String is not an identifier");
		}
	}
}
