package objects;

import java.util.Calendar;

public class AccountRaw {
	private double BalanceBTC;
	private double BalanceLTC;
	private double BalanceNIS;
	private Double BTC;
	private Double LTC;
	private Double NIS;
	private Calendar Created;
	private Double Fee;
	private Double FeeInNIS;
	private double id;
	private Calendar OrderCreated;
	private Double PricePerCoin;
	private String Ref;
	private int TypeId;
	
	public double getBalanceBTC() {
		return BalanceBTC;
	}
	public void setBalanceBTC(double balanceBTC) {
		BalanceBTC = balanceBTC;
	}
	
	public double getBalanceLTC() {
		return BalanceLTC;
	}
	public void setBalanceLTC(double balanceLTC) {
		BalanceLTC = balanceLTC;
	}
	
	public double getBalanceNIS() {
		return BalanceNIS;
	}
	public void setBalanceNIS(double balanceNIS) {
		BalanceNIS = balanceNIS;
	}
	
	public Double getBTC() {
		return BTC;
	}
	public void setBTC(Double bTC) {
		BTC = bTC;
	}
	
	public Double getLTC() {
		return LTC;
	}
	public void setLTC(Double lTC) {
		LTC = lTC;
	}
	
	public Double getNIS() {
		return NIS;
	}
	public void setNIS(Double nIS) {
		NIS = nIS;
	}
	
	public Calendar getCreated() {
		return Created;
	}
	public void setCreated(Calendar created) {
		Created = created;
	}
	
	public Double getFee() {
		return Fee;
	}
	public void setFee(Double fee) {
		Fee = fee;
	}
	
	public Double getFeeInNIS() {
		return FeeInNIS;
	}
	public void setFeeInNIS(Double feeInNIS) {
		FeeInNIS = feeInNIS;
	}
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	
	public Calendar getOrderCreated() {
		return OrderCreated;
	}
	public void setOrderCreated(Calendar orderCreated) {
		OrderCreated = orderCreated;
	}
	
	public Double getPricePerCoin() {
		return PricePerCoin;
	}
	public void setPricePerCoin(Double pricePerCoin) {
		PricePerCoin = pricePerCoin;
	}
	
	public String getRef() {
		return Ref;
	}
	public void setRef(String ref) {
		Ref = ref;
	}
	
	public int getTypeId() {
		return TypeId;
	}
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
}
