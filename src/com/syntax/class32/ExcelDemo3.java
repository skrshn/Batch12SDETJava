package com.syntax.class32;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/JavaProperties/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet2");
        int rows = sheet.getPhysicalNumberOfRows();
        //int cols = sheet.getRow(0).getLastCellNum();

        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
