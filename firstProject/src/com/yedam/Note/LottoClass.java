package com.yedam.Note;

public class LottoClass {
	int[] num = null;
	int rep = 0;

	public int[] Creat() {
		num = new int[6];
		int c = 0;
		for (int a = 0; a < 6; a++) {
			num[a] = (int) (Math.random() * 45) + 1;
			for (int b = 0; b < a; b++) { // 중복 판독기
				if(num[a] == num[b]) {
					c=1; 
					break;
				}
			}
			if (c == 1) {
				a--;
				c = 0;
			} else {
				System.out.printf("%3d", num[a]);
			}
		}
		return num;
	}

	public void vriRep() {
		for (int a = 0; a < num.length; a++) {
			for (int b = 0; b < a; b++)
				if (num[a] == num[b]) {
					rep++;
				}
		}
		System.out.println("중복 횟수는 " + rep + "회입니다.");
	}
}
