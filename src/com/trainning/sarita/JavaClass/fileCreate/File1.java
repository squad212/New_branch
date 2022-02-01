package com.trainning.sarita.JavaClass.fileCreate;


import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
        public static void main(String[] args) {
            try {
                FileOutputStream fos = new FileOutputStream("D:/note/file1.txt");
                String message = "hajthadshsfk\n" +
                        "shfgskgdgkdf\n" +
                        "adgdsfgdgdsg\n" +
                        "dgdfgdgdsgsd";
                fos.write (message.getBytes());
                System.out.println("Successfully wrote to the file.");
                fos.close();
            } catch (IOException e) {
                //System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

