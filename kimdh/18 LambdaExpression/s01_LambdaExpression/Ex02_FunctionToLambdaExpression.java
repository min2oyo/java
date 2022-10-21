package s01_LambdaExpression;

interface A2 {	// 입력 X 리턴 X

	void method1();

}

interface B2 {	// 입력 O 리턴 X

	void method2(int a);

}

interface C3 {	// 입력 X 리턴 O

	int method3();

}

interface D4 {	// 입력 O 리턴 O

	double method4(int a, double b);

}

@SuppressWarnings("unused")
public class Ex02_FunctionToLambdaExpression {

	public static void main(String[] args) {

		// 1. 입력 X 리턴 X
		A2 a1 = new A2() {	// 익명이너클래스

			@Override
			public void method1() {

				System.out.println("입력 x 리턴 x 함수");

			}

		};

		A2 a2 = () -> {			// 람다식 1

			System.out.println("입력 x 리턴 x 함수");

		};

		A2 a3 = () -> System.out.println("입력 x 리턴 x 함수");	// 람다식 2 | 중괄호 삭제 가능 (한 줄 명령일 때만 가능)

		// 2. 입력 O 리턴 X
		B2 b1 = new B2() {		// 익명이너클래스

			@Override
			public void method2(int a) {

				System.out.println("입력 O 리턴 x 함수");

			}

		};

		B2 b2 = (int a) -> {	// 람다식 1

			System.out.println("입력 O 리턴 x 함수");

		};

		B2 b3 = (a) -> {			// 람다식 2 | 입력매개변수 생략 가능

			System.out.println("입력 O 리턴 x 함수");

		};

		B2 b4 = (a) -> System.out.println("입력 O 리턴 x 함수");	// 람다식 3 | 중괄호 삭제 가능 (한줄 명령일때만 가능)

		B2 b5 = a -> System.out.println("입력 O 리턴 x 함수");		// 람다식 3 | 입력 매개변수가 하나인 경우 소괄호도 생략가능

		// 3. 입력 X 리턴 O

		C3 c1 = new C3() {	// 익명이너클래스

			@Override
			public int method3() {

				return 4;

			}

		};

		C3 c2 = () -> {			// 람다식 1

			return 4;

		};

		C3 c3 = () -> 4;		// 람다식 2

		// 4. 입력 O 리턴 O
		D4 d1 = new D4() {							// 익명이너클래스

			@Override
			public double method4(int a, double b) {

				return a + b;

			}

		};

		D4 d2 = (int a, double b) -> {	// 람다식 1

			return a + b;

		};

		D4 d3 = (a, b) -> {							// 람다식 2

			return a + b;

		};

		D4 d4 = (a, b) -> a + b;				// 람다식 3

	}

}
