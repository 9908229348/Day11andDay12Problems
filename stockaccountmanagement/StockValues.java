package stockaccountmanagement;

public class StockValues {
	private String shareName;
	private double numOfShares;
	private double sharePrice;
	private double totalValueOfStock;

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public double getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(double numOfShares) {
		this.numOfShares = numOfShares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getTotalValueOfStock() {
		return totalValueOfStock;
	}

	public void setTotalValueOfStock(double totalValueOfStock) {
		this.totalValueOfStock = totalValueOfStock;
	}

	@Override
	public String toString() {
		return "StockValues [shareName=" + shareName + ", numOfShares=" + numOfShares + ", sharePrice=" + sharePrice
				+ ", totalValueOfStock=" + totalValueOfStock + "]";
	}
}
