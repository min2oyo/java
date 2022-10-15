package s04_BoundedType;

class A3 {
}

class B3 extends A3 {
}

class C3 extends B3 {
}

class D3 extends C3 {
}

class Goods<T> {

	private T t;

	public T get() {

		return t;

	}

	public void set(T t) {

		this.t = t;

	}

}

class Test {

	// case1
	void method1(Goods<A3> g) {

	}

	// case2
	void method2(Goods<?> g) {

	}

	// case3
	void method3(Goods<? extends B3> g) {

	}

	// case4
	void method4(Goods<? super B3> g) {

	}

}

public class Ex03_BoundedTypeOfInputArguments {

	public static void main(String[] args) {

		Test t = new Test();

		// case1
		t.method1(new Goods<A3>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());

		// case2
		t.method2(new Goods<A3>());
		t.method2(new Goods<B3>());
		t.method2(new Goods<C3>());
		t.method2(new Goods<D3>());

		// case3
//		t.method3(new Goods<A>());
		t.method3(new Goods<B3>());
		t.method3(new Goods<C3>());
		t.method3(new Goods<D3>());

		// case4
		t.method4(new Goods<A3>());
		t.method4(new Goods<B3>());

//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());		
	}

}
