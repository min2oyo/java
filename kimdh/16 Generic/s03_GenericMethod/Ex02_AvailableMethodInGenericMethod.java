package s03_GenericMethod;

class A {

	public <T> void method(T t) {

//		System.out.println(t.length());		// 불가능: Object 메서드만 호출가능
		System.out.println(t.equals("안녕"));	// Object 메서드만 호출가능

	}

}

public class Ex02_AvailableMethodInGenericMethod {

	public static void main(String[] args) {

		A a = new A();
		a.<String>method("안녕");

	}

}
