package com.yedam.rotto;

public class aa {
	public static void main(String[] args) {
		for (int a = 0; a < 7; a += 1) { 												
			int m4 = (int) (Math.random() * 46) + 1; 							
				if (a < 6) { 	
					System.out.println(m4); 									
				} else {																			
					System.out.println("보너스 번호: " + m4); 
			} 																		
		} 								
	}
}
