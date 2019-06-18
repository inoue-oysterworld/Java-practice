package exercise;

import lib.Input;

public class Pass05_04 {

	public static void main(String[] args) {
		String str1, str2, str3;
		str1 = Input.getString();
		int n = str1.length();
		str2 = str1.toUpperCase();
		if(n >= 10) {
			str3 = str1.substring(0, 5);
			System.out.println("str1=" + str1);
			System.out.println("n =" + n);
			System.out.println("str2=" + str2);
			System.out.println("str3=" + str3);
		} else {
			System.out.println("入力が10文字以下です");
			System.out.println("処理を実行できません");
		}

	}

}
