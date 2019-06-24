package ex14_02_2;

public class Card {
	//フィールド変数
	String suit;//カードの種類
	int number;//番号
	//コンストラクタ
	public Card(String suit,int number) {
		this.suit=suit;
		this.number=number;
	}
	public Card(String suit) {
		this(suit,1);
	}
	public Card(int number) {
		this("スペード",number);
	}
	//デフォルトコンストラクタ
	public Card() {
		this("スペード",1);
	}

	String face() {
		return suit+"/"+number;

	}


}
