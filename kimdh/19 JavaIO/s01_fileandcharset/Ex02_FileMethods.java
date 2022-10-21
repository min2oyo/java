package s01_fileandcharset;

import java.io.File;

public class Ex02_FileMethods {

	public static void main(String[] args) {

		// 0. C 드라이브내에 temp 폴더 생성 (없는 경우에)
		File tempDir = new File("C:/temp");
		if (!tempDir.exists()) tempDir.mkdir();

		// 1. 파일객체 생성
		File file = new File("C:/Windows");

		// 2. 파일메서드
		System.out.println("절대경로: " + file.getAbsolutePath());	// C:\Windows
		System.out.println("폴더(?): " + file.isDirectory());			// true
		System.out.println("파일(?): " + file.isFile());					// false
		System.out.println("파일/폴더 이름: " + file.getName()); 		// Windows, 파일 또는 폴더이름
		System.out.println("부모폴더: " + file.getParent());				// C:\

		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir());		// true (이미 폴더가 있는 경우 false)
		File newfile2 = new File("C:/temp/bcd/cde");
		System.out.println(newfile2.mkdir()); 	// false
		System.out.println(newfile2.mkdirs());	// true (이미 폴더가 있는 경우 false)

		File[] fnames = file.listFiles();

		for (File fname : fnames) {

			System.out.println((fname.isDirectory() ? "폴더: " : "파일: ") + fname.getName());

		}

	}

}
