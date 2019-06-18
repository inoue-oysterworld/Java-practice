package exercise;
import lib.Input;
public class Pass09_03 {
	public static void main(String[] args) {
		int cmd;
		do {
			System.out.println(Math.random());
			cmd = Input.getInt();
		} while (cmd == 1);
	}
}