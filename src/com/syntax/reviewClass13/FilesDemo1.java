package com.syntax.reviewClass13;

import java.io.*;
import java.util.Scanner;

public class FilesDemo1 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/sakirsahin/IdeaProjects/Batch12SDETJava/output.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }
//        String path2 = "/Users/sakirsahin/IdeaProjects/Batch12SDETJava/output.java";
//        FileOutputStream fileOutputStream = new FileOutputStream(path2);
//
//        fileInputStream.close();
//        fileOutputStream.close();

    }
}
