package exercise;

import lib.Input;

public class Ex10_02_1 {

	public static void main(String[] args) {
		int nin=Input.getInt("人数を入力してください：");
		int ryoukin = nin*850;
		if(nin>=5) ryoukin*=0.7;
		System.out.println("入館料は"+Math.round(ryoukin)+"円です");


	}

}
