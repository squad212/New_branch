package com.trainning.sarita.JavaClass.arrayList;

import java.util.Comparator;

public class EmployeeNameSort implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEname().compareTo(e2.getEname());// ascending order
        //return e2.getEname().compareTo(e1.getEname());// decending order

    }
}
