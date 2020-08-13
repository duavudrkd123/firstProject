package com.yedam.Note;

public class topJY {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10 - i - 1; j++) {
            System.out.print(" ");
         }
         for (int k = 0; k < (i * 2 + 1); k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

}
