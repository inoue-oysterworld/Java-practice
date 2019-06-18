package exercise;

import lib.Input;

public class Ex10_04_1 {

	public static void main(String[] args) {
		double weight=Input.getDouble("重さ(kg)");
		int postage;
		if(weight<1) {
			postage=300;
		}else if(weight<5){
			postage=500;
		}else if(weight<10) {
			postage=800;
		}else {
			postage=1500;
		}
		System.out.println("送料は"+postage+"円です");

	}

}
