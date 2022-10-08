package s03_consturctor;

/* 다양한 생성자를 사용한 다양한 객체 생성 방법 */

class A2 {

	A2() {

		System.out.println("첫 번째 생성자");

	}

	A2(int a) {

		System.out.println("두 번째 생성자");

	}

	A2(int a, int b) {

		System.out.println("세 번째 생성자");

	}

}

@SuppressWarnings("unused")
public class Ex02_ConstructorOverloading {

	public static void main(String[] args) {

		// #1. 세 가지 생성자를 이용한 객체 생성

		A2 a1 = new A2(); // 첫 번째 생성자
		A2 a2 = new A2(3); // 두 번째 생성자
		A2 a3 = new A2(3, 5); // 세 번째 생성자

	}

}
