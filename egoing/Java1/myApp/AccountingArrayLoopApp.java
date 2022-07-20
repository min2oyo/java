package myApp;

public class AccountingArrayLoopApp {

	public static void main(String[] args) {

		double valueOfSupply = 20000.0; // 공급가

		double vatRate = 0.1; // 부가가치세율
		double vat = valueOfSupply * vatRate; // 부가가치세
		double total = valueOfSupply + vat; // 결제액
		double expenseRate = 0.3; // 비용율
		double expense = valueOfSupply * expenseRate; // 비용
		double income = valueOfSupply - expense; // 이익
		double[] dividendRates = { 0.5, 0.3, 0.2 }; // 동업자

		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total: " + total);
		System.out.println("Expense: " + expense);
		System.out.println("Income: " + income);
		for (int i = 0; i < dividendRates.length; i++) {
			System.out.println("Dividend " + (i + 1) + ": " + dividendRates[i] * income);
		}
		
	}

}
