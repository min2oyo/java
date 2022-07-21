package sec03_methodoverriding.EX04_MethodOverriding_4;

/* 메서드 오버라이딩과 접근지정자 */

class A {

	protected void abc() {

	}

}

class B1 extends A {

	@Override
	public void abc() {

	}

}

class B2 extends A {

	@Override
	protected void abc() {

	}

}

class B3 extends A {

//	@Override
//	void abc() { // default 접근지정자 (좁아져서 불가능)
//
//	}

}

class B4 extends A {

//	@Override
//	private void abc() { // private 접근지정자 (좁아져서 불가능)
//
//	}

}

public class MethodOverriding_4 {

	public static void main(String[] args) {

	}

}
