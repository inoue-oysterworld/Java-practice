package ex14_01_1;

public class Card {
	String suit;//カードの種類
	int number;//札番号
	String face() {//カードを表す文字列を返す
		return suit+"/"+number;
	}
	//コンストラクタ
	public Card(String suit,int number) {
		this.suit=suit;
		this.number=number;
	}

}
