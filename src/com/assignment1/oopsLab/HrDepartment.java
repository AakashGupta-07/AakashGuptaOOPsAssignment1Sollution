package com.assignment1.oopsLab;

public class HrDepartment extends SuperDepartment { // SUB CLASS OR CHILD CLASS
	void departmantName() { // 4 METHODS OF RETURN TYPE STRING - NOT ACCEPT ANY PARAMETER
		System.out.println("Welcome to HRDepartment");
	}

	void getTodaysWork() {
		System.out.println("Fill today's timesheet and mark your attendance");
	}

	void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}

	void doActivity() {
		System.out.println("team Lunch");

	}

}