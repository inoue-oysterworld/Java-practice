package exercise;

import lib.Input;

public class Pass10_3 {

	public static void main(String[] args) {
		int data;
		while((data=Input.getInt())!=0) {
			if(data<3 || data==12) {
				System.out.println("冬");
			}else if(data<6) {
				System.out.println("春");
			}else if(data<9) {
				System.out.println("夏");
			}else if(data<12){
				System.out.println("秋");
			}else {
				System.out.println("?");
			}
		}

	}

}
