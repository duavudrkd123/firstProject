package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		DataAccessObject dao = new OarcleDb();
//		DataAccessObject dao = new MySqlDb(); //인터페이스를 기반으로 객체만 바꿔준다
		
		dao.select();
		dao.insert();
		dao.update();
	}
}
