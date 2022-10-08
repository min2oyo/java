package s01_packageimport.EX02_PackageImport_2;

import s01_packageimport.common.A;

public class PackageImport_2 {

	public static void main(String[] args) {

		// #1. 객체생성

		A a = new A(); // 정상동작

		// #2. 멤버활용

		System.out.println(a.m); // 3
		System.out.println(a.n); // 4
		a.print(); // 임포트

	}

}
