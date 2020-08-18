package com.yedam.classes.exam;

public class MemberService {
	
	public boolean login(String id, String password, Member[] members) {
		boolean result = false;
		for(int i = 0 ; i <members.length; i ++) {
			if (id.equals(members[i].getId()) && password.equals(members[i].getPassword())) {//String은 equals다!!!!
				result =true;
				break;//항상 체크 잘 할 것 
			}
			else 
				result = false;	
		}
		return result;
	}
	
	public void logout() {
		System.out.println("로그아웃되었습니다.");
	}
}

