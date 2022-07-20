package objectOrientedProgramming;

public class StaticApp {

	public static void main(String[] args) {

		System.out.println(Foo.classVar); // I class var
//		System.out.println(Foo.instanceVar); // error
		Foo.classMethod(); // I class var
//		Foo.instanceMethod(); // error

		Foo f1 = new Foo();
		Foo f2 = new Foo();

//		System.out.println(f1.classVar); // Foo.classVar // I class var
		System.out.println(f1.instanceVar); // I instance var

//		f1.classVar = "changed by f1"; // Foo.classVar
		System.out.println(Foo.classVar); // changed by f1
//		System.out.println(f2.classVar); // Foo.classVar // changed by f1

		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var

	}

}

class Foo {

	public static String classVar = "I class var";
	public String instanceVar = "I instance var";

	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // error
	}

	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}

}