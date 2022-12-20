package p11_SwitchCase;

public class SwitchCase3 {

	public static void main(String[] args) {

		int floor = 1;
		String space = null;

		switch (floor) {

			case 1:
				space = "약국";
				break;
			case 2:
				space = "정형외과";
				break;
			case 3:
				space = "피부과";
				break;
			case 4:
				space = "치과";
				break;
			case 5:
				space = "헬스 클럽";
				break;
			default:
				break;

		}

		System.out.println(floor + "층 " + space + "입니다.");

	}

}
