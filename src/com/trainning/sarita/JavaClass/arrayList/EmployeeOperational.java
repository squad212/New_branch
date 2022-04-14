package com.trainning.sarita.JavaClass.arrayList;


import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeOperational {


    public static void addEmployee(ArrayList<Employee> employeeList, Scanner sc) {
        System.out.println("Enter employee Id");
        int eid = sc.nextInt();

        System.out.println("Enter employee name ");
        String ename = sc.next();

        System.out.println("Enter employee department ");
        String edepartment = sc.next();

        System.out.println("Enter employee age");
        int eage = sc.nextInt();

        Employee employee = new Employee(eid, ename, edepartment, eage);
        employeeList.add(employee);
    }

    private  static void format(){

        System.out.println("Eid\tEname\tEdapartment\tEage ");
        System.out.println("=========================================== ");

    }
    public static void displayEmployees(ArrayList<Employee> employeeList) {
        if (employeeList.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            format();
            for (Employee employee : employeeList) {
                System.out.println(employee.getEid() + "\t" + employee.getEname() + "\t" +
                        employee.getEdapartment() + "\t" + employee.getEage());
            }
        }
    }

    public static void searchEmployee(ArrayList<Employee> employeeList, Scanner sc) {
        boolean status = false;
        if (employeeList.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to search");
            int Eid = sc.nextInt();
            for (Employee employee : employeeList) {
                if (employee.getEid() == Eid) {
                    status = true;
                   format();
                   System.out.println(employee.getEid() + "\t" + employee.getEname() + "\t" +
                            employee.getEdapartment() + "\t" + employee.getEage());
                    break;
                }
            }
            if (status == false) {
                System.out.println(" ....Record is not found....");
            }
        }
    }

    public static void deleteEmployee(ArrayList<Employee> employeeList, Scanner sc) {
        boolean status = false;
        if (employeeList.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to delete");
            int Eid = sc.nextInt();
            for (Employee employee : employeeList) {
                if (employee.getEid() == Eid) {
                    employeeList.remove(employee);
                    status = true;
                    System.out.println("----Record deleted---");
                    break;
                }
            }
            if (status == false) {
                System.out.println(" ....Record is not found....");

            }
        }
    }

    public static void updateEmployee(ArrayList<Employee> employeeList, Scanner sc) {
        boolean status = false;
        if (employeeList.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to update");
            int Eid = sc.nextInt();
            for (Employee employee : employeeList) {
                if (employee.getEid() == Eid) {

                    System.out.println("Enter new Employee Name");
                    String ename = sc.next();
                    employee.setEname(ename);

                    System.out.println("Enter new Employee Department");
                    String edepartment = sc.next();
                    employee.setEdapartment(edepartment);

                    System.out.println("Enter new Employee Age");
                    int eage = sc.nextInt();
                    employee.setEage(eage);

                    status = true;
                    System.out.println("----Record updated---");
                    break;
                }
            }
            if (status == false) {
                System.out.println(" ....Record is not found....");
            }

        }
    }
}