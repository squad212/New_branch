package com.trainning.sarita.Basicproject.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>(); // Arraylist


    public Student(String name, int... marks) { // variable arguments
        this.name = name;

        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;

    }

    public int getMaximumMar() {
        return Collections.max(marks);// can be done only on array list
        }


    public int getMinimumMark() {
        return Collections.min(marks);

    }


    public BigDecimal getAverageMarks(){
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide
                (new BigDecimal( number),  3, RoundingMode.UP);
        // rounding mode helps to command hoe many decimal should be printed
        // which is 3 and is should be round up by up.

    }

    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void addNewMark1(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int mark) {
        marks.remove(mark);
    }
}

