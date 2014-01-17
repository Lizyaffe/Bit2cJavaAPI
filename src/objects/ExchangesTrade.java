package objects;

public class ExchangesTrade {
	private double date;
	private double price;
	private double amount;
	private double tid;
	
	public ExchangesTrade(double date, double price, double amout, double tid) {
		this.date = date;
		this.price = price;
		this.amount = amout;
		this.tid = tid;
	}
	
	public double getDate() {
		return date;
	}
	public void setDate(double date) {
		this.date = date;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getTid() {
		return tid;
	}
	public void setTid(double tid) {
		this.tid = tid;
	}
}
