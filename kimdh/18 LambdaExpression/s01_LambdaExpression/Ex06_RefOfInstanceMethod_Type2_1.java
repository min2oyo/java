package s01_LambdaExpression;

interface A6 {

	void abc(B6 b, int k);

}

class B6 {

	void bcd(int k) {

		System.out.println(k);

	}

}

public class Ex06_RefOfInstanceMethod_Type2_1 {

	public static void main(String[] args) {

		// 인스턴스 메서드 참조 Type2

		// @1 익명이너클래스
		A6 a1 = new A6() {

			@Override
			public void abc(B6 b, int k) {

				b.bcd(k);

			}

		};

		// @2. 람다식
		A6 a2 = (B6 b, int k) -> {

			b.bcd(k);

		};

		// @3. 인스턴스 메서드 참조 Type2
		A6 a3 = B6::bcd;

		a1.abc(new B6(), 3);
		a2.abc(new B6(), 3);
		a3.abc(new B6(), 3);

	}

}
