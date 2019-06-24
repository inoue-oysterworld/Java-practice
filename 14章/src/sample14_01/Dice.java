package sample14_01;

public class Dice {
	int val;//回数
	//コンストラクタ
	public Dice(int val) {
		this.val=val;
	}
	//コンストラクタのオーバーロード
	public Dice() {
		val=1;
	}
	public void play() {
		val=(int)(Math.random()*6)+1;
	}

}
