package ex14_02_2;

public class Exec {

	public static void main(String[] args) {
		Card card1=new Card("ハート");
		Card card2=new Card(9);
		Card card3=new Card();
		System.out.println(card1.face());
		System.out.println(card2.face());
		System.out.println(card3.face());

	}

}
