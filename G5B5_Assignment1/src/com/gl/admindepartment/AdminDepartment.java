package com.gl.admindepartment;

import com.gl.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public static String departmentName() {
		return "Admin Department";
	}
	
	public static String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}

}
