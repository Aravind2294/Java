package com.webtask;

public class EmployeeDetails {

	public void empId() {
		System.out.println("809829");
	}

	public void empName() {
		System.out.println("Aravind");
	}

	public void empDob() {
		System.out.println("22/03/2021");
	}

	public void empPhone() {
		System.out.println("xxxxxx33");
	}

	public void empEmail() {
		System.out.println("@outlook.com");
	}

	public void empAddress() {
		System.out.println("Chennai");
	}
	
	public static void main(String[] args) {
		EmployeeDetails E = new EmployeeDetails();
		E.empId();
		E.empName();
		E.empDob();
		E.empPhone();
		E.empEmail();
		E.empAddress();
	}

}
