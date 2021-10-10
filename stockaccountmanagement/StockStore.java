package stockaccountmanagement;

import java.util.ArrayList;

public class StockStore {
	private ArrayList<StockValues> stockList = new ArrayList<StockValues>();

	public ArrayList<StockValues> getStockList() {
		return stockList;
	}

	public void add(StockValues stock) {
		stockList.add(stock);
	}

	public void remove(StockValues stock) {
		stockList.remove(stock);
	}
}
