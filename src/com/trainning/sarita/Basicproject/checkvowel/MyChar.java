package com.trainning.sarita.Basicproject.checkvowel;

import java.math.BigDecimal;

public class MyChar {



    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }




    //'a', 'e', 'i', 'o', 'u' and their Capitals, || is or
    public boolean isVowel() {
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'
                ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
            return true;
        return false;
    }

    public boolean isDigit() {
        if(ch >= 48 && ch<= 57) // value between'0' and '9'
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if(ch >=97 && ch <=122 || ch >=65 && ch <=90) // valuebetween 'a' and 'z'
            return true;
        return false;
    }
    public boolean isConsonant (){
        // Consonant is alphabet not a vowel.
        if(isAlphabet() && ! isVowel())
            return true;
        return false;

    }
    // print all lower case
    public static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }
    // print all upper case
    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}