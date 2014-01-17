package objects;

public class Ticker {
	private double h;
	private double l;
	private double ll;
	private double a;
	private double av;
	
	public Ticker(double h, double l, double ll, double a, double av) {
		this.h = h;
		this.l = l;
		this.ll = ll;
		this.a = a;
		this.av = av;
	}
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	
	public double getLl() {
		return ll;
	}
	public void setLl(double ll) {
		this.ll = ll;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public double getAv() {
		return av;
	}
	public void setAv(double av) {
		this.av = av;
	}
}
