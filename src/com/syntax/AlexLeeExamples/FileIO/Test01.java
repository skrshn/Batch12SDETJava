package com.syntax.AlexLeeExamples.FileIO;

import java.io.*;

public class Test01 {

    public static void main(String[] args) throws IOException {

        String[] names = {"John", "Carl", "Jerry"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sakirsahin/Desktop/output.txt"));
        writer.write("Writing to a file");
        writer.write("\nWriting to a file");
        for (String name : names
        ) {
            writer.write("\n" + name);
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("/Users/sakirsahin/Desktop/output.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        File myObj = new File("/Users/sakirsahin/Desktop/output2.txt");
        if (myObj.createNewFile()) {
            System.out.println("File Created: " + myObj.getName() + " " + myObj.getAbsolutePath());
        } else
            System.out.println("Problem occured.");

        File myObj2 = new File("/Users/sakirsahin/Desktop/output.txt");

        if(myObj2.exists()){
            System.out.println(myObj2.getName());
            System.out.println(myObj2.getAbsolutePath());
            System.out.println(myObj2.canWrite());
            System.out.println(myObj2.canRead());
            System.out.println(myObj2.length());
        }else
            System.out.println("File not exist.");

    }
}
