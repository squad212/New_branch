package com.trainning.sarita.Basicproject.checkvowel;



public class MyCharTest {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('B');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
       // e written a note here.
    }
}


