package com.EmployeeWage;

public class EmployeeWageBuilder {

	// Constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
		// Variables
		int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Employee Wage for " + company + " is : " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("Amazon", 25, 4, 20);
		computeEmpWage("Flipcart", 20, 2, 15);
		computeEmpWage("Zomato", 15, 5, 35);
	}

}