package sample13_01;

public class Exec {

	public static void main(String[] args) {
		Dice dice=new Dice();//Diceオブジェクトを作る
		dice.val=1;
		System.out.println("目数="+dice.val);
		dice.play();
		System.out.println("目数="+dice.val);

	}

}
