package s04_SynchronizedMethodAndBlock;

// 공유객체
class MyData2 {

	int data = 3;

	public synchronized void plusData() {

		int mydata = data; // 데이터를 가져오기

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}

		data = mydata + 1;

	}

}

// 공유객체를 사용하는 쓰레드 
class PlusThread2 extends Thread {

	MyData2 myData;

	public PlusThread2(MyData2 myData) {

		this.myData = myData;

	}

	@Override
	public void run() {

		myData.plusData();
		System.out.println(getName() + " 실행 결과: " + myData.data);

	}

}

public class Ex02_SynchronizedMethod {

	public static void main(String[] args) {

		// 공유객체 생성
		MyData2 myData = new MyData2();

		// 1. plusThread 1
		Thread plusThread1 = new PlusThread2(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

		}

		// 2. plusThread 2
		Thread plusThread2 = new PlusThread2(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}

}
