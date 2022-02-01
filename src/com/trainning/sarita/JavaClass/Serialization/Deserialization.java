package com.trainning.sarita.JavaClass.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/note/serialization.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() != 0) {
                Employee employee = (Employee) ois.readObject();
                System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployeeName() + "\t" + employee.getDepartment() + "\t" + employee.getAge() + "\t");

            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}