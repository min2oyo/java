package s04_SynchronizedMethodAndBlock;

class MyData4 {

	synchronized void abc() {	// this 객체가 갖고 있는 하나의 열쇠를 함꼐 사용

		for (int i = 0; i < 3; i++) {

			System.out.println(i + "sec");

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

			}

		}

	}

	synchronized void bcd() {	// this 객체가 갖고 있는 하나의 열쇠를 함꼐 사용

		for (int i = 0; i < 3; i++) {

			System.out.println(i + "초");

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

			}

		}

	}

	void cde() {	// this 객체가 갖고 있는 하나의 열쇠를 함꼐 사용

		synchronized (this) {

			for (int i = 0; i < 3; i++) {

				System.out.println(i + "번째");

				try {

					Thread.sleep(1000);

				} catch (InterruptedException e) {

				}

			}

		}

	}

}

public class Ex04_KeyObject_1 {

	public static void main(String[] args) {

		// 공유객체
		MyData4 myData = new MyData4();

		// 세 개의 쓰레드가 각각의 메서드 호출
		new Thread() {

			@Override
			public void run() {

				myData.abc();

			};

		}.start();

		new Thread() {

			@Override
			public void run() {

				myData.bcd();

			};

		}.start();

		new Thread() {

			@Override
			public void run() {

				myData.cde();

			};

		}.start();

	}

}
