package objects;

public class OrderData {
	public double amount;
	public double price;
	public double total;
	public boolean isBid;
	public PairType pair;
    
	public OrderData(double amount, boolean isBid, PairType pair, double price, double total) {
		this.amount = amount;
		this.price = price;
		this.total = total;
		this.isBid = isBid;
		this.pair = pair;
	}
	
//	public double getAmount() {
//		return this.amount;
//	}
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//	
//	public double getPrice() {
//		return this.price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	public double getTotal() {
//		return this.total;
//	}
//	public void setTotal(double total) {
//		this.total = total;
//	}
//	
//	public boolean isIsBid() {
//		return this.isBid;
//	}
//	public void setIsBid(boolean isBid) {
//		this.isBid = isBid;
//	}
//	
//	public PairType getPair() {
//		return this.pair;
//	}
//	public void setPair(PairType pair) {
//		this.pair = pair;
//	}
}
