package com.employeewage;

import java.util.Random;

public class EmployeeWage {
    Random random = new Random();
    private final int hourWage = 20;
    private final int fullDay = 8;
    private final int partTime = 4;
    private final int month = 20;
    private int totalWage = 0;
    private int totalHours = 0;
    private int day;

    public int getHourWage() {
        return hourWage;
    }

    public int getFullDay() {
        return fullDay;
    }

    public int getPartTime() {
        return partTime;
    }

    public int getMonth() {
        return month;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public void setEmployeeType() {
        int wageType = random.nextInt(2);
        switch (wageType) {
            case 1:
                this.setDay(this.getFullDay());
                System.out.println("The employee is full day employee");
                break;
            default:
                this.setDay(this.getPartTime());
                System.out.println("The employee is part time employee");
        }

    }

    public void computeEmployeeWages() {
        for(int i=1; i<=month; i++) {
            int attendance = random.nextInt(2);
            if(this.totalHours > 100) {
                break;
            }
            if(attendance>0) {
                System.out.println("Day " + i + " Employee is Present");
                totalWage = totalWage + day*hourWage;
                totalHours+=day;
            }
            else {
                System.out.println("Day " + i + " Employee is Absent");
            }
        }
        System.out.println("The total wage employee earned in this month is " + totalWage);
        System.out.println("The total working hours of employee is " + totalHours);
    }

}
