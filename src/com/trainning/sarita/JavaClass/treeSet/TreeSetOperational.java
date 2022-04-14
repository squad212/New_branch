package com.trainning.sarita.JavaClass.treeSet;


import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperational {
    public static void addEmployee(TreeSet<employee> employeeTree, Scanner sc) {
        System.out.println("Enter employee Id");
        int eid = sc.nextInt();

        System.out.println("Enter employee name ");
        String ename = sc.next();

        System.out.println("Enter employee department ");
        String edepartment = sc.next();

        System.out.println("Enter employee age");
        int eage = sc.nextInt();

      employee employeetree = new employee(eid, ename, edepartment, eage);
        employeeTree.add(employeetree);
    }

    public static void displayEmployees(TreeSet<employee> employeeTree) {
        if (employeeTree.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Eid\tEname\tEdapartment\tEage ");
            for (employee employeetree : employeeTree) {
                System.out.println(employeetree.getEid() + "\t" + employeetree.getEname() + "\t" +
                        employeetree.getEdapartment() + "\t" + employeetree.getEage());
            }
        }
    }

    public static void searchEmployee(TreeSet<employee> employeeTree, Scanner sc) {
        boolean status = false;
        if (employeeTree.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to search");
            int Eid = sc.nextInt();
            for (employee employeetree : employeeTree) {
                if (employeetree.getEid() == Eid) {
                    status = true;
                    System.out.println(employeetree.getEid() + "\t" + employeetree.getEname() + "\t" +
                            employeetree.getEdapartment() + "\t" + employeetree.getEage());
                    break;
                }
            }
            if (status == false) {
                System.out.println(" ....Record is not found....");
            }
        }
    }

    public static void deleteEmployee(TreeSet<employee> employeeTree, Scanner sc) {
        boolean status = false;
        if (employeeTree.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to delete");
            int Eid = sc.nextInt();
            for (employee employeetree : employeeTree) {
                if (employeetree.getEid() == Eid) {
                    employeeTree.remove(employeetree);
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

    public static void updateEmployee(TreeSet<employee> employeeTree, Scanner sc) {
        boolean status = false;
        if (employeeTree.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to update");
            int Eid = sc.nextInt();
            for (employee employeetree : employeeTree) {
                if (employeetree.getEid() == Eid) {

                    System.out.println("Enter new Employee Name");
                    String ename = sc.next();
                    employeetree.setEname(ename);

                    System.out.println("Enter new Employee Department");
                    String edepartment = sc.next();
                    employeetree.setEdapartment(edepartment);

                    System.out.println("Enter new Employee Age");
                    int eage = sc.nextInt();
                    employeetree.setEage(eage);

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

