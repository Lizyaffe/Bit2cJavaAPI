package objects;

import java.util.Calendar;

public class TradeOrder {
	private double a;
    private Calendar d;
    private double id;
    private double p;
    private PairType pair;
    private boolean isBid;
    private OrderStatusType s;
    
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public Calendar getD() {
		return d;
	}
	public void setD(Calendar d) {
		this.d = d;
	}
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	
	public PairType getPair() {
		return pair;
	}
	public void setPair(PairType pair) {
		this.pair = pair;
	}
	
	public boolean isBid() {
		return isBid;
	}
	public void setBid(boolean isBid) {
		this.isBid = isBid;
	}
	
	public OrderStatusType getS() {
		return s;
	}
	public void setS(OrderStatusType s) {
		this.s = s;
	}
}
