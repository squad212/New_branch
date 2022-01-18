package com.trainning.sarita.Basicproject.Inheritance;

import javax.swing.*;
import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String employerName;
    private char employeeGrade;
    private BigDecimal salary;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerNme() {
        return employerName;
    }

    public void setEmployerNme(String employerNme) {
        this.employerName = employerNme;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public String toString() {
        return super.toString()+"#" +title + " # " + employerName + " # " + employeeGrade ;
    }
}
