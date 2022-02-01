
package com.trainning.sarita.basicproject.fileCreate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/note/file1.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data + " ");
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}