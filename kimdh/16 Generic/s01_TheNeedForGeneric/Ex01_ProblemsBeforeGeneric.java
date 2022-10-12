package s01_TheNeedForGeneric;

// 1. Apple1 클래스와 Apple1 클래스를 담을 수 있는 클래스 
class Apple1 {

}

class Goods1 {

	private Apple1 apple1 = new Apple1();

	public Apple1 getApple1() {

		return apple1;

	}

	public void setApple1(Apple1 apple1) {

		this.apple1 = apple1;

	}

}

// 2. Pencil1 클래스와 Pencil1 클래스를 담을 수 있는 클래스 
class Pencil1 {
}

class Goods2 {

	private Pencil1 pencil1 = new Pencil1();

	public Pencil1 getPencil1() {

		return pencil1;

	}

	public void setPencil1(Pencil1 pencil1) {

		this.pencil1 = pencil1;

	}

}

public class Ex01_ProblemsBeforeGeneric {

	public static void main(String[] args) {

		// 1. Goods1을 통해서 Apple1 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple1(new Apple1());
		Apple1 apple1 = goods1.getApple1();
		System.out.println(apple1);

		// 2. Goods2을 통해서 Pencil1 객체 추가 및 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil1(new Pencil1());
		Pencil1 pencil1 = goods2.getPencil1();
		System.out.println(pencil1);

	}

}
