package sample;

public class Sample04_01 {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = ++a + 5;
		System.out.println(a);
		System.out.println(b);
		a = 10;
		b = a++ + 5;
		System.out.println(a);
		System.out.println(b);
	}

}
