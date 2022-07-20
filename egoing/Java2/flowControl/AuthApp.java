package flowControl;

public class AuthApp {

	public static void main(String[] args) {

		String inputId = new String("ria");
		String inputPs = new String("1111");

		String id = "ria";
		String password = "1111";

		System.out.println("Hi. ");
		if (inputId.equals(id) && inputPs.equals(password)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
