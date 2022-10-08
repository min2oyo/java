package s05_thismethod;

/* this(생성자의 매개변수) 메서드의 문법적 특징과 의미 */

//#1. 클래스의 정의

class A1 {

	A1() {

		System.out.println("첫 번째 생성자");

	}

	A1(int a) {

		this(); // 생성자의 첫 줄에만 올 수 있다.
		System.out.println("두 번째 생성자");

	}

//	// 메서드에서는 this() 메서드 사용 불가
//	void abc() {
//
//		this(); // 불가능
//
//	}

}

@SuppressWarnings("unused")
public class Ex01_ThisMethod_1 {

	public static void main(String[] args) {

		// #2. 객체 생성

		A1 a1 = new A1(); // 첫 번째 생성자
		System.out.println();

		A1 a2 = new A1(3); // 첫 번째 생성자 // 두 번째 생성자

	}

}
