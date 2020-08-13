package com.yedam.text05;

public class Q7 {
	public static void main(String[] args) {
	int max = 0;
	int[] array = {1, 5, 3, 8, 2};
	for(int a = 0; a < 5; a++) {
		if(array[a]>max) {
			max = array[a];
		}
	}
	System.out.println("max: " + max);
	}
}
