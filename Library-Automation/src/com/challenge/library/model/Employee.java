package com.challenge.library.model;

// Employee class
public class Employee {
    // Attributes
    private String nameSurname; // employee's name and surname
    private String idNo; // employee's id number
    private String duty; // employee's duty
    private double salary; // employee's salary

    // Constructor with parameters
    public Employee(String nameSurname, String idNo, String duty, double salary) {
        this.nameSurname = nameSurname;
        this.idNo = idNo;
        this.duty = duty;
        this.salary = salary;
    }

    // Get and set methods for accessing the attributes
    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method that prints the employee information to the screen
    public void employeeInfo() {
        System.out.println("Employee Name Surname: " + nameSurname);
        System.out.println("Employee ID No: " + idNo);
        System.out.println("Employee Duty: " + duty);
        System.out.println("Employee Salary: " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameSurname='" + nameSurname + '\'' +
                ", idNo='" + idNo + '\'' +
                ", duty='" + duty + '\'' +
                ", salary=" + salary +
                '}';
    }
}
