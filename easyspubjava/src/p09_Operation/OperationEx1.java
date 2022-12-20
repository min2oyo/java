package p09_Operation;

public class OperationEx1 {

	public static void main(String[] args) {

		int korScore = 100;
		int mathScore = 90;
		int engScore = 70;

		int totalScore = korScore + mathScore + engScore;
		System.out.println(totalScore);	// 260

		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);	// 86.66666666666667

	}

}
