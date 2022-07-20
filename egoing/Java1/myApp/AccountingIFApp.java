package myApp;

public class AccountingIFApp {

	public static void main(String[] args) {

		double valueOfSupply = 50000.0; // 공급가

		double vatRate = 0.1; // 부가가치세율
		double vat = valueOfSupply * vatRate; // 부가가치세
		double total = valueOfSupply + vat; // 결제액
		double expenseRate = 0.3; // 비용율
		double expense = valueOfSupply * expenseRate; // 비용
		double income = valueOfSupply - expense; // 이익
		double dividend1 = income * 0.5; // 동업자 1
		double dividend2 = income * 0.3; // 동업자 2
		double dividend3 = income * 0.2; // 동업자 3
		if (income <= 10000.0) {
			dividend1 = income * 1; // 동업자 1
			dividend2 = income * 0; // 동업자 2
			dividend3 = income * 0; // 동업자 3
		}

		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total: " + total);
		System.out.println("Expense: " + expense);
		System.out.println("Income: " + income);
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);

	}

}
