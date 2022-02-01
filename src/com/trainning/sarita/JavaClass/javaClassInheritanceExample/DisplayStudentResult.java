package com.trainning.sarita.JavaClass.javaClassInheritanceExample;

public class DisplayStudentResult extends StudentResult {


    public void display(float average) {

            if (average >= 80.0f) {
                System.out.println("Distinction");
            } else { if (average >= 65.0f) {
                System.out.println("First Division");
            } else { if (average >= 55.0f) {
                System.out.println("Second Division");
            } else { if (average >= 45.0f) {
                System.out.println("Third Division");
            } else {
                System.out.println("Fail");
                        }
                    }
                }
            }
        }

}
