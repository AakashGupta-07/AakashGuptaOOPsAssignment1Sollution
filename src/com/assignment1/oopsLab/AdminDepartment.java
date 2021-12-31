package com.assignment1.oopsLab;

public class AdminDepartment extends SuperDepartment { // SUB CLASS OR CHILD CLASS
	void departmantName() { // 3 METHODS OF RETURN TYPE STRING - NOT ACCEPT ANY PARAMETER
		System.out.println("Welcome to AdminDepartment");
	}

	void getTodaysWork() {
		System.out.println("Complete your document submission");
	}

	void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}

}