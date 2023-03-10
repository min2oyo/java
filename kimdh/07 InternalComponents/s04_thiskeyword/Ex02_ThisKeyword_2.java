package s04_thiskeyword;

/* 명시적 this 키워드 추가 */

class A2 {

	int m;
	int n;

	void init(int m, int n) {

		// 모두 지역변수로 인식하여 필드에 전달이 안 됨
//		m = m;
//		n = n;

	}

}

class B {

	int m;
	int n;

	void init(int m, int n) {

		this.m = m;
		this.n = n;

	}

}

public class Ex02_ThisKeyword_2 {

	public static void main(String[] args) {

		// #1. 필드명과 지역변수 명이 같은 경우 (this 키워드를 사용하지 않은 경우)

		A2 a = new A2();
		a.init(2, 3);
		System.out.println(a.m); // 0
		System.out.println(a.n); // 0

		// #2. 필드명과 지역변수 명이 같은 경우 (this 키워드를 직접 사용하는 경우)

		B b = new B();
		b.init(2, 3);
		System.out.println(b.m); // 2
		System.out.println(b.n); // 3

	}

}
