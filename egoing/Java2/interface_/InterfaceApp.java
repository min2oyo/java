package interface_;

public class InterfaceApp {

	public static void main(String[] args) {
		
		printable c = new AdvancedPrint();
		c.print();
	
	}

}

interface Calculable {

	double PI = 3.14;
	int sum(int v1, int v2);

}

interface printable {
	void print();
}

class RealCal implements Calculable, printable {

	@Override
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	@Override
	public void print() {
		System.out.println("This is RealCal!!");
	}

}

class AdvancedPrint implements printable{
	public void print() {
		System.out.println("This is AdvancedPrint!!");
	}
}