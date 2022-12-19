package p05_TypeInference;

public class TypeInference {

	public static void main(String[] args) {

		var i = 10;							// int
		System.out.println(i);	// 10

		var j = 10.0;						// double
		System.out.println(j);	// 10.0

		var str = "hello";				// String
		System.out.println(str);	// hello

		str = "test";
//		str = 3;	// 형 변환 안 됨

	}

}
