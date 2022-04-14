package com.syntax.class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/JavaProperties/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet2");
        Row row = sheet.getRow(1);
        System.out.println(row.getCell(1));

    }
}
