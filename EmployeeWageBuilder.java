package com.EmployeeWage;

public class EmployeeWageBuilder {

	// Constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	// Constructor
	public EmployeeWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	// Method 1
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		numOfCompany++;
	}

	// Method 2
	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	// Method 3
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		// Variables
		int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	// Main Class
	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.addCompanyEmpWage("Amazon", 25, 4, 20);
		empWageBuilder.addCompanyEmpWage("Flipcart", 20, 2, 15);
		empWageBuilder.addCompanyEmpWage("Zomato", 15, 5, 35);
		empWageBuilder.computeEmpWage();
	}

}
