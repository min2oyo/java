package s04_SynchronizedMethodAndBlock;

class MyData5 {

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

	void cde() {	// Object 객체가 갖고 있는 열쇠를 사용

		synchronized (new Object()) {

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

public class Ex05_KeyObject_2 {

	public static void main(String[] args) {

		// 공유객체
		MyData5 myData = new MyData5();

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
