package s01_LambdaExpression;

interface A3 {

	void abc();

}

class B3 {

	void bcd() {

		System.out.println("메서드");

	}

}

public class Ex03_RefOfIntanceMethod_Type1_1 {

	public static void main(String[] args) {

		// 1. 인스턴스 메서드 참조 type1 익명이너클래스
		A3 a1 = new A3() {

			@Override
			public void abc() {

				B3 b = new B3();
				b.bcd();

			}

		};

		// 2. 람다식
		A3 a2 = () -> {

			B3 b = new B3();
			b.bcd();

		};

		// 3. 인스턴스 참조 Type1의 표현
		B3 b = new B3();
		A3 a3 = b::bcd;

		a1.abc();
		a2.abc();
		a3.abc();

	}

}
