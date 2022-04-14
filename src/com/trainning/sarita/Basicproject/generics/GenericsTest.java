package com.trainning.sarita.basicproject.generics;

import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {

        MyCustomList<String> list = new MyCustomList<String>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        list.addElement("Element 3");
        String value = list.get(0);
        System.out.println(value);



        /* as now our class is just taking the string so help with the genericf
         we will make you method to take all the data type)
         */
        MyCustomList<Integer> list2 = new MyCustomList<Integer>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(4));
        list2.addElement(Integer.valueOf(3));
        Integer number = list2.get(0);
        System.out.println(number);
    }

}
