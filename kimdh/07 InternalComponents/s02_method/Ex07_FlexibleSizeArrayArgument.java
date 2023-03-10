package s02_method;

import java.util.Arrays;

/* 메서드의 가변길이 배열 매개변수 */

public class Ex07_FlexibleSizeArrayArgument {

	public static void main(String[] args) {

		// #1. method1(int...values)

		method1(1, 2); // 배열의 길이: 2 // [1, 2]
		method1(1, 2, 3); // 배열의 길이: 3 // [1, 2, 3]
		method1(); // 배열의 길이: 0 // []

		// #2. method2(String...values)

		method2("안녕", "방가"); // 배열의 길이: 2 // [안녕, 방가]
		method2("땡큐", "베리", "감사"); // 배열의 길이: 3 // [땡큐, 베리, 감사]
		method2(); // 배열의 길이: 0 // []

	}

	public static void method1(int... values) { // 가변길이 배열

		System.out.println("배열의 길이: " + values.length);

//		// 배열 출력 방법 1
//		for (int i = 0; i < values.length; i++) {
//			System.out.print(values[i] + " ");
//		}

//		// 배열 출력 방법 2
//		for (int k : values) {
//			System.out.print(k + " ");
//		}

		// 배열 출력 방법 3
		System.out.println(Arrays.toString(values));
		System.out.println();

	}

	public static void method2(String... values) { // 가변길이 배열

		System.out.println("배열의 길이: " + values.length);

//		// 배열 출력 방법 1
//		for (int i = 0; i < values.length; i++) {
//			System.out.print(values[i] + " ");
//		}

//		// 배열 출력 방법 2
//		for (String k : values) {
//			System.out.print(k + " ");
//		}

		// 배열 출력 방법 3
		System.out.println(Arrays.toString(values));
		System.out.println();

	}

}
