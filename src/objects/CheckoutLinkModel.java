package objects;

public class CheckoutLinkModel {
	public double price;
	public String description;
	public CoinType coinType;
	public String returnURL;
	public String cancelURL;
	public boolean notifyByEmail;
    
    public CheckoutLinkModel(double price, String description, CoinType coinType, String returnURL, String cancelURL, boolean notifyByEmail) {
    	this.price = price;
    	this.description = description;
    	this.coinType = coinType;
    	this.returnURL = returnURL;
    	this.cancelURL = cancelURL;
    	this.notifyByEmail = notifyByEmail;
    }
    
//	public double getPrice() {
//		return this.price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	public String getDescription() {
//		return this.description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	
//	public CoinType getCoinType() {
//		return this.coinType;
//	}
//	public void setCoinType(CoinType coinType) {
//		this.coinType = coinType;
//	}
//	
//	public String getReturnURL() {
//		return this.returnURL;
//	}
//	public void setReturnURL(String returnURL) {
//		this.returnURL = returnURL;
//	}
//	
//	public String getCancelURL() {
//		return this.cancelURL;
//	}
//	public void setCancelURL(String cancelURL) {
//		this.cancelURL = cancelURL;
//	}
//	
//	public boolean isNotifyByEmail() {
//		return this.notifyByEmail;
//	}
//	public void setNotifyByEmail(boolean notifyByEmail) {
//		this.notifyByEmail = notifyByEmail;
//	}
}
