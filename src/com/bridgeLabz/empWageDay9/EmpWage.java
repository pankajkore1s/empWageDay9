package com.bridgeLabz.empWageDay9;

public class EmpWage {
	public static final int ISPARTTIME = 1;
	public static final int ISFULLTIME = 2;
	private final String companyName;
	private final int wagesPerHours;
	private final int numOfWorkingdays;
	private final int maxHoursInMonth;
	
	public EmpWage(String companyName,int wagesPerHours,int numOfWorkingday,int maxHoursInMonth) {
		this.companyName = companyName;
		this.wagesPerHours = wagesPerHours;
		this.numOfWorkingdays =numOfWorkingday;
		this.maxHoursInMonth = maxHoursInMonth;
		
	}
	public void calculation() {
		int totalEmpWages = 0, totalWorkingDays = 0, totalEmpHours =0;

		while (totalEmpHours <= maxHoursInMonth && totalWorkingDays < numOfWorkingdays)
		{
			int empHours = 0;
			totalWorkingDays++;
			int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (employeecheck)
			{
			case ISPARTTIME:
				empHours = 8;
				break;
			case ISFULLTIME:
				empHours = 8;
				break;
			default:
				empHours = 0;
				break;
			}
			totalEmpHours += empHours;
			int empWage =empHours * wagesPerHours;
			totalEmpWages += empWage;
		}
		System.out.println("Total Employee Wage of "+companyName+" is :"+ totalEmpWages);
	}
}


