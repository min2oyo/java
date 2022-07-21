package hello;

public class Hi {

	public static void main(String[] args) {

		averageScore(1, 2, 3, 4);

	}

	static void averageScore(int... score) {

		int sum = 0;

		for (int k : score) {
			sum += k;
		}

		double avg = (double) sum / score.length;
		System.out.println(avg);

	}

}
