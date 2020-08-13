package com.yedam.Note;
	import java.lang.reflect.Array;
	import java.util.Arrays;
	import java.util.Scanner;

public class descJY {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("숫자 3개 입력 하시오");
	      int x = scanner.nextInt();
	      int y = scanner.nextInt();
	      int z = scanner.nextInt();
	      
	      int [] arr;
	      int temp = 0;
	      int temp1 = 0;
	      arr = new int[]{x,y,z};
	      int i=0;
	      Arrays.sort(arr); //오름차순
	      int j = 0;
	      
	      System.out.println("결과: ");
	      
	      for( i =0;i<3;i++) {
	         System.out.println(arr[i]);
	      }
	      System.out.println(arr[arr.length-1]);

	 }
}
