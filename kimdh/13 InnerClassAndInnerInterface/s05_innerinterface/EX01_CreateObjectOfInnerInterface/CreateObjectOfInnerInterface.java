package s05_innerinterface.EX01_CreateObjectOfInnerInterface;

/* 이너 인터페이스의 두 가지 객체 생성 방법 */

class A {

	interface B {

		public abstract void bcd();

	}

}

class C implements A.B {

	@Override
	public void bcd() {

		System.out.println("이너 인터페이스 구현 클래스 생성");

	}

}

@SuppressWarnings("unused")
public class CreateObjectOfInnerInterface {

	public static void main(String[] args) {

		// 객체생성 방법 #1 (자식 클래스 직접 생성)
		A.B ab = new C();
		C c = new C();
		c.bcd();	// 이너인터페이스 구현 클래스 생성

		// 객체생성 방법 #2 (익명 이너 클래스 생성)
		A.B b = new A.B() {

			@Override
			public void bcd() {

				System.out.println("익명 이너 클래스로 객체 생성");

			}

		};
		b.bcd();	// 익명 이너 클래스로 객체 생성

	}

}
