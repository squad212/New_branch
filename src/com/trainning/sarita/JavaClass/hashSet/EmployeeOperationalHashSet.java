package com.trainning.sarita.JavaClass.hashSet;


import java.util.HashSet;
import java.util.Scanner;

public class EmployeeOperationalHashSet {
    public static void addEmployee(HashSet<employee> employeeHash, Scanner sc) {
        System.out.println("Enter employee Id");
        int eid = sc.nextInt();

        System.out.println("Enter employee name ");
        String ename = sc.next();

        System.out.println("Enter employee department ");
        String edepartment = sc.next();

        System.out.println("Enter employee age");
        int eage = sc.nextInt();

        employee em = new employee(eid, ename, edepartment, eage);
        employeeHash.add(em);
    }

    public static void displayEmployees(HashSet<employee> employeeHash) {
        if (employeeHash.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Eid\tEname\tEdapartment\tEage ");
            for (employee em : employeeHash) {
                System.out.println(em.getEid() + "\t" + em.getEname() + "\t" +
                        em.getEdapartment() + "\t" + em.getEage());
            }
        }
    }

    public static void searchEmployee(HashSet<employee> employeeHash, Scanner sc) {
        boolean status = false;
        if (employeeHash.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to search");
            int Eid = sc.nextInt();
            for (employee em : employeeHash) {
                if (em.getEid() == Eid) {
                    status = true;
                    System.out.println(em.getEid() + "\t" + em.getEname() + "\t" +
                            em.getEdapartment() + "\t" + em.getEage());
                    break;
                }
            }
            if (status == false) {
                System.out.println(" ....Record is not found....");
            }
        }
    }

    public static void deleteEmployee(HashSet<employee> employeeHash, Scanner sc) {
        boolean status = false;
        if (employeeHash.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to delete");
            int Eid = sc.nextInt();
            for (employee em : employeeHash) {
                if (em.getEid() == Eid) {
                    employeeHash.remove(em);
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

    public static void updateEmployee(HashSet<employee> employeeHash, Scanner sc) {
        boolean status = false;
        if (employeeHash.isEmpty()) {
            System.out.println("--NO Employee are Available--");
        } else {
            System.out.println("Enter Employee Id to update");
            int Eid = sc.nextInt();
            for (employee em : employeeHash) {
                if (em.getEid() == Eid) {

                    System.out.println("Enter new Employee Name");
                    String ename = sc.next();
                    em.setEname(ename);

                    System.out.println("Enter new Employee Department");
                    String edepartment = sc.next();
                    em.setEdapartment(edepartment);

                    System.out.println("Enter new Employee Age");
                    int eage = sc.nextInt();
                    em.setEage(eage);

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
