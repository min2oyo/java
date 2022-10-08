package s05_thismethod;

/* this(생성자 매개변수) 활용 */

class A2 {

	int m1, m2, m3, m4;

	A2() {

		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;

	}

	A2(int a) {

		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;

	}

	A2(int a, int b) {

		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;

	}

	void print() {

		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();

	}

}

class B {

	int m1, m2, m3, m4;

	B() {

		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;

	}

	B(int a) {

		this();
		m1 = a;

	}

	B(int a, int b) {

		this(a);
		m2 = b;

	}

//	// 첫 번째 생성자 호출 + 두 개의 코드 추가 
//	B(int a, int b) {
//
//		this();
//		m1 = a;
//		m2 = b;
//
//	}

	void print() {

		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();

	}

}

public class Ex02_ThisMethod_2 {

	public static void main(String[] args) {

		// #1. 세 가지 객체 생성 (this() 미사용)

		A2 a1 = new A2();
		A2 a2 = new A2(10);
		A2 a3 = new A2(10, 20);
		a1.print(); // 1 2 3 4
		a2.print(); // 10 2 3 4
		a3.print(); // 10 20 3 4

		System.out.println();

		// #2. 세 가지 객체 생성 (this() 사용)

		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		b1.print(); // 1 2 3 4
		b2.print(); // 10 2 3 4
		b3.print(); // 10 20 3 4

	}

}
