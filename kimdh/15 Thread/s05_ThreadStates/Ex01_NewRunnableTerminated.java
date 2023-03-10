package s05_ThreadStates;

public class Ex01_NewRunnableTerminated {

	public static void main(String[] args) {

		// 쓰레드 상태 저장 클래스
		Thread.State state;

		// 1. 객체 생성 (NEW)
		Thread myThread = new Thread() {

			@Override
			public void run() {

				for (long i = 0; i < 1000000000L; i++) {

				} // 시간 지연

			}

		};

		state = myThread.getState();
		System.out.println("myThread state: " + state); // NEW

		// 2. myThread 시작 (RUNNABLE)
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state: " + state); // Runnable

		// 3. myThread 종료 (TERMINATED)
		try {

			myThread.join();

		} catch (InterruptedException e) {

		}

		state = myThread.getState();
		System.out.println("myThread state: " + state); // TERMINATED

	}

}
