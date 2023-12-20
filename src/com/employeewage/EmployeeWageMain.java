package com.employeewage;

import java.util.Random;

public class EmployeeWageMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage e1 = new EmployeeWage();
        e1.setEmployeeType();
        e1.computeEmployeeWages();
        EmployeeWage e2 = new EmployeeWage();
        e2.setEmployeeType();
        e2.computeEmployeeWages();
    }
}
