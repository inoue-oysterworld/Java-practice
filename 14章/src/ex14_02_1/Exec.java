package ex14_02_1;

public class Exec {

	public static void main(String[] args) {
		Dice dice1=new Dice("赤");
		Dice dice2=new Dice();
		System.out.println("dice1="+dice1.val+"/"+dice1.color);
		System.out.println("dice2="+dice2.val+"/"+dice2.color);

	}

}
