package exercise;

public class Pass12_3 {

	public static void main(String[] args) {
		int[] dt={5,7,9,14,7,4,2};
		graph(dt);

	}
	public static void graph(int[] cnt) {
		for(int x:cnt) {
			drow(x);
			System.out.println();
		}

	}
	public static void drow(int dots) {
		for(int i=0;i<dots;i++)
		System.out.print("#");
	}

}
