package commercialdataprocessing;

import java.util.ArrayList;
import java.util.Scanner;

import stockaccountmanagement.StockValues;

public class StockAccount {
	String name;
	private ArrayList<Company> stockList = new ArrayList<Company>();
	Company company = new Company();
	Main main = new Main();

	public ArrayList<Company> getStockList() {
		return stockList;
	}

	void buy(Company stock) {
		stockList.add(stock);
	}

	void sell(Company stock) {
		stockList.remove(stock);
	}

	void printReport(ArrayList<Company> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println(stockList.get(i));
		}
	}

	void addCompany(Company stock) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company name :");
		stock.setStockSymbol(sc.nextLine());
		System.out.println("Enter No.of Shares :");
		stock.setNumOfShares(sc.nextInt());
		System.out.println("Enter share value");
		stock.setShareValue(sc.nextInt());
		stock.setTotalValueOfShares(stock.getNumOfShares() * stock.getShareValue());
	}
}
