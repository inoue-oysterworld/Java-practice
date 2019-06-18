package exercise;

public class Pass11_2 {

	public static void main(String[] args) {
		int[] val= {10,-12,5,-12,12,25};
		for(int x:val) {
			if(x<0) {
				System.out.println("負の値です");
				continue;
			}else {
				System.out.println(Math.sqrt(x));

			}
		}

	}

}
