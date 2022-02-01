package com.trainning.sarita.basicproject.serializationJavaClass;

import java.io.Serializable;

public class Employee implements Serializable{
    private int employeeId;
    private String employeeName;
    private String department;
    private int age;

    //Adding constructor


    public Employee(int employeeId, String employeeName, String department, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.age = age;
    }

    //Generate Setter and Getter
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
