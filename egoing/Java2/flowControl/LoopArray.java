package flowControl;

public class LoopArray {

	public static void main(String[] args) {

		String[] users = new String[3];
		users[0] = "ina";
		users[1] = "hyojoo";
		users[2] = "sekyung";

		for (int i = 0; i < users.length; i++) {
			if (i != users.length - 1) {
				System.out.print(users[i] + ", ");
			} else {
				System.out.print(users[i]);
			}
		}

	}

}
