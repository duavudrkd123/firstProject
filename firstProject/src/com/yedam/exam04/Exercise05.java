package com.yedam.exam04;

public class Exercise05 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		for (y = 1; y < 11; y++) {
			x=1;
			for(x = 1; x < 11; x++ ) {
				if(((4*x) + (5*y)) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
