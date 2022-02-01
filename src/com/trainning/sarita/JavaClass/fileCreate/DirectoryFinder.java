package com.trainning.sarita.JavaClass.fileCreate;

import java.io.File;
import java.io.IOException;


public class DirectoryFinder {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\note");
        File fileArray[] = f.listFiles();
        int dirCount =0, fileCount =0;
        String dirList = "", fileList = "";
        for (File file : fileArray) {
            if (file.isDirectory()) {
                dirCount++;
                dirList = dirList + file + "\n";

            } else {
                fileCount++;
                fileList = fileList + file + "\n";
            }
        }
            System.out.println("Number of Directories =" +dirCount);
            System.out.println(dirList);
            System.out.println("Number of file ="+fileCount);
            System.out.println(fileList);

        }
    }
