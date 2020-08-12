package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum +1;
		sum += 1;
		sum ++; //다 같은 말임
		System.out.println("결과는" + sum);
		
		sum = 0;
		for (int a =0; a<5; a++) {
			sum++;
		}
		System.out.println("증가반복 최종 결과는" + sum);
		
		sum = 0;
		for(int a =3; a>0; a--) {
			sum++;
		}
		System.out.println("감소반복 최종 결과는" + sum);
		
		//1~10 범위의 수 합계.
		sum = 0;
		for(int i=1; i <=9; ) {
			i++;		//for구문 변형
			sum = sum + i;
		}
		System.out.println("`1~10 합: " + sum);
		for(int a=2; a<=9; a+=1 ) {
		int num = a;
		for(int i=2; i<=9; i+=1) {
		System.out.println(num + "*" + i + " =" + (num * i));
		}
		}
}
}