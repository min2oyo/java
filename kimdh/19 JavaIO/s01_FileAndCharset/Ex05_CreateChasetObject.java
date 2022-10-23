package s01_FileAndCharset;

import java.nio.charset.Charset;

public class Ex05_CreateChasetObject {

	public static void main(String[] args) {

		Charset cs1 = Charset.defaultCharset();
		Charset cs2 = Charset.forName("MS949");
		Charset cs3 = Charset.forName("UTF-8");

		System.out.println(cs1);	// UTF-8 / MS949
		System.out.println(cs2);	// x-windows-949
		System.out.println(cs3);	// UTF-8
		System.out.println();

		System.out.println(Charset.isSupported("MS949"));	// true
		System.out.println(Charset.isSupported("UTF-8")); // true

	}

}
