package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/JavaProperties/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(1);
        //System.out.println(workbook.getSheetIndex("Sheet2"));
        System.out.print(sheet.getRow(0).getCell(0)+" ");
        System.out.println(sheet.getRow(0).getCell(1));

        System.out.print(sheet.getRow(1).getCell(0)+" ");
        System.out.println(sheet.getRow(1).getCell(1));

    }
}
