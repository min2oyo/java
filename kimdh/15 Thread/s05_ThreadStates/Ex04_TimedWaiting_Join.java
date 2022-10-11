package s05_ThreadStates;

class MyThread4_1 extends Thread {

	@Override
	public void run() {

		for (long i = 0; i < 1000000000L; i++) {

		} // 시간지연

	}

}

class MyThread4_2 extends Thread {

	MyThread4_1 myThread4_1;

	public MyThread4_2(MyThread4_1 myThread4_1) {

		this.myThread4_1 = myThread4_1;

	}

	@Override
	public void run() {

		try {

			myThread4_1.join(3000);

		} catch (InterruptedException e) {

			System.out.println(" -- join(...) 진행중 interrupt() 발생");

			for (long i = 0; i < 1000000000L; i++) {

			} // 시간지연

		}

	}

}

public class Ex04_TimedWaiting_Join {

	public static void main(String[] args) {

		// 1. 객체 생성
		MyThread4_1 myThread1 = new MyThread4_1();
		MyThread4_2 myThread2 = new MyThread4_2(myThread1);
		myThread1.start();
		myThread2.start();

		try {

			Thread.sleep(100);

		} catch (InterruptedException e) {

		} // 쓰레드 시작 준비 시간

		System.out.println("MyThread1 State: " + myThread1.getState()); // RUNNABLE
		System.out.println("MyThread2 State: " + myThread2.getState()); // TIMED_WAITING

		myThread2.interrupt();

		try {

			Thread.sleep(100);

		} catch (InterruptedException e) {

		} // 인터럽트 준비 시간

		System.out.println("MyThread1 State: " + myThread1.getState()); // RUNNABLE
		System.out.println("MyThread2 State: " + myThread2.getState()); // RUNNABLE

	}

}
