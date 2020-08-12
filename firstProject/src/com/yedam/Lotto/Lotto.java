package com.yedam.Lotto;

public class Lotto {
	public static void main(String[] args) {
		int num1 =0, num2 = 0, num3 =0, num4 =0, num5 =0, num6 =0, num7 =0; //뽑힌 숫자
		num1 = (int) (Math.random() * 45) + 1;
				System.out.println(num1);
		boolean AA = true;
		while (AA) {
		num2 = (int) (Math.random() * 45) + 1;
			if (num2 != num1) {
				System.out.println(num2);
				AA = false;
			}
		}//end of while
		AA = true;
		while (AA) {
		num3 = (int) (Math.random() * 45) + 1;
			if ((num3 != num1) && (num3 != num2)) {
				System.out.println(num3);
				AA = false;
			} 
		}//end of while
		AA = true;
		while (AA) {
		num4 = (int) (Math.random() * 45) + 1;
			if ((num4 != num1) && (num4 != num2) && (num4 != num3)) {
				System.out.println(num4);
				AA = false;
			} 
		}//end of while
		AA = true;
		while (AA) {
		num5 = (int) (Math.random() * 45) + 1;
			if ((num5 != num1) && (num5 != num2) && (num5 != num3) && (num5 != num4)) {
				System.out.println(num5);
				AA = false;
			} 
		}//end of while
		AA = true;
		while (AA) {
		num6 = (int) (Math.random() * 45) + 1;
			if ((num6 != num1) && (num6 != num2) && (num6 != num3) && (num6 != num4) && (num6 != num5)) {
				System.out.println(num6);
				AA = false;
			} 
		}//end of while
	}
}
