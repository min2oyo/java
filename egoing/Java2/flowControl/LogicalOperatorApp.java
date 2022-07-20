package flowControl;

public class LogicalOperatorApp {

	public static void main(String[] args) {

		// AND
		System.out.println(true && true); // true
		System.out.println(true && false); // false
//		System.out.println(false && true); // false		// 노란 줄
//		System.out.println(false && false); // false	// 노란 줄

		// OR
//		System.out.println(true || true); // true	// 노란 줄
//		System.out.println(true || false); // true	// 노란 줄
		System.out.println(false || true); // true
		System.out.println(false || false); // false

		// not
		System.out.println(!true); // false
		System.out.println(!false); // true

	}

}
