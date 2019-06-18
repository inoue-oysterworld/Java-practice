package exercise;

public class Pass05_01 {

	public static void main(String[] args) {
		int a = 10, b = 3, c = 2;
		double x = Math.max(Math.pow(a, 3), Math.pow(b, 5));
		System.out.println(x);
		double y = Math.random() * -a + Math.random() * a;
		System.out.println(y);
		long z = (2 * a + b) / c;
		System.out.println(z);

	}

}
