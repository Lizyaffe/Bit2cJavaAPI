package objects;

import java.util.ArrayList;

public class OrderBook {
	private ArrayList<ArrayList<Double>> asks;
	private ArrayList<ArrayList<Double>> bids;
	
	public OrderBook() {
		
	}
	
	public OrderBook(ArrayList<ArrayList<Double>> asks, ArrayList<ArrayList<Double>> bids) {
		this.asks = asks;
		this.bids = bids;
	}
	
	public ArrayList<ArrayList<Double>> getAsks() {
		return asks;
	}
	public void setAsk(ArrayList<ArrayList<Double>> asks) {
		this.asks = asks;
	}
	
	public ArrayList<ArrayList<Double>> getBids() {
		return bids;
	}
	public void setBid(ArrayList<ArrayList<Double>> bids) {
		this.bids = bids;
	}
}
