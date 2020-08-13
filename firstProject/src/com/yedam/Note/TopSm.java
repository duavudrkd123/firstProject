package com.yedam.Note;

public class TopSm {
	public static void main(String[] args) {
//		int d = 10;
//		for (int b = 10; b > 0; b-=1) {
//			for (int a = b; a > 0; a--) {
//				System.out.print(" ");
//			}
//			for (int c = 11 ; c > d; c-=1) {
//				System.out.print("*");
//			}
//			d -=2;
//			System.out.println();
//		}
		
		for(int a=10, b=1; a>=0; a--,b++) {
			int i = 0, x = 10;
			while(i < a) {
			System.out.print("#");
			i++;
			}
			while(x > b) {
			System.out.print("*");
			x--;
			}
			System.out.println();
		}
	}
}
