package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] {3, 6, 9, 2, 4};
		int[] cpyAry = new int[5];
		for(int i = 0; i < origAry.length; i++) { //배열 값을 다른 배열에 옮겨넣기
			cpyAry[i] = origAry[i]; //cpyAry배열에 origAry배열을 넣는다
		//	System.out.println(cpyAry[i]);
		}
		//배열 자릿수가 부족하면 에러난다!
//		int[] origAry;
//		origAry = new int[] {3, 6, 9, 2, 4};
//		int[] cpyAry = new int[4]; // 5자리 필요한데 4자리 밖에 없음 => 에러!
//		for(int i = 0; i < origAry.length; i++) { 
//			cpyAry[i] = origAry[i]; 
//			System.out.println(cpyAry[i]);
//		}
		
		//System.arraycopy(origAry, 0, cpyAry, 1, 4); //원본을 복사본에 카피하는 메소드 
	
	//확장 for()
		for(int num : cpyAry) {
			System.out.println(num);
		}
}
	
}
