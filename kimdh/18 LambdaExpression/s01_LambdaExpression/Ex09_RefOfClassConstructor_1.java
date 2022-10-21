package s01_LambdaExpression;

interface A9 {

	B9 abc();

}

class B9 {

	B9() {

		System.out.println("첫 번째 생성자");

	}

	B9(int k) {

		System.out.println("두 번째 생성자");

	}

}

public class Ex09_RefOfClassConstructor_1 {

	public static void main(String[] args) {

		// 클래스 생성자 참조

		// @1 익명이너클래스
		A9 a1 = new A9() {

			@Override
			public B9 abc() {

				return new B9();

			}

		};

		// @2.람다식
		A9 a2 = () -> new B9();

		// @3. 클래스 생성자 참조
		A9 a3 = B9::new;

		a1.abc(); // 첫 번째 생성자
		a2.abc(); // 첫 번째 생성자
		a3.abc(); // 첫 번째 생성자

	}

}
