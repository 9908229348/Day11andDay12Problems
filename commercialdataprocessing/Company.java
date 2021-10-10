package commercialdataprocessing;

public class Company {
	private String stockSymbol;
	private double numOfShares, shareValue, totalValueOfShares;

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public double getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(double numOfShares) {
		this.numOfShares = numOfShares;
	}

	public double getShareValue() {
		return shareValue;
	}

	public void setShareValue(double shareValue) {
		this.shareValue = shareValue;
	}

	public double getTotalValueOfShares() {
		return totalValueOfShares;
	}

	public void setTotalValueOfShares(double totalValueOfShares) {
		this.totalValueOfShares = totalValueOfShares;
	}

	@Override
	public String toString() {
		return "Company [stockSymbol=" + stockSymbol + ", numOfShares=" + numOfShares + ", shareValue=" + shareValue
				+ ", totalValueOfShares=" + totalValueOfShares + "]";
	}
}
