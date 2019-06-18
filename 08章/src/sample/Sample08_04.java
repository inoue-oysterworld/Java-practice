package sample;

import lib.Input;

public class Sample08_04 {

	public static void main(String[] args) {
		int a = Input.getInt();
		int b = Input.getInt();
		//論理式を評価する
		boolean b1 = a > 0 && a < 20;
		boolean b2 = a <= 0 || a >= 20;
		boolean b3 = !(a > 0 && a < 20);
		boolean b4 = (a == 0) ^ (b == 0);
		//結果を表示
		System.out.println("a > 0 && a < 20 = " + b1);
		System.out.println("a <= 0 || a >= 20 = " + b2);
		System.out.println("!(a > 0 && a < 20) = " + b3);
		System.out.println("(a==0)^(b==0) = " + b4);

	}

}
