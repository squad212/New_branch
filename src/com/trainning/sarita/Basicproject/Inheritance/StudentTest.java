package com.trainning.sarita.Basicproject.Inheritance;

import java.math.BigDecimal;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("sarita", "TAMUC");
        //student.setName("Sarita");
        student.setEmail("saritashres41@gmail.com");
        student.setCollegeName("TAMUC");
        student.setPhoneNumber("4692886572");
        student.setCollegeYear(2020);
        System.out.println(student);


        /*
        Person person = new Person();
         person.setName("Sarita");
        person.setEmail("saritashres41@gmail.com");
        person.setPhoneNumber("4692886572");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
          */

        Employee employee = new Employee("sarita", "senior");
        //employee.setName("Sarita");
        employee.setEmail("saritashres41@gmail.com");
        employee.setPhoneNumber("4692886572");
        employee.setEmployeeGrade('A');
        employee.setTitle("Senior");
        System.out.println(employee);



    }
}
