package com.gl.superdepartment;

import com.gl.admindepartment.AdminDepartment;
import com.gl.hrdepartment.HrDepartment;
import com.gl.techdepartment.TechDepartment;

public class SuperDepartment {
	
	public static String departmentName() {
		return "Super Department";
	}
	
	public static String getTodaysWork() {
		return "No Work as of now";
	}
	
	public static String getWorkDeadline() {
		return "Nil";
	}
	
	public static String isTodayAHoliday() {
		return "Today is not a holiday";
	}
		
	public static void main(String [] args)
	{
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		String holiday = isTodayAHoliday();
		System.out.println(" Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(holiday);
		System.out.println();
		System.out.println(" Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(holiday);
		System.out.println();
		System.out.println(" Welcome to "+ tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(holiday);
		
	}
}
