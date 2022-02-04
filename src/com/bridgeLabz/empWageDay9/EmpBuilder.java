package com.bridgeLabz.empWageDay9;

public class EmpBuilder {
	public static void main(String[] args) {
		EmpWage company1 = new EmpWage("Dmart",10,20,100);
		company1.calculation();
		EmpWage company2 = new EmpWage("Vijay",11,20,100);
		company2.calculation();
		EmpWage company3 = new EmpWage("BigBasket",12,20,100);
		company3.calculation();
	}
}
