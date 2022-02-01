package com.trainning.sarita.basicproject.collection;

// import com.trainning.sarita.basicproject.array.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<StudentCollection> {
    @Override
    public int compare(StudentCollection student1, StudentCollection student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }
}


public class StudentCollectionTest {
    public static void main(String[] args) {
        List<StudentCollection> students= List.of(new StudentCollection(1, "Sarita"),
                new StudentCollection(10,"Brutin"),
                new StudentCollection(2,"Momo"));
        //System.out.println(students);

        ArrayList<StudentCollection> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);

        /* This line print the student in the order
        for ascending order*/


        Collections.sort(studentsAl);
        System.out.println("Asc" + studentsAl);

        // for descending order

        Collections.sort(studentsAl,new AscendingStudentComparator());
        System.out.println( "Ascending Student Comparator" +studentsAl);






    }
}
