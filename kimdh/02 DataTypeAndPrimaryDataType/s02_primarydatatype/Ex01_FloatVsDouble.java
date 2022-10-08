package s02_primarydatatype;

/* float과 double의 정밀도 비교 */

public class Ex01_FloatVsDouble {

	public static void main(String[] args) {

		// #1. float의 정밀도 (대략 소수 7자리)

		float f1 = 1.0000001f;
		System.out.println(f1);	// 1.0000001
		float f2 = 1.00000001f;
		System.out.println(f2);	// 1.0

		// #2. double의 정밀도 (대략 소수 15자리)

		double d1 = 1.000000000000001;
		System.out.println(d1);	// 1.000000000000001
		double d2 = 1.0000000000000001;
		System.out.println(d2);	// 1.0

	}

}
