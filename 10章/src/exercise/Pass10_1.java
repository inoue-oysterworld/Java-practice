package exercise;

import lib.Input;

public class Pass10_1 {

	public static void main(String[] args) {
		String s;
		while((s=Input.getString())!=null) {
			if(s.equals("dog")) {
				System.out.println("犬");
			}else if(s.equals("cat")) {
				System.out.println("猫");
			}else if(s.equals("rabbit")) {
				System.out.println("うさぎ");
			}else if(s.equals("mouse")){
				System.out.println("ねずみ");
			}else {
				System.out.println("?");
			}
		}

	}

}
