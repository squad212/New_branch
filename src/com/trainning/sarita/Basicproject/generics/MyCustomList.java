package com.trainning.sarita.basicproject.generics;

import java.util.ArrayList;


/* <T> is adding the generic so that we can use any type of datatype
T extends number will make class to deal with number only not integer.
 */
public class MyCustomList<T>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }
    public String toString() {
        return list.toString();
    }

    public T get(int index) {
        return list.get(index);
    }

}
