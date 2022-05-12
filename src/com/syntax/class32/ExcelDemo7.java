package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/ExcelDemo6.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row=sheet.createRow(5);
        row.createCell(0).setCellValue("Asel");
        row.createCell(1).setCellValue("Kiya");
        row.createCell(2).setCellValue(45);
        row.createCell(3).setCellValue("Texas");
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        fileInputStream.close();

    }
}
