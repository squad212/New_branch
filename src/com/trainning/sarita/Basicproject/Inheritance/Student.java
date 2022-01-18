package com.trainning.sarita.Basicproject.Inheritance;

// extend help to give the all the info of the person.person is super class and student is sub class

public class Student extends Person{
    private String collegeName;
    private int collegeYear;
    private String title;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;// this means collegename is mandatory
        System.out.println("student constructor");
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeYear() {
        return collegeYear;
    }

    public void setCollegeYear(int collegeYear) {
        this.collegeYear = collegeYear;
    }

    public String toString() {
        return super.toString()+"#" +collegeName + " # " +collegeYear ;
    }
}

