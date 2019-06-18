package exercise;

import lib.Input;

public class Ex10_05_1 {

	public static void main(String[] args) {
		int san=0,other=0,data;
		while((data=Input.getInt())!=0) {
			if(data%3==0) {
				san++;
			}else {
				other++;
			}
		}
		System.out.println("3の倍数="+san);
		System.out.println("その他="+other);

	}

}
