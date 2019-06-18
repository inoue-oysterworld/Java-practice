package exercise;

import lib.Input;

public class Ex08_07_1 {

	public static void main(String[] args) {
		int n = Input.getInt("西暦(年)");
		String s = (n % 4 == 0 && n % 100 != 0) || n % 400 == 0 ? "うるう年です" : "平年です";
		System.out.println(s);

	}

}