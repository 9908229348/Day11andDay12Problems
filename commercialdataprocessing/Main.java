package commercialdataprocessing;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double totalValue = 0;
		Company company = new Company();
		company.setStockSymbol("TATA");
		company.setNumOfShares(100);
		company.setShareValue(10000);
		company.setTotalValueOfShares(company.getNumOfShares() * company.getShareValue());
		totalValue = totalValue + company.getTotalValueOfShares();
		StockAccount stock = new StockAccount();
		stock.buy(company);

		Scanner scan = new Scanner(System.in);
		boolean check = true;
		while (check == true) {
			System.out.println("Enter 1.Buy the Company Shares 2.Sell the Company Shares 3.Display ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Company companies = new Company();
				stock.addCompany(companies);
				totalValue = totalValue + companies.getTotalValueOfShares();
				stock.buy(companies);
				break;
			case 2:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name of company you want to sell");
				String name = sc.nextLine();
				if (company.getStockSymbol().equalsIgnoreCase(name))
					stock.sell(company);
				totalValue = totalValue - company.getTotalValueOfShares();
				break;
			case 3:
				System.out.println("StockAccount");
				stock.printReport(stock.getStockList());
				System.out.println("TotalValue is :" + totalValue);
				break;
			default:
				check = false;
				System.out.println("Invalid choice and Exited");
			}
		}
	}
}
