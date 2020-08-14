package com.yedam.ref;

public class Arrayyyy {
	public static void main(String[] args) {
	int Aray[][]=new int[5][5];
		for(int a = 0; a <5; a++) {
			for(int b = 0; b<5; b++  ) {
				 Aray[a][b] = ((b*5)+1+a);
			System.out.printf("%5d", Aray[a][b]);
			}
			System.out.println();
		}
		System.out.println("-----------------Aray2-----------------");
		int num = 0;
		int Aray2[][]=new int[5][5];
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				Aray2[a][b] = num++;
			System.out.printf("%5d",num);
			}
			System.out.println();
		}
		System.out.println("-----------------Aray3-----------------");
		num = 1;
		int Aray3[][]=new int[5][5];
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				Aray3[a][b] = num++;
			}
		}
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				System.out.printf("%5d",Aray3[b][a]);
			}	
			System.out.println();
		}
	}
}