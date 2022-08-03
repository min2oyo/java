// #. UncheckedException (실행예외) = RuntimeException

package sec01_typeofexception.EX02_UncheckedException;

class A {
}

class B extends A {
}

@SuppressWarnings("unused")
public class UncheckedException {

	public static void main(String[] args) {

		// #1. ArithmeticException // 0으로 나눔

		System.out.println(3 / 0);

		// #2. ClassCastException // 다운 캐스팅 오류

		A a = new A();
		B b = (B) a;

		// #3. ArrayIndexOutOfBoundException // 배열의 인덱스를 잘못 사용했을 때 발생

		int[] array = { 1, 2, 3 };
		System.out.println(array[3]);

		// #4. NumberFormatException

		int num = Integer.parseInt("10!");

		// #5. NullPointerException // 참조 변수가 실제 객체를 가리키고 있지 않고 필드나 메서드를 호출할 때 발생

		String str = null;
		System.out.println(str.charAt(2));

	}

}
