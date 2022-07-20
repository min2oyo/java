package exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {

		// try catch finally
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
