package s04_BoundedType;

class A1 {
}

class B1 extends A1 {
}

class C1 extends B1 {
}

class D1<T extends B1> { // B와 C만 올수 있음

	private T t;

	public T get() {

		return t;

	}

	public void set(T t) {

		this.t = t;

	}

}

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Ex01_BoundedTypeOfGenericClass {

	public static void main(String[] args) {

//		D<A> d1 = new D<>(); //불가능
		D1<B1> d2 = new D1<>();
		D1<C1> d3 = new D1<>();
		D1 d4 = new D1(); // == D<B1> d4 = new D<>();

		d2.set(new B1());
		d2.set(new C1());

//		d3.set(new B1()); //불가능
		d3.set(new C1());

		d4.set(new B1());
		d4.set(new C1());

	}

}
