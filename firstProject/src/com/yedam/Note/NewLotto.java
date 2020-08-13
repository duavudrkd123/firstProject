package com.yedam.Note;

public class NewLotto {
	public static void main(String[] args) {
		int[] num = new int[6];
		int a=0;
		int b=0;
		int c=0;
		for(a=0; a<6; a++) {
			num[a] = (int) (Math.random() * 45) + 1;
			//System.out.println(a + "번째 num값" + num[a]);
			b=0;
			for(b=0; b<a; b++) {
				if (num[a] == num[b]) {
					a = a-1;
					c = 1;
					break;
				} 
			 }
			 if(c==1) {
				 c=0;
			 } else {
				 System.out.println(num[a]);
				 c=0;
			 }
		}
		
	}
}
