package lib;

public class Calculation_lib {
	
	//フィールドの定義
	private int m,n;

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	//足し算
	public int getPlus(){
		return m+n;
	}
	//引き算
	public int getMinus(){
		return m-n;
	}
	//掛け算
	public int getMultiple(){
		return m*n;
	}
	//割り算
	public int getDivide(){
		return m/n;
	}

	
}
