package objects;

import java.util.ArrayList;

public class NewOrders {
	private ArrayList<OrderData> bids;
    private ArrayList<OrderData> asks;
    
    public NewOrders()
    {
        setBids(new ArrayList<OrderData>());
        setAsks(new ArrayList<OrderData>());
    }

	public ArrayList<OrderData> getBids() {
		return bids;
	}

	public void setBids(ArrayList<OrderData> bids) {
		this.bids = bids;
	}

	public ArrayList<OrderData> getAsks() {
		return asks;
	}

	public void setAsks(ArrayList<OrderData> asks) {
		this.asks = asks;
	}
}
