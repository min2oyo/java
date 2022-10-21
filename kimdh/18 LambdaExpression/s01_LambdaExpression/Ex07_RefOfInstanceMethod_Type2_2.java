package s01_LambdaExpression;

interface A7 {

	int abc(String str);

}

public class Ex07_RefOfInstanceMethod_Type2_2 {

	public static void main(String[] args) {
		
		// 인스턴스 메서드 참조 Type2

		// @1. 익명이너클래스
		A7 a1 = new A7() {

			@Override
			public int abc(String str) {

				return str.length();

			}

		};

		// @2.람다식
		A7 a2 = (String str) -> str.length();

		// @3. 인스턴스 메서드 참조 Type2
		A7 a3 = String::length;

		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕"));
		System.out.println(a3.abc("안녕"));

	}

}
