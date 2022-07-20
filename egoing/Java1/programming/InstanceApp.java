package programming;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();

		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();

		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 3"); // 왜 "hello 3"이 안 되지?
		p2.close();

		// 비효율적
//      PrintWriter.write("result1.txt", "Hello 1");	
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
	}

}
