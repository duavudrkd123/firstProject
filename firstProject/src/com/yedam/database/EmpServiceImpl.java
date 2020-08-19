package com.yedam.database;

public class EmpServiceImpl implements EmpService { //version 1

	EmpDAO dao = new EmpDAO();
	
	@Override
	public Employee[] showList() {
		return dao.getEmpList();
	}

	@Override
	public void addEmp(Employee emp) {
		dao.addEmployee(emp);
	}

	@Override
	public void modEmp(Employee emp) {
		dao.UpEmp(emp);
	}

	@Override
	public void delEmp(int empId) {
		dao.removeEmp(empId);
	}

}
