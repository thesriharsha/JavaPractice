package day2;

public class Message {

	static void wish(String message, String... names) {
		for (String n : names) {
			System.out.println(message + n);
		}
	}

	public static void main(String[] args) {

		wish("What are you doing? ", "Harsha", "Bharat", "Kalyan");
	}
}
