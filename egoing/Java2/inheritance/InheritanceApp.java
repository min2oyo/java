package inheritance;

public class InheritanceApp {

	public static void main(String[] args) {

		Cal1 c1 = new Cal1(2, 1);
		Cal2 c2 = new Cal2(2, 1);
		System.out.println(c1.sum()); // 3
		System.out.println(c2.sum()); // 3
		System.out.println(c2.minus()); // 1

	}

}

class Cal1 {

	int v1, v2;

	public Cal1(int v1, int v2) {
		System.out.println("Cal1 init!!");
		this.v1 = v1;
		this.v2 = v2;
	}

	public int sum() {
		return this.v1 + this.v2;
	}

}

class Cal2 extends Cal1 {

	public Cal2(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}

	public int minus() {
		return this.v1 - this.v2;
	}

}
