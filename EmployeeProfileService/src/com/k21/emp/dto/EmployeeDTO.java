package com.k21.emp.dto;

public class EmployeeDTO {
    
    private String employeeId;
    private String name;
    private String designation;
    private String department;
    private int salary;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public EmployeeDTO() {
        super();
    }
    
    public String toString() {
        return employeeId + " " + name + " " + designation + " " + department;
    }
}
