package exercise;

import lib.Input;

public class Pass12_2 {

	public static void main(String[] args) {
		String s=Input.getString("テストする文字列");
		isEmpty(s);

	}

	public static void isEmpty(String s) {
		if(s==null || s=="") {
			System.out.println("nullまたは空");
		}else {
			System.out.println("nullでも空でもない");
		}
	}

}
