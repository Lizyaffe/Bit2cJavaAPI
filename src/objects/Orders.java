package objects;

import java.util.ArrayList;

public class Orders {
	private ArrayList<TradeOrder> bids;
    private ArrayList<TradeOrder> asks;
    
	public ArrayList<TradeOrder> getBids() {
		return bids;
	}
	public void setBids(ArrayList<TradeOrder> bids) {
		this.bids = bids;
	}
	
	public ArrayList<TradeOrder> getAsks() {
		return asks;
	}
	public void setAsks(ArrayList<TradeOrder> asks) {
		this.asks = asks;
	}
}
