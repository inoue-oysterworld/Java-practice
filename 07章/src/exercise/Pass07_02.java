package exercise;

public class Pass07_02 {

	public static void main(String[] args) {
		String[] name = { "田中", "中村", "鈴木", "山本", "本田" };
		double[] kokugo = { 82, 85, 74, 90, 70 };
		double[] eigo = { 70, 74, 88, 74, 82 };
		double kokugoTotal = 0, eigoTotal = 0;

		for(double x : kokugo) {
			kokugoTotal += x;
		}
		System.out.println("国語平均=" + kokugoTotal / name.length);

		for(double x : eigo) {
			eigoTotal += x;
		}
		System.out.println("英語平均=" + eigoTotal / name.length);
		System.out.println("科目平均=" + (kokugoTotal + eigoTotal) / (kokugo.length + eigo.length));
		for(int i = 0; i < name.length; i++) {
			System.out.println((kokugo[i] + eigo[i]) / 2);
		}

	}

}
