package simple_com;

public class compund_Interest {
	double amt,noofyrs,intrstrate;
	public compund_Interest(double amt,double noofyrs,double intrstrate) {
		this.amt=amt;
		this.intrstrate=intrstrate;
		this.noofyrs=noofyrs;
	}
	public double calculat() {
		return amt * Math.pow (1.0+intrstrate/100.0, noofyrs) - amt;
	}
}
