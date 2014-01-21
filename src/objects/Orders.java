package objects;

import java.util.ArrayList;

public class Orders {
	private ArrayList<TradeOrder> bids;
    private ArrayList<TradeOrder> asks;
    
    public Orders(ArrayList<TradeOrder> bids, ArrayList<TradeOrder> asks) {
    	this.bids = bids;
    	this.asks = asks;
    }
    
	public ArrayList<TradeOrder> getBids() {
		return bids;
	}
	
	public ArrayList<TradeOrder> getAsks() {
		return asks;
	}
}
