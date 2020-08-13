package com.yedam.ref;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] numAry = {2, 4, 5, 3, 5};
		int result = addAry(new int[] {2, 3, 4}); //배열에 바로 값 넣기
//		int result = addAry(numAry);s 
		System.out.println("배열의 합은 " + result);
	}
	
	public static int addAry(int[] ary) { //addAry메소드 값을 int형식으로 출력하겠다
		int sum = 0;
		for(int i=0; i<ary.length; i++) { //배열의 값들을 합해서 sum에 넣겠다
			sum += ary[i];
		}
		return sum; //sum의 값을 메소드의 값으로 반환한다
	}
}
