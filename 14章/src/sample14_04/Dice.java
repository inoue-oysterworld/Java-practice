package sample14_04;

public class Dice {
	//フィールド変数
	int val;//目数
	String color;//色

	//コンストラクタ
	public Dice(int val,String color) {
		this.val=val;
		this.color=color;
	}
	public Dice(String color) {
		this(1,color);//目数は1
	}
	//デフォルトコンストラクタ
	public Dice() {
		this(1,"白");//目数は1、色は白
	}
	//インスタンスメソッド
	public void play() {
		val=(int)(Math.random()*6)+1;
	}

}
