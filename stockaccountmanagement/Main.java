package stockaccountmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalStock = 0;

		UserInterface userInterface = new UserInterface();
		StockStore stockStore = new StockStore();

		boolean check = true;
		while (check == true) {
			System.out.println("Enter 1.Add Stock 2.Display");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				StockValues stock = new StockValues();
				userInterface.addStock(stock);
				totalStock = totalStock + stock.getTotalValueOfStock();
				stockStore.add(stock);
				break;
			case 2:
				System.out.println("StockStore");
				userInterface.print(stockStore.getStockList());
				System.out.println("Value of Total Stocks is : " + totalStock);
			default:
				check = false;
			}
		}
	}
}
