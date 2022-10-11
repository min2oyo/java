package s05_ThreadStates;

class DataBox7 {

	boolean isEmpty = true;
	int data;

	synchronized void inputData(int data) {

		if (!isEmpty) {

			try {

				wait();

			} catch (InterruptedException e) {

			} // WAITING

		}

		this.data = data;
		isEmpty = false;
		System.out.println("입력데이터 : " + data);
		notify();

	}

	synchronized void outputData() {

		if (isEmpty) {

			try {

				wait();

			} catch (InterruptedException e) {

			} // WAITING

		}

		isEmpty = true;
		System.out.println("출력데이터 : " + data);
		notify();

	}

}

public class Ex07_Waiting_WaitNotify_2 {

	public static void main(String[] args) {

		DataBox7 dataBox = new DataBox7();

		Thread t1 = new Thread() {

			@Override
			public void run() {

				for (int i = 1; i < 9; i++) {

					dataBox.inputData(i);

				}

			};

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {

				for (int i = 1; i < 9; i++) {

					dataBox.outputData();

				}

			};

		};

		t1.start();
		t2.start();

	}

}
