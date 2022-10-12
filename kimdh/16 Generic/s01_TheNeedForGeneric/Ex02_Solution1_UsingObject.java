package s01_TheNeedForGeneric;

// 1. Apple2, Pencil2 클래스를 모두 저장하고 꺼낼수 있는 클래스

class Apple2 {
}

class Pencil2 {
}

class Goods {

	private Object object = new Object();

	public Object getObject() {

		return object;

	}

	public void setObject(Object object) {

		this.object = object;

	}

}

public class Ex02_Solution1_UsingObject {

	public static void main(String[] args) {

		// 1. Goods을 통해서 Apple2 객체 추가 및 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple2());
		Apple2 apple2 = (Apple2) goods1.getObject();
		System.out.println(apple2);

		// 2. Goods을 통해서 Pencil2 객체 추가 및 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil2());
		Pencil2 pencil2 = (Pencil2) goods2.getObject();
		System.out.println(pencil2);

		// 3. 잘못된 캐스팅 (약한 타입체크)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple2());
//		Pencil2 pencil2 = (Pencil2)goods3.getObject(); //실행예외
	}

}
