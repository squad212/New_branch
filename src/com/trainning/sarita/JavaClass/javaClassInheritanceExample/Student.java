package com.trainning.sarita.JavaClass.javaClassInheritanceExample;

public class Student {
    private int studentId;
    private String studentName;
    private String department;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString(){
        return studentId + "#" +studentName+ "#"+ department;
    }
}
