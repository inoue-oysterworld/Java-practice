package exercise;

import lib.Input;

public class Pass11_1 {

	public static void main(String[] args) {
		int quantity,total=0;
		String code;
		quantity=Input.getInt("商品の数量");
		code=Input.getString("商品コード");
		if(code==null) {
			System.out.println("不正なコード:"+code);
		}else {

			switch(code) {
			case "a100":
			case "b100":
				total=quantity*100;
			case "a110":
			case "b110":
			case "b120":
				total=quantity*200;
			case "c100":
			case "c110":
				total=quantity*300;
			case "d100":
				total=quantity*400;
			default:
				total=quantity*500;
			}
		}
		System.out.println("合計金額="+total+"円");

	}

}
