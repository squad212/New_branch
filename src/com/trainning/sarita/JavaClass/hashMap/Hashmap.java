package com.trainning.sarita.JavaClass.hashMap;


import com.trainning.sarita.JavaClass.treeSet.employee;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        // Creating an empty HashMap
        HashMap<Integer,String> employee= new HashMap<Integer, String>();

        // Mapping string values to map
        employee.put(101, "Sarita Shrestha");
        employee.put(201, "Brutin Sempher");
        employee.put(301, "Durga Shrestha");
        employee.put(401, "Momo Don");
        employee.put(501, "Sarita Shrestha");
        employee.put(null, null);



        // Displaying the HashMap
        System.out.println("Hashmap size :" +employee.size());
        System.out.println("numberOfList" + employee);

        // Using keySet() to get the set view of keys
        System.out.println("The set is: " + employee.keySet());

        // to remove the values for the map
        employee.remove(501,"Sarita Shrestha");
        employee.remove(null,null);
        System.out.println("Hashmap size :" +employee.size());
        System.out.println("New list of employees: "  +employee);

    }
}
