package p08_ExplicitConversion;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dNum1 = 1.2;
		float fNum2 = 0.9f;

		int iNum3 = (int) dNum1 + (int) fNum2;
		System.out.println((int) dNum1 + " + " + (int) fNum2 + " = " + iNum3);	// 1

		int iNum4 = (int) (dNum1 + fNum2);
		System.out.println(dNum1 + " + " + fNum2 + " = " + (dNum1 + fNum2) + " = " + iNum4);	// 2

	}

}
