package sample;

import lib.Input;

public class Sample11_07 {

	public static void main(String[] args) {
		for(int i=0;i<2;i++) {
			int data,total=0;
			while((data=Input.getInt("データ"))!=0) {
				if(data<0) {
					System.out.println("不正なデータ:"+data);
					break;
				}
				total+=data;
			}
			System.out.println("合計="+total);
		}
		System.out.println("END");

	}

}
