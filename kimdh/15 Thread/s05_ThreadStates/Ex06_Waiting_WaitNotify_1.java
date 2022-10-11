package s05_ThreadStates;

class DataBox6 {

	int data;

	synchronized void inputData(int data) {

		this.data = data;
		System.out.println("입력데이터: " + data);

	}

	synchronized void outputData() {

		System.out.println("출력데이터: " + data);

	}

}

public class Ex06_Waiting_WaitNotify_1 {

	public static void main(String[] args) {

		DataBox6 dataBox = new DataBox6();
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
