package exercise;

import lib.Input;

public class Pass12_1 {

	public static void main(String[] args) {
		double mile=Input.getDouble("mile");
		System.out.println(mile+"マイル="+mileToKm(mile)+"キロ");

	}
	public static double mileToKm(double km) {
		return km*1.609344;
	}

}
