package com.trainning.sarita.JavaClass.arrayList;

import java.util.Comparator;

public class EmployeeIDSort implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        //return e1.getEid()- e2.getEid();// ascending order
       return e2.getEid() - e1.getEid();// decending order
    }
}
