package com.EmployeeWage;

public class EmployeeWageBuilder {

	// Constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHourPerMonth;
	private int totalEmpWage;

	public EmployeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHourPerMonth = maxHourPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
	}

	public void computeEmpWage() {
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	public String toString() {
		return "Total Employee Wage for Company: " + company + " is : " + totalEmpWage;
	}

	public static void main(String[] args) {
		EmployeeWageBuilder amazon = new EmployeeWageBuilder("Amazon", 25, 4, 20);
		EmployeeWageBuilder flipcart = new EmployeeWageBuilder("Flipcart", 20, 2, 15);
		EmployeeWageBuilder zomato = new EmployeeWageBuilder("Zomato", 15, 5, 35);
		amazon.computeEmpWage();
		System.out.println(amazon);
		flipcart.computeEmpWage();
		System.out.println(flipcart);
		zomato.computeEmpWage();
		System.out.println(zomato);
	}
}
