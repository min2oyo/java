package s01_FileAndCharset;

import java.io.UnsupportedEncodingException;

public class Ex03_EUCKRvsMS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		// a
		byte[] b1 = "a".getBytes("EUC-KR"); // 문자열--> byte[]
		byte[] b2 = "a".getBytes("MS949");  // 문자열--> byte[]

		System.out.println(b1.length); // 1
		System.out.println(b2.length); // 1

		System.out.println(new String(b1, "EUC-KR"));	// a (byte[] --> 문자열)
		System.out.println(new String(b2, "MS949"));	// a (byte[] --> 문자열)
		System.out.println();

		// 가
		byte[] b3 = "가".getBytes("EUC-KR"); // 문자열--> byte[]
		byte[] b4 = "가".getBytes("MS949");  // 문자열--> byte[]

		System.out.println(b3.length); // 2
		System.out.println(b4.length); // 2

		System.out.println(new String(b3, "EUC-KR"));	// 가 (byte[] --> 문자열)
		System.out.println(new String(b4, "MS949"));	// 가 (byte[] --> 문자열)
		System.out.println();

		// 봵
		byte[] b5 = "봵".getBytes("EUC-KR"); // 문자열--> byte[]
		byte[] b6 = "봵".getBytes("MS949");  // 문자열--> byte[]

		System.out.println(b5.length); // 1
		System.out.println(b6.length); // 2

		System.out.println(new String(b5, "EUC-KR")); // ? (byte[] --> 문자열)
		System.out.println(new String(b6, "MS949"));	// 봵 (byte[] --> 문자열)
		System.out.println();

	}

}
