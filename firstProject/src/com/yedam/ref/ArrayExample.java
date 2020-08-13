package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
//		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
//		score2 = 50;
//		int sum = score1 +score2+score3+score4;
//		
//		int[] intAry = {10,20,30,40};
//		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
////		System.out.println(intAry.length);
//		sum = 0;
//		for(int i = 0; i <intAry.length; i++) {
////			System.out.println(intAry[i]);
//			sum = sum + intAry[i];
////			System.out.println("지금 섬값: " + sum);
//		}
//		intAry[1] = 50;
////		System.out.println("intAry의 값은 " + intAry[1]);
////		System.out.println("sum = " + sum);
//		int i = 0;
//		while(i<=3) {
//			if (i <3) {
////				System.out.print("배열" + i + "의 값은 " + intAry[i] + ", ");	
//				i++;
//			} else {
////				System.out.print("배열" + i + "의 값은 " + intAry[i]);
//				i++;
//			}
//		}
//		String[] sAry = {"hello", "world", "nice", "good"};
//		for (int ii =0; ii<sAry.length; ii++) {
////			System.out.println(sAry[ii]);
//		}
		
		int[] scoreAry = new int[5]; //5개 짜리 인트형 배열을 선언하겠다
		for (int i = 0; i <scoreAry.length; i++) {
			System.out.println("int: " + scoreAry[i]);
		}
		double[] scoreAry2 = new double[5]; //5개 짜리 인트형 배열을 선언하겠다
		for (int i = 0; i <scoreAry2.length; i++) {
			System.out.println("double: " + scoreAry2[i]);
		}
		String[] scoreAry3 = new String[5]; //5개 짜리 인트형 배열을 선언하겠다
		scoreAry3[0] = "one";
		scoreAry3[1] = "two";
		scoreAry3[2] = "three";
		for (int i = 0; i <scoreAry3.length; i++) {
			System.out.println("String: " + scoreAry3[i]);
		}
		int[] mathAry;
		mathAry=new int[] {1,2,3,4};
		for(int i=0; i<4; i++) {
			System.out.print(mathAry[i] + ", ");
		}
			
	}
}
