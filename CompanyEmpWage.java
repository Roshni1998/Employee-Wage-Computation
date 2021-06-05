package com.EmployeeWage;

public class CompanyEmpWage {

	protected final String company;
	protected final int empRatePerHour;
	protected final int numOfWorkingDays;
	protected final int maxHoursPerMonth;
	protected int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total Employee Wage for Company: " + company + " is : " + totalEmpWage;
	}
}
