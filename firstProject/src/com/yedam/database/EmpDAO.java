package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	//수정
	public void UpEmp(Employee emp, int a) {
		Connection conn = DBConnection.getConnection();
		String sql = "UPDATE EMP_TEMP SET  salary = " + a + " WHERE EMPLOYEE_ID = " + emp.getEmployeeId();
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//삭제
	public void removeEmp(int eId) {
		Connection conn = DBConnection.getConnection(); 
		String sql = "DELETE FROM EMP_TEMP WHERE EMPLOYEE_ID = " + eId;
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//입력
	public void addEmployee(Employee emp) { //Employee class를 매개값으로 던지자!
		Connection conn = DBConnection.getConnection(); //데이터 베이스에 연결
		
//  	오라클 develper 구문(참고해서 만들자)		
//		insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
//		value (301, 'test', test', '2020-05-05', 'IT_PROG')
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)"
				+ " values("+emp.getEmployeeId()
								   +",\'"+emp.getLastName() //DB는 문자 앞뒤에 콤마 해줘야함!
								   +"\',\'"+emp.getEmail()
								   +"\',\'"+emp.getHireDate()
								   +"\',\'"+emp.getJobId()
				+"\')";
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//조회
	public Employee[] getEmpList() { //Employee클래스에 getEmpls
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt =  conn.prepareStatement(sql); //conn에 쿼리를 담는다 => pstmt에 입력
			ResultSet rs = pstmt.executeQuery();//쿼리를 실행해서 rs에 담는다
			int idx = 0;
			while(rs.next()) { //변수.next() => 변수에 담긴 인수들을 하나씩 반환, 다 꺼내면 false를 반환
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				String firstName = rs.getString("first_name"); //두줄로 입력
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name")); //이렇게 써도 같다
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				
				employees[idx++] = emp;		
			}
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
	
//	public static void main(String[] args) {
//		DBConnection dbCon = new DBConnection();
//		dbCon.getConnection();
////		DBConnection.getConnection(); //->이렇게 해도 됨(DBConnection이 static 타입이어서)
//		
//		
//		
//		
//		System.out.println("프로그램 종료");
//}//end of main()
}//end of class
