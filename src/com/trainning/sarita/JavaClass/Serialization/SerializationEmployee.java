package com.trainning.sarita.JavaClass.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationEmployee {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("D:/note/serialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            System.out.println("size for Employee objects");
            int size = sc.nextInt();
            for (int i =0;i < size;i++) {
                System.out.println("Enter employee Id");
                int eid = sc.nextInt();
                System.out.println("Enter employee name ");
                String ename = sc.next();
                System.out.println("Enter employee department ");
                String edepartment = sc.next();
                System.out.println("Enter employee age");
                int eage = sc.nextInt();

                Employee even = new Employee(eid, ename, edepartment, eage);
                oos.writeObject(even);




            /*Employee e1 = new Employee(101,"Sarita","Accounting",26);
            Employee e2 = new Employee(102,"Brutin","Info tech",25);
            Employee e3 = new Employee(103,"Momo","Security",36);
            Employee e4 = new Employee(104,"Durga","Finance",46);

            // writing in the file using outputstream
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);
            oos.writeObject(e4);*/
            }



            System.out.println("Object data written Successfully");
            oos.close();

                /*System.out.println("Enter Employee id: ");
                int eid = sc.nextInt();
                e1.setEmployeeId(eid);

                System.out.println("Enter Employee Name: ");
                String ename = sc.next();
                e1.setEmployeeName(ename);

                System.out.println("Enter Employee Department: ");
                String edepartment = sc.next();
                e1.setDepartment(edepartment);

                System.out.println("Enter Employee Age: ");
                int eage = sc.nextInt();
                e1.setAge(eage);*/


            // writing in the file using outputstream



        }
        catch(IOException e) {
            e.printStackTrace();
        }
        sc.close();


    }
}
