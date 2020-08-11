package com.yedam.oper;

public class IncreaseOperatorExample {
	public static void main(String[] args) {
		boolean run = false;
		int var1 = 0;
		var1++; // var1 = var1 + 1;
		for(int i=0; i <3; i++) {
			run = !run;
			if(run) {							
				var1++;
				System.out.println("i값 : " + i + ", " + "var값 : " + var1 + ", " + "run값 : " + run);
			} 
			else
				{System.out.println("i값 : " + i + ", " + "var값 : " + var1 + ", " + "run값 : " + run);
				}
		}
		System.out.println("결과값 : " + var1);
	}

}
