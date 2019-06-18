package sample;

import lib.Input;

public class Sample09_02 {

	public static void main(String[] args) {
		int number;
		while((number=Input.getInt())!=0) {
			System.out.println(number+"を入力");
		}

	}

}
