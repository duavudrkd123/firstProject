package com.yedam.Note;

public class TodayLunch {
	public static void main(String[] args) {
		String[] menuArray = new String[] {"치킨", "피자", "족발", "한식"};
		int i;
		//System.out.println(menuArray.length);
		i = (int) (Math.random()*menuArray.length) ;
		//System.out.println("i는 " + i);
		System.out.println(menuArray[i]);
	}
}
