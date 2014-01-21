package objects;

import java.util.Date;

public class AccountRaw {
	private Double BalanceBTC;
	private Double BalanceLTC;
	private Double BalanceNIS;
	private Double BTC;
	private Double LTC;
	private Double NIS;
	private Date Created;
	private Double Fee;
	private Double FeeInNIS;
	private Double id;
	private Date OrderCreated;
	private Double PricePerCoin;
	private String Ref;
	private int TypeId;
	
	public AccountRaw(double BalanceBTC, double BalanceLTC, double BalanceNIS, Double BTC, Double LTC, Double NIS, Date Created, Double Fee, Double FeeInNIS, Double id, Date OrderCreated, Double PricePerCoin, String Ref, int TypeId) {
		this.BalanceBTC = BalanceBTC;
		this.BalanceLTC = BalanceLTC;
		this.BalanceNIS = BalanceNIS;
		this.BTC = BTC;
		this.LTC = LTC;
		this.NIS = NIS;
		this.Created = Created;
		this.Fee = Fee;
		this.FeeInNIS = FeeInNIS;
		this.id = id;
		this.OrderCreated = OrderCreated;
		this.PricePerCoin = PricePerCoin;
		this.Ref = Ref;
		this.TypeId = TypeId;
	}
	
	public double getBalanceBTC() {
		return BalanceBTC;
	}
	
	public double getBalanceLTC() {
		return BalanceLTC;
	}
	
	public double getBalanceNIS() {
		return BalanceNIS;
	}
	
	public Double getBTC() {
		return BTC;
	}
	
	public Double getLTC() {
		return LTC;
	}
	
	public Double getNIS() {
		return NIS;
	}
	
	public Date getCreated() {
		return Created;
	}
	
	public Double getFee() {
		return Fee;
	}
	
	public Double getFeeInNIS() {
		return FeeInNIS;
	}
	
	public double getId() {
		return id;
	}
	
	public Date getOrderCreated() {
		return OrderCreated;
	}
	
	public Double getPricePerCoin() {
		return PricePerCoin;
	}
	
	public String getRef() {
		return Ref;
	}
	
	public int getTypeId() {
		return TypeId;
	}
}
