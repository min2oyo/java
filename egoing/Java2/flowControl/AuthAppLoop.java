package flowControl;

public class AuthAppLoop {

	public static void main(String[] args) {

		// 입력
		String id = new String("ina");
		String password = new String("1111");

		// DB
		String[][] users = { { "ina", "1111" }, { "hyojoo", "2222" }, { "sekyung", "3333" } };

		// 검증
		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			if (id.equals(users[i][0]) && password.equals(users[i][1])) {
				isLogined = true;
				break;
			}
		}

		// 출력
		System.out.println("Hi. ");
		if (isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
