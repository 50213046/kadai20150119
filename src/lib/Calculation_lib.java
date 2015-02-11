package lib;

public class Calculation_lib {
	
	//ƒtƒB[ƒ‹ƒh‚Ì’è‹`
	private int m,n;

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	//‘«‚µZ
	public int getPlus(){
		return m+n;
	}
	//ˆø‚«Z
	public int getMinus(){
		return m-n;
	}
	//Š|‚¯Z
	public int getMultiple(){
		return m*n;
	}
	//Š„‚èZ
	public int getDivide(){
		return m/n;
	}

	
}
