package com.yedam.text05;

public class Q8 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93 ,87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int AA = 0;
	
		for(int a =0; a < array.length; a++ ){
			for(int x = 0; x < array[a].length ; x++) {
				sum = sum + array[a][x];
				AA++;
				//System.out.println(array[a][x]);	
			}
		}
		avg = (double)sum/AA;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
