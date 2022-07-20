package exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

		// try with resource statements
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
//			f.close(); // 자동으로 실행 됨
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
