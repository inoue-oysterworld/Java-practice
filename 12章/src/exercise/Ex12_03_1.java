package exercise;

import lib.Input;

public class Ex12_03_1 {

	public static void main(String[] args) {
		int tanka=Input.getInt("単価");
		double ritu=Input.getDouble("税率");
		System.out.println(tax(tanka,ritu)+"円");

	}

	public static int tax(int x,double y) {
		int z=(int)(x*y);
		return z;
	}

}
