package s01_LambdaExpression;

interface A4 {

	void abc(int k);

}

public class Ex04_RefOfIntanceMethod_Type1_2 {

	public static void main(String[] args) {

		// 1 인스턴스 메서드 참조 type1 익명이너클래스
		A4 a1 = new A4() {

			@Override
			public void abc(int k) {

				System.out.println(k);

			}

		};

		// 2. 람다식 줄인 표현
		A4 a2 = (int k) -> {

			System.out.println(k);

		};

		// 3. 인스턴스 메서드 참조 type1
		A4 a3 = System.out::println;

		a1.abc(3);
		a2.abc(3);
		a3.abc(3);

	}

}
