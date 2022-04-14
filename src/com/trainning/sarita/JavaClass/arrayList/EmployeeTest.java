package com.trainning.sarita.JavaClass.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1.Add Employees");
            System.out.println("2.Display All Employees");
            System.out.println("3.Search Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Update Employee");
            System.out.println("6. Sort By Employee Id");
            System.out.println("7. Sort by Employee Name");
            System.out.println("8.Exit");
            System.out.println("Enter Your choice");
            choice = sc.nextInt();
            switch(choice) {
                case 1: EmployeeOperational.addEmployee(employeeList, sc);
                    break;

                case 2: EmployeeOperational.displayEmployees(employeeList);
                    break;

                case 3: EmployeeOperational.searchEmployee(employeeList,sc);
                    break;

                case 4: EmployeeOperational.deleteEmployee(employeeList,sc);
                    break;

                case 5: EmployeeOperational.updateEmployee(employeeList,sc);
                    break;

                case 6:
                        if(employeeList.isEmpty()){
                            System.out.println("-- No employee is available--");
                        }
                            else {
                            Collections.sort(employeeList, new EmployeeIDSort());
                            System.out.println("Sorting by Employee Id is done");
                        }
                    break;

                case 7:
                    if(employeeList.isEmpty()){
                        System.out.println("-- No employee is available--");
                    }
                    else {
                        Collections.sort(employeeList, new EmployeeNameSort());
                        System.out.println("Sorting by Employee Name is done");
                    }
                    break;
                default :
                    if(choice!=8)
                        System.out.println("Invalid choice ....Try Again.");
            }
        }

        while(choice != 8);
        System.out.println("You are exited from the App ");
                    
        }
    }

