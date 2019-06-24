package exercise;

public class Ex12_02_1 {

	public static void main(String[] args) {
		greet("田中宏",1);

	}

	public static void greet(String name,int gender) {
		if(gender==1) {
			System.out.println("こんにちは"+name+"くん");
		}else {
			System.out.println("こんにちは"+name+"さん");
		}
	}
}
