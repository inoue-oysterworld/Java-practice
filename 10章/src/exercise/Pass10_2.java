package exercise;

import lib.Input;

public class Pass10_2 {

	public static void main(String[] args) {
		int postage=0,distance=Input.getInt("距離(km：)");
		if(distance<50) {
			postage=300;
		}else if(distance<100){
			postage=500;
		}else if(distance<500) {
			postage=700;
		}else {
			postage=1000;
		}
		System.out.println("料金="+postage);

	}

}
