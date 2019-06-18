package sample;

public class Sample05_06 {

	public static void main(String[] args) {
		String ss = "abAB日本語ａｂＡＢ";

		int len = ss.length();//文字の長さ
		int pos = ss.indexOf("日");//"日"の出現位置
		char ch = ss.charAt(4);//4番目の文字
		String str = ss.toLowerCase();//小文字変換

		System.out.println("長さ=" + len);
		System.out.println("\"日\"は" + pos + "番目");
		System.out.println("4番目の文字は" + ch);
		System.out.println(ss + "⇒" + str);

	}

}
