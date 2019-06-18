package exercise;

public class Pass10_5 {

	public static void main(String[] args) {
		String[] name= {"田中","前田","鈴木","中村","田辺","浦川","島田","岩田"};
		int[] drinking= {7,0,3,3,2,0,0,6};
		int[] smoking= {60,10,0,20,10,0,30,0};
		for(int i=0;i<name.length;i++) {
			if(drinking[i]==0 && smoking[i]==0) {
				System.out.println(name[i]+"("+drinking[i]+","+smoking[i]+")"+"安全");
			}else if((drinking[i]==0 && smoking[i]<=20) || (drinking[i]<=3 && smoking[i]==0)) {
				System.out.println(name[i]+"("+drinking[i]+","+smoking[i]+")"+"注意");
			}else if(drinking[i]<=3 && smoking[i]<=20) {
				System.out.println(name[i]+"("+drinking[i]+","+smoking[i]+")"+"要指導");
			}else {
				System.out.println(name[i]+"("+drinking[i]+","+smoking[i]+")"+"要検査");
			}
		}

	}

}
