package simple_com;

public class simple_Interest {
	double amt,noofyrs,intrstrate;
	public simple_Interest(double amt,double noofyrs,double intrstrate) {
		this.amt=amt;
		this.intrstrate=intrstrate;
		this.noofyrs=noofyrs;
	}
	public double calculate() {
		return (amt * noofyrs * intrstrate)/100;
	}
}
