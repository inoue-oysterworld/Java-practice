package exercise;

public class Pass07_01 {

	public static void main(String[] args) {
		double[] x = { 12.3, 13.5, 11.5, 13.0, 12.8, 12.5 };
		double total = 0;
		for(double y : x) {
			total += y;
		}
		System.out.println("合計=" + total);
		System.out.println("平均=" + total / x.length);
		for(double z : x) {
			System.out.print(z + "\t");
		}

	}

}
