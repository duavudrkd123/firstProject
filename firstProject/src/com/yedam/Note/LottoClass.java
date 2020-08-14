package com.yedam.Note;

public class LottoClass {
	public void Creat() {
		int[] num = new int[6]; int c=0;
		for(int a=0; a<6; a++) {
			num[a] = (int) (Math.random() * 45) + 1;
			for(int b=0; b<a; b++) { //중복 판독기
				c = (num[a] == num[b])? 1 : 0 ;}
			 if(c==1) {a=a-1;  c=0;	 } else {
				 System.out.printf("%5d",num[a]);}}
	}
}
