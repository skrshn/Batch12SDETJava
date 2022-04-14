package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/ExcelDemo4.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Sakir in there");
        //sheet.getRow(i).getCell(0).setCellValue("Sakir1");
        workbook.write(fileOutputStream);

    }
}
