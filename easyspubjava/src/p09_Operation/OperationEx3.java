package p09_Operation;

public class OperationEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		System.out.println(value);	// false
		System.out.println(num1);		// 20
		System.out.println(i);			// 2 // 앞 항 결과값이 거짓으므로 연산 안 됨
		System.out.println();

		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);	// true
		System.out.println(num1);		// 30
		System.out.println(i);			// 2 // 앞 항 결과값이 참으므로 연산 안 됨
		System.out.println();

	}

}
