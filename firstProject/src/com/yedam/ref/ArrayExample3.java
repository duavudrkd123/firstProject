package com.yedam.ref;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] iAry = { { 10, 20 }, // iAry[0]
				{ 30, 40, 50 }, // iAry[1]
				{ 60, 30 }, // iAry[2]
				{ 40 } // iAry[4]
		};
		for (int j=0; j<iAry.length; j++) {
			for (int i = 0; i < iAry[j].length; i++) { //iAry[j].length는 j번째덩어리의 길이를 나타낸다
				System.out.print(iAry[j][i]);	
			}
			System.out.println();
		}
	}
}