package flowControl;

public class AuthAppLogical {

	public static void main(String[] args) {

		String inputId = new String("ria");
		String inputPs1 = new String("1111");
		String inputPs2 = new String("2222");

		String id = "ria";
		String password1 = "1111";
		String password2 = "2222";

		System.out.println("Hi. ");
		if (inputId.equals(id) && (inputPs1.equals(password1) || inputPs2.equals(password2))) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		
	}

}
