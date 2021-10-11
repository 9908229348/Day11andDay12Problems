package commercialdataprocessing;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
	String name;
	private ArrayList<Company> stockList = new ArrayList<Company>();
	Company company = new Company();
	Main main = new Main();
	// StockAccount stockAccount = new StockAccount();
	Scanner sc = new Scanner(System.in);

	public ArrayList<Company> getStockList() {
		return stockList;
	}

	void buy(Company stock) {
		stockList.add(stock);
	}

	void sell(Company company) {
		System.out.println("Enter name of company you want to sell");
		String name = sc.nextLine();
		for (int i = 0; i < stockList.size(); i++) {
			if (stockList.get(i).getStockSymbol().equalsIgnoreCase(name) == true) {
				Main.totalValue = Main.totalValue - stockList.get(i).getTotalValueOfShares();
				stockList.remove(stockList.get(i));
			}
		}
	}

	void printReport(ArrayList<Company> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println(stockList.get(i));
		}
	}

	void addCompany(Company stock) {
		System.out.println("Enter Company name :");
		stock.setStockSymbol(sc.nextLine());
		System.out.println("Enter No.of Shares :");
		stock.setNumOfShares(sc.nextInt());
		System.out.println("Enter share value");
		stock.setShareValue(sc.nextInt());
		sc.nextLine();
		stock.setTotalValueOfShares(stock.getNumOfShares() * stock.getShareValue());
	}
}
