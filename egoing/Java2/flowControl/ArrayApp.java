package flowControl;

public class ArrayApp {

	public static void main(String[] args) {

		String[] users = new String[3];
		users[0] = "ina";
		users[1] = "hyojoo";
		users[2] = "sekyung";

		System.out.println(users[1]);
		System.out.println(users.length);

		int[] scores = { 10, 100, 100 };
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}

}
