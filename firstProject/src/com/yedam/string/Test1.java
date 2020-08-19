package com.yedam.string;

import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
			System.out.println("입력: ");
			int readByteNo=(System.in.read(bytes)-2);//엔터값만큼 빼주는거 잊지말자!
			String str = new String(bytes, 0, readByteNo-2);
			char sex = 0;
			System.out.println(readByteNo);
			if(readByteNo == 14) {
				 sex = str.charAt(7);	
			} else {
				 sex = str.charAt(6);
			}
			switch (sex) {
				case '1':
				case '3':
					System.out.println("남자입니다.");
					break;
				case '2':
				case '4':
					System.out.println("여자입니다.");
					break;
			}
	}
}
