package objects;

import java.util.Date;

public class TradeOrder {
	private double a;
    private Date d;
    private double id;
    private double p;
    private PairType pair;
    private boolean isBid;
    private OrderStatusType s;
    
    public TradeOrder(double a, Date d, double id, double p, PairType pair, boolean isBid, OrderStatusType s) {
    	this.a = a;
    	this.d = d;
    	this.id = id;
    	this.p = p;
    	this.pair = pair;
    	this.isBid = isBid;
    	this.s = s;
    }
    
	public double getA() {
		return a;
	}
	
	public Date getD() {
		return d;
	}
	
	public double getId() {
		return id;
	}
	
	public double getP() {
		return p;
	}
	
	public PairType getPair() {
		return pair;
	}
	
	public boolean isBid() {
		return isBid;
	}
	
	public OrderStatusType getS() {
		return s;
	}
}
