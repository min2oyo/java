package s03_ThreadProperties;

//우선순위
class MyThread2 extends Thread {

	@Override
	public void run() {

		for (long i = 0; i < 1000000000; i++) {	// 시간 지연용

		}

		System.out.println(getName() + "  우선순위: " + getPriority());

	}

}

public class ThreadProperties_2 {

	public static void main(String[] args) {

		// #참고. CPU core

		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors()); //

		// #1. 디폴트 우선순위

		for (int i = 0; i < 3; i++) {

			Thread thread = new MyThread2();
			thread.start();

		}

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

		}

		// #2. 우선순위를 직접 지정

		for (int i = 0; i < 10; i++) {

			Thread thread = new MyThread2();
			thread.setName(i + "번째 쓰레드");
			if (i == 9) thread.setPriority(10);
			thread.start();

		}

	}

}
