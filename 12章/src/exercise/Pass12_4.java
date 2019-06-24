package exercise;

import lib.Input;

public class Pass12_4 {

	public static void main(String[] args) {
		int height=Input.getInt("高さ(cm):");
		int width=Input.getInt("幅(cm):");
		int depth=Input.getInt("奥行(cm):");
		if(isOk(height,width,depth)==true) {
			int weight=Input.getInt("重さ(kg)");
			System.out.println("送料："+ryokin(height,width,depth,weight)+"円");
		}else {
			System.out.println("サイズオーバー");
		}

	}
	public static boolean isOk(int height,int width,int depth) {
		if(height+width+depth>180) {
			return false;
		}else {
			return true;
		}
	}
	public static int ryokin(int height,int width,int depth,int weight) {
		if(height+width+depth<=90) {
			if(weight>10) {
				return 1500;
			}else if(weight>5) {
				return 1000;
			}else {
				return 500;
			}
		}else {
			if(weight>10) {
				return 3000;
			}else if(weight>5) {
				return 2000;
			}else {
				return 1000;
			}
		}
	}

}
