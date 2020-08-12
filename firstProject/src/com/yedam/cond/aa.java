package com.yedam.cond;

public class aa {
	public static void main(String[] args) {
		int [] arr = new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=0;
		}
		
		
		for (int a = 0; a < 7; a += 1) { 												
			int m4 = (int) (Math.random() * 46) + 1; 							
				if (a < 6) { 	
					System.out.println(m4); 									
				} else {																			
					System.out.println("보너스 번호: " + m4); 
			} 		
			arr[a]=m4;																				
		} 								
	}// 반복문 끝
}
