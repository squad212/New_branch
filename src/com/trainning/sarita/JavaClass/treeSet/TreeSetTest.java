package com.trainning.sarita.JavaClass.treeSet;



import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<employee> ts = new TreeSet<>();
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
                    TreeSetOperational.addEmployee(ts, sc);
                    break;

                case 2:
                   TreeSetOperational.displayEmployees(ts);
                    break;

                case 3:
                    TreeSetOperational.searchEmployee(ts, sc);
                    break;

                case 4:
                    TreeSetOperational.deleteEmployee(ts, sc);
                    break;

                case 5:
                    TreeSetOperational.updateEmployee(ts, sc);
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






