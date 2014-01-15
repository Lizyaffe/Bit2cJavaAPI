package objects;

public class CheckoutLinkModel {
	private double Price;
    private String Description;
    private CoinType CoinType;
    private String ReturnURL;
    private String CancelURL;
    private boolean NotifyByEmail;
    
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public CoinType getCoinType() {
		return CoinType;
	}
	public void setCoinType(CoinType coinType) {
		CoinType = coinType;
	}
	
	public String getReturnURL() {
		return ReturnURL;
	}
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	
	public String getCancelURL() {
		return CancelURL;
	}
	public void setCancelURL(String cancelURL) {
		CancelURL = cancelURL;
	}
	
	public boolean isNotifyByEmail() {
		return NotifyByEmail;
	}
	public void setNotifyByEmail(boolean notifyByEmail) {
		NotifyByEmail = notifyByEmail;
	}
}
