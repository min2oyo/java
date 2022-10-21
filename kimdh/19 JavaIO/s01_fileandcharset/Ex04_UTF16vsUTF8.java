package s01_fileandcharset;

import java.io.UnsupportedEncodingException;

public class Ex04_UTF16vsUTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		// abc
		byte[] b1 = "abc".getBytes("UTF-16"); // 문자열--> byte[]
		byte[] b2 = "abc".getBytes("UTF-8");  // 문자열--> byte[]

		System.out.println(b1.length); // 8 (= FE FF + 6)
		System.out.println(b2.length); // 3

		for (byte b : b1) System.out.printf("%02X ", b);
		System.out.println();	// FE FF 00 61 00 62 00 63

		for (byte b : b2) System.out.printf("%02X ", b);
		System.out.println();	// 61 62 63

		System.out.println(new String(b1, "UTF-16"));	// abc (byte[] --> 문자열)
		System.out.println(new String(b2, "UTF-8"));	// abc (byte[] --> 문자열)
		System.out.println();

		// 가나다
		byte[] b3 = "가나다".getBytes("UTF-16"); // 문자열--> byte[]
		byte[] b4 = "가나다".getBytes("UTF-8");  // 문자열--> byte[]

		System.out.println(b3.length); // 8 (= FE FF + 6)
		System.out.println(b4.length); // 9

		for (byte b : b3) System.out.printf("%02X ", b);
		System.out.println();	// FE FF AC 00 B0 98 B2 E4

		for (byte b : b4) System.out.printf("%02X ", b);
		System.out.println();	// EA B0 80 EB 82 98 EB 8B A4

		System.out.println(new String(b3, "UTF-16"));	// 가나다 (byte[] --> 문자열)
		System.out.println(new String(b4, "UTF-8"));	// 가나다 (byte[] --> 문자열)
		System.out.println();

	}

}
