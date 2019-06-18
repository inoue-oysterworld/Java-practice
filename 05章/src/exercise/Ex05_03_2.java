package exercise;

import lib.Input;

public class Ex05_03_2 {
	public static void main(String[] args) {
		double x = Input.getDouble("xの値");
		double y = Input.getDouble("yの値");
		System.out.println("Math.pow(x, 3) ÷ Math.pow(y, 3)=" + Math.pow(x, 3) / Math.pow(y, 3));
	}

}
