package sec01_datatype.EX02_NamingVariableAndConstant;

/*변수와 상수의 이름 짓기*/

public class NamingVariableAndConstant {
	public static void main(String[] args) {

		// 변수
		@SuppressWarnings("unused")
		boolean aBcD; // 가능은 하지만 대문자는 새로운 단어의 앞 글자에 사용 권장
		@SuppressWarnings("unused")
		byte 가나다;	// 한글로 작성 가능(권장하지 않음)
		@SuppressWarnings("unused")
		short _abcd;
		@SuppressWarnings("unused")
		char $ab_cd;
//		int 3abcd; // 불가능. 숫자는 제일 앞에 올 수 없음
		@SuppressWarnings("unused")
		long abcd3;
//		float int; // 불가능. 자바 예약어는 사용할 수 없음
		@SuppressWarnings("unused")
		double main; // 가능. 메서드 이름과 변수이름은 동일해도 무관
//		int my Work; // 불가능. 스페이스 특수키는 사용할 수 없음
		@SuppressWarnings("unused")
		String myClassName;
		@SuppressWarnings("unused")
		int ABC; // 가능은 하지만 전부 대문자 작성은 권장하지 않음

		// 상수
		@SuppressWarnings("unused")
		final double PI;
		@SuppressWarnings("unused")
		final int MY_DATA;
		@SuppressWarnings("unused")
		final float myData; // 가능은 하지만 소문자 사용은 권장하지 않음

	}
}
