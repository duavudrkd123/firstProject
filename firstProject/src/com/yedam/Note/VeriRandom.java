package com.yedam.Note;

public class VeriRandom {
	public static void main(String[] args) {
	
	int I=0, A =0, A0=0, A1=0, A2=0, A3=0, A4=0;
	while (I <1000) {
		A = (int) (Math.random()*5); //0<=A<5 범위
		switch (A)  {
		case 0:
			A0++;
			break;
		case 1:
			A1++;
			break;
		case 2:
			A2++;
			break;
		case 3:
			A3++;
			break;
		default:
			A4++;
			break;
		}
		I++;
	}
	System.out.print("A0:" + A0 + ", " + "A1:" + A1 + ", " + "A2:" + A2 + ", " + "A3:" + A3 + ", " + "A4:" + A4);
	}
}
