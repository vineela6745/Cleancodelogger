package eclipse_workspace.cleancode;

public class intrest {

	public intrest() {
		
	}

	public double simpleIntrest(double p, double t, double r) {
		return (p*t*r)/100;
	}

	public double compoundIntrest(double p, double t, double r) {
		double ci = p*(Math.pow(1+(r/100), t));
		return ci;
	}

}
