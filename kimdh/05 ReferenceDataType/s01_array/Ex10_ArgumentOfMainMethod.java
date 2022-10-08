package s01_array;

/* main 메서드로의 매개변수 전달 */
/*
 * Run - Run configurations - Java Application - 'ArgumentOfMainMethod' - '(x)=Arguments' 탭 - '안녕하세요 3 5.8' 입력
 */

public class Ex10_ArgumentOfMainMethod {

	public static void main(String[] args) {

		// #1. args 배열의 길이 구하기

		System.out.println(args.length);
		System.out.println();

		// #2. 매개변수 출력 1

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		System.out.println(Integer.parseInt(args[1]) + 1); // 4
		System.out.println();

		// #3. 매개변수 출력 2

		for (String s : args) {
			System.out.println(s);
		}

		System.out.println();

	}

}
