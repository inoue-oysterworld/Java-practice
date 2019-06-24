package exercise;

import lib.Input;

public class Ex12_05_1 {

	public static void main(String[] args) {
		int kosu=Input.getInt("個数");
		int tanka=Input.getInt("単価");
		int sougaku=kosu*tanka;
		double ritu=nebikiRitu(kosu);
		print(sougaku,ritu);

	}
	public static double nebikiRitu(int kosu) {
		double ritu;
		if(kosu<100) {
			ritu=0.0;
		}else if(kosu<500) {
			ritu=0.05;
		}else {
			ritu=0.1;
		}
		return ritu;
	}

	public static void print(int sougaku,double ritu) {
		System.out.println("販売額="+sougaku);
		System.out.println("値引き="+(int)(ritu*sougaku));
		System.out.println("売上="+(int)(sougaku-sougaku*ritu));
	}

}
