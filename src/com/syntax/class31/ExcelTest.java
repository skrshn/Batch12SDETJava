package com.syntax.class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelTest {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/Book.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        // Row row = sheet.getRow(1);
        //System.out.println(row.getCell(1));

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                Row row = sheet.getRow(i);
                System.out.println(row.getCell(j));

            }
        }
    }
}
