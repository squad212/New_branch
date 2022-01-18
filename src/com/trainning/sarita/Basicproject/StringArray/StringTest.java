package com.trainning.sarita.Basicproject.StringArray;

public class StringTest {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[]{" Sunday", " Monday", " Tuesday", " Wednesday",
                " Thursday", " Friday", " Saturday"};

        String dayWithMostCharacters = "";
        for (String day : daysOfWeek) {
            if (day.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = day;
            }
        }
        System.out.println("Days with Most character:  " + dayWithMostCharacters);
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print(daysOfWeek[i]);

        }
        System.out.println();

        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.print(daysOfWeek[i]);
        }
    }

}

