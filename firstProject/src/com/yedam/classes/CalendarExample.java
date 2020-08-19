package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		System.out.print(cal.get(Calendar.YEAR) + "-");
//		System.out.print(cal.get(Calendar.MONTH)+1 + "-"); //월은 0부터 시작한다 => 7=8월
//		System.out.println(cal.get(Calendar.DATE));
//		
//		cal.set(2020, 2, 1);
//		System.out.print(cal.get(Calendar.YEAR) + "-");
//		System.out.print(cal.get(Calendar.MONTH)+1 + "-"); //월은 0부터 시작한다 => 7=8월
//		System.out.println(cal.get(Calendar.DATE));
		
		cal.set(2020, 7, 19);
//		System.out.println("요일은 " + cal.get(Calendar.DAY_OF_WEEK)); //1=일요일, 2=월요일 ...
		
		cal.set(2020, 7, 0);//0을 넣으면 전달의 마지막날
//		System.out.print(cal.get(Calendar.YEAR) + "-");
//		System.out.print(cal.get(Calendar.MONTH)+1 + "-"); //월은 0부터 시작한다 => 7=8월
//		System.out.println("마지막 날은 " + cal.get(Calendar.DATE));

		createCalendar(2020, 9);
	}
	
	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		System.out.println("             " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1 + "월"));
//		System.out.println("1일의 요일은 " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("일  월  화  수  목  금  토");
		
		cal.set(year, month-1, 0); //전달의 마지막 날짜의 요일만큼 공백 넣기
		int b = 0;
		for (int c = 0; c < cal.get(Calendar.DAY_OF_WEEK); c++) {
			System.out.print("      ");
		}
		int c = cal.get(Calendar.DATE);
		cal.set(year, month-1, 1); //입력 날짜로 변경
		for (int a = 0 +cal.get(Calendar.DAY_OF_WEEK); a < c +cal.get(Calendar.DAY_OF_WEEK) ; a++) {	
			b++;
			if(b < 10) {
				System.out.printf("%5d", b);
				if (a % 7 == 0) {
					System.out.println();
				}	
			} else {
				System.out.printf("%4d", b);
				if (a % 7 == 0) {
					System.out.println();
				}	
			}
		}
	}

	public static void createCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		for (int a = 1; a < 31; a++) {
			System.out.printf("%5d", a);
			if (a % 7 == 0) {
				System.out.println();
			}
		}

	}

}

