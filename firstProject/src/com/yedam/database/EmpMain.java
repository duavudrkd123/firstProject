package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		int selectNo = 0;
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			try {	
				selectNo = scn.nextInt();
			} catch(InputMismatchException e) {
				scn.nextLine();
				System.out.println("숫자를 입력하라고..");
				continue;
			}
			
			if(selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = service.showList();
				for (Employee emp : emps) {
					if(emp != null)
						System.out.println(emp.toString());
				}
			} else if (selectNo == 2) {
//				EmspDAO dao = new EmpDAO();
				System.out.println("사원번호를 입력하세요.");
				int employee_id = scan.nextInt();
				System.out.println("이름을 입력하세요.");
				String last_name = scan.next();
				System.out.println("이메일을 입력하세요.");
				String email = scan.next();
				System.out.println("입사일을 입력하세요. (yyyy-mm-dd)");
				String hire_date = scan.next();
				String job_id = "IT_PROG";
				Employee emp = new Employee (employee_id,last_name,email,hire_date,"IT_PROG");
				service.addEmp(emp);
			} else if (selectNo == 3) {
//				EmpDAO dao = new EmpDAO();
				System.out.println("누구의 연봉을 바꾸시겠습니까?");
				int eId = scan.nextInt();
				System.out.println("얼마로 바꾸시겠습니까?");
				 int salary = scan.nextInt();
				Employee emp = new Employee ();
				emp.setSalary(salary);
				emp.setEmployeeId(eId);
				service.modEmp(emp);
			} else if (selectNo == 4) {
//				EmpDAO dao = new EmpDAO();
				System.out.println("사원번호를 입력하세요.");
				int empId = scan.nextInt();
				service.delEmp(empId);
			} else if (selectNo == 9) {
				 run = false;
			} 
			else {
				System.out.println("해당 번호는 없습니다. 다시 선택하세요.");
			}	
		} 
		
		System.out.println("프로그램 종료.");
		
	}//end of main
}
