package data_and_operation;

public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		System.out.println(a);
		System.out.println(b); // 1.0

//		int c = 1.7;
		int d = (int) 1.7;
		double e = 1.7;
		System.out.println(d); // 1
		System.out.println(e); // 1.7

		// to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // class java.lang.String
	}

}
