package com.EmployeeWage;

public class EmployeeWageBuilder {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

	public static int computeEmpWage() {
		// Variables
		int EmpHrs, TotalEmpHrs = 0, TotalWorkingDays = 0;
		// Computation
		while (TotalEmpHrs <= MAX_HRS_IN_MONTH && TotalWorkingDays < NUM_OF_WORKING_DAYS) {
			TotalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_FULL_TIME:
				EmpHrs = 8;
				break;
			case IS_PART_TIME:
				EmpHrs = 4;
				break;
			default:
				EmpHrs = 0;
			}
			TotalEmpHrs += EmpHrs;
			System.out.println("Day#: " + TotalWorkingDays + "Emp Hr: " + EmpHrs);
		}
		int TotalEmpWage = TotalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage: " + TotalEmpWage);
		return TotalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage();
	}
}