package s01_field;

/* 필드와 지역변수의 구분 */

// #1. 클래스를 생성

class A1 {

	int m = 3; // 필드
	int n = 4; // 필드

	void work1() {

		int k = 5; // 지역변수
		System.out.println(k); // 5 지역변수 출력

		work2(3); // work2() 안에 정의된 지역 변수를 스택 메모리에 추가

	}

	void work2(int i) {

		// int i 가장 먼저 실행 // 지역변수
		// i = 외부에서 전달된 값
		int j = 4; // 지역변수
		System.out.println(i + j); // 7

	}

}

public class Ex01_FieldComponent {

	public static void main(String[] args) {

		// #2. 클래스를 활용하여 객체 생성

		A1 a = new A1();

		// #3-1. 필드값 출력

		System.out.println(a.m); // 3
		System.out.println(a.n); // 4

		// #3-2. 메서드 호출

		a.work1(); // work2() 안에 정의된 지역 변수를 스택 메모리에 추가

	}

}
