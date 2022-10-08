// # Checked Exception (일반예외)

package s01_typeofexception.EX01_CheckedException;

class A { // extends Object

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}

public class CheckedException {

	public static void main(String[] args) {

		// #1. InterruptedException

//		Thread.sleep(1000);	// 일정 시간 동안 해당 쓰레드를 일시정지 상태로 만드는 Thread 클래스의 정적 메서드

		// #2. ClassNotFoundException

//		Class cls = Class.forName("java.lang.Object");	// 클래스를 동적으로 메모리에 로딩하는 메서드. 해당 클래스의 정보를 담고 있는 Class 타입의 객체를 리턴

		// #3. IOException // 콘솔이나 파일에 데이터를 쓰거나 읽을 때 발생

//		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();

		// #4. FileNotFoundException // 파일을 읽을 때 해당 경로에 파일이 없을 때
//		
//		FileInputStream fis = new FileInputStream("text.txt");

		// #5. CloneNotSupppetedException // Cloneable 인터페이스를 상속하지 않은 클래스의 객체를 복사하기 위해 clone() 호출할 경우 발생

//		A a1 = new A();
//		A a2 = (A)a1.clone();

	}

}
