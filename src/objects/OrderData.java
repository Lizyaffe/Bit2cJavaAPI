package objects;

public class OrderData {
	private double Amount;
    private double Price;
    private double Total;
    private boolean IsBid;
    private PairType Pair;
    
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	
	public boolean isIsBid() {
		return IsBid;
	}
	public void setIsBid(boolean isBid) {
		IsBid = isBid;
	}
	
	public PairType getPair() {
		return Pair;
	}
	public void setPair(PairType pair) {
		Pair = pair;
	}
}
