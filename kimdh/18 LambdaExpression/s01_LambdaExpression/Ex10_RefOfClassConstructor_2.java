package s01_LambdaExpression;

interface A10 {

	B10 abc(int k);

}

class B10 {

	B10() {

		System.out.println("첫 번째 생성자");

	}

	B10(int k) {

		System.out.println("두 번째 생성자");

	}

}

public class Ex10_RefOfClassConstructor_2 {

	public static void main(String[] args) {

		// 클래스 생성자 참조

		// @1 익명이너클래스
		A10 a1 = new A10() {

			@Override
			public B10 abc(int k) {

				return new B10(3);

			}

		};

		// @2.람다식
		A10 a2 = (int k) -> new B10(3);

		// @3. 클래스 생성자 참조
		A10 a3 = B10::new;

		a1.abc(3); // 두 번째 생성자
		a2.abc(3); // 두 번째 생성자
		a3.abc(3); // 두 번째 생성자

	}

}
