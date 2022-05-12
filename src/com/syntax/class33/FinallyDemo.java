package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            String path = "/Users/sakirsahin/Documents/WritingExcelPractice2.xlsx";
            fileInputStream = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet("Sheet1");
        } catch (FileNotFoundException exception) {
            System.out.println("The file that you're trying to read is not present, please check your path.");
        } catch (IOException ioException) {
            System.out.println("Something with hard drive went wrong.");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Now you should be able to perform other operations.");

    }
}
