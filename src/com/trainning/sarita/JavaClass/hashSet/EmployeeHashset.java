package com.trainning.sarita.JavaClass.hashSet;



import com.trainning.sarita.JavaClass.arrayList.Employee;
import com.trainning.sarita.JavaClass.arrayList.EmployeeOperational;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeHashset {
    public static void main(String[] args) {

        HashSet<employee> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1.Add Employees");
            System.out.println("2.Display All Employees");
            System.out.println("3.Search Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Update Employee");
            System.out.println("6.Exit");
            System.out.println("Enter Your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    EmployeeOperationalHashSet.addEmployee(hs, sc);
                    break;

                case 2:
                    EmployeeOperationalHashSet.displayEmployees(hs);
                    break;

                case 3:
                    EmployeeOperationalHashSet.searchEmployee(hs, sc);
                    break;

                case 4:
                    EmployeeOperationalHashSet.deleteEmployee(hs, sc);
                    break;

                case 5:
                    EmployeeOperationalHashSet.updateEmployee(hs, sc);
                    break;

                default:
                    if (choice != 6)
                        System.out.println("Invalid choice ....Try Again.");
            }
        }
        while (choice != 6);
        System.out.println("You are exited from the App ");
    }
}




