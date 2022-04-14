package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/ExcelDemo6.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                Row row = sheet.getRow(i);
//                Cell cell = row.getCell(j);
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }


        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);
        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            LinkedHashMap<String, String> map = new LinkedHashMap();
            for (int j = 0; j < cols; j++) {
                map.put(headerRow.getCell(j).toString(), row.getCell(j).toString());
            }
            excelData.add(map);
        }
        System.out.println(excelData);
    }
}