package s01_LambdaExpression;

interface A1 {

	void abc();

}

class B1 implements A1 {

	@Override
	public void abc() {

		System.out.println("메서드 내용 1");

	}

}

public class Ex01_OOPvsFP {

	public static void main(String[] args) {

		// 1. 객체지향 프로그래밍 문법 1(case1)
		A1 a1 = new B1();
		a1.abc(); // 메서드 내용

		// 2. 객체지향 프로그래밍 문법 2(case2): 익명이너클래스 사용
		A1 a2 = new A1() {

			@Override
			public void abc() {

				System.out.println("메서드 내용 2");

			}

		};
		a2.abc(); // 메서드 내용

		// 3. 함수적 프로그래밍 문법 (람다식) (case3)
		A1 a3 = () -> {

			System.out.println("메서드 내용 3");

		};
		a3.abc();

	}

}
