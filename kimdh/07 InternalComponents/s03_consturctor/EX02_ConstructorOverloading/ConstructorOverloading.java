package s03_consturctor.EX02_ConstructorOverloading;

/* 다양한 생성자를 사용한 다양한 객체 생성 방법 */

class A {

	A() {

		System.out.println("첫 번째 생성자");

	}

	A(int a) {

		System.out.println("두 번째 생성자");

	}

	A(int a, int b) {

		System.out.println("세 번째 생성자");

	}

}

@SuppressWarnings("unused")
public class ConstructorOverloading {

	public static void main(String[] args) {

		// #1. 세 가지 생성자를 이용한 객체 생성

		A a1 = new A(); // 첫 번째 생성자
		A a2 = new A(3); // 두 번째 생성자
		A a3 = new A(3, 5); // 세 번째 생성자

	}

}
