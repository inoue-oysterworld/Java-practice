package exercise;

import lib.Input;

public class Pass05_03 {

	public static void main(String[] args) {
		double a, b, c, ans1, ans2;
		a = Input.getDouble();
		b = Input.getDouble();
		c = Input.getDouble();
		ans1 = Math.pow(a, 2) + Math.pow(b, 2) - 2 * c;
		ans2 = Math.sqrt(a) + Math.sqrt(b) + 3 * c;
		System.out.println("(1)=" + ans1);
		System.out.println("(2)=" + ans2);

	}

}
