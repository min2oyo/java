package s05_ReaderWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex07_PrintWriterExample {

	public static void main(String[] args) {

		// 파일객체 생성
		File printWriter1 = new File("files/printWriter1.txt");
		File printWriter2 = new File("files/printWriter2.txt");
		File printWriter3 = new File("files/printWriter3.txt");

		// 1. PrintWriter(File file)
		try (PrintWriter pw = new PrintWriter(printWriter1);) {

			pw.println("PrintWriter 예제1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);

		} catch (IOException e) {

		}

		// 2. PrintWriter(OutputStream os)
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(printWriter2));) {

			pw.println("PrintWriter 예제2");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);

		} catch (IOException e) {

		}

		// 3. PrintWriter(Writer w)
		try (PrintWriter pw = new PrintWriter(new FileWriter(printWriter3));) {

			pw.println("PrintWriter 예제3");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);

		} catch (IOException e) {

		}

		// 4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter 예제4");
		pw.println(13);
		pw.println(5.8);
		pw.print("안녕하세요! ");
		pw.println("반갑습니다.");
		pw.printf("%d", 7).printf("%s %f", "감사", 3.7);

	}

}
