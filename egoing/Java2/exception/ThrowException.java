package exception;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("./data.txt");
		f.close(); // 필요한가?

	}

}
