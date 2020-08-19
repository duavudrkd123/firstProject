package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
//		String str = "Hello";
//		try {
//			System.out.println(str.toString()); //예외가 발생할 구문	
//		} catch(NullPointerException e) { //괄호 안에 발생할 예외 입력
//			System.out.println("Null 값을 참조하고 있습니다.");
//		} catch(Exception e1) {//Exception은 모든 예외를 포함한다
//			System.out.println("알 수 없는 예외가 발생했습니다.");
//		}
//		
//		
//		int[] intAry = new int[5];
//		for(int i=0; i<=5; i++) {
//			try {
//				System.out.println("i의 값: " + intAry[i]);	
//			} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("배열의 범위를 초과했습니다.");
//				System.out.println("배열의 범위를 늘리십시오.");
//			} catch (Exception e1) {
//				System.out.println("알 수 없는 예외가 발생했습니다.");
//			}
//		}
		
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>");
		try {
			int menu = scn.nextInt();	
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력하라고!");
		}catch (Exception e1) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}
		System.out.println("정상 종료.");
	}
}
