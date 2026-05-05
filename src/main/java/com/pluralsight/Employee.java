package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeID, startTime;
    private String name, department;
    private double payRate, hoursWorked;



    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getRegularHours() {
        return Math.min(hoursWorked, 40.0);
    }
    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40.0, 0.0);
    }
    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
    public void punchIn(int time){
        this.startTime = time;
    }
    public void punchIn () {
        LocalTime now = LocalTime.now();
        now.getHour();
        now.getMinute();
        double formatTime = now.getHour() + now.getMinute();
    }
    public void punchOut(int time) {
        this.hoursWorked += time - startTime;

    }
    public void punchOut () {
        LocalTime now = LocalTime.now();
        now.getHour();
        now.getMinute();
        double formatTime = now.getHour() + now.getMinute();

    }
    public void punchTimeCard(int time) {
        if(this.startTime != 25) {
            this.startTime = -1;
        }else {
            this.hoursWorked += time - startTime;
            this.startTime = -1;
        }
    }
}



