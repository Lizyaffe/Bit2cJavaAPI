package objects;

import java.util.ArrayList;

public class OrderBook {
	private ArrayList<ArrayList<Double>> ask;
	private ArrayList<ArrayList<Double>> bid;
	
	public ArrayList<ArrayList<Double>> getAsk() {
		return ask;
	}
	public void setAsk(ArrayList<ArrayList<Double>> ask) {
		this.ask = ask;
	}
	
	public ArrayList<ArrayList<Double>> getBid() {
		return bid;
	}
	public void setBid(ArrayList<ArrayList<Double>> bid) {
		this.bid = bid;
	}
}
