package objects;

public class UserBalance {
	private double BalanceBTC;
	private double BalanceLTC;
	private double BalanceNIS;
	
	public UserBalance(double BalanceBTC, double BalanceLTC, double BalanceNIS) {
		this.BalanceBTC = BalanceBTC;
		this.BalanceLTC = BalanceLTC;
		this.BalanceNIS = BalanceNIS;
	}
	
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
}
