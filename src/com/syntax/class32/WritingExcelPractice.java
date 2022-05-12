package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelPractice {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        Object empData[][] = {
                {"EmpID", "Name", "Job"},
                {101, "David", "Engineer"},
                {102, "Smith", "Manager"},
                {103, "Scott", "Analyst"}
        };
        int rowCount = 0;
        for (Object emp[]:empData) {
            Row row = sheet.createRow(rowCount++);
            int colCount = 0;
            for (Object cell:row
                 ) {
                Cell cellData = row.createCell(colCount++);
                if(cell instanceof String){
                    cellData.setCellValue(cell.toString());
                }
                if(cell instanceof Integer){
                    cellData.setCellValue((Integer) cell);
                }
                if(cell instanceof Boolean){
                    cellData.setCellValue((Boolean) cell);
                }

            }
        }

//
//        int rows = empData.length;
//        int cols = empData[0].length;
//
//        for (int i = 0; i < rows; i++) {
//            Row row = sheet.createRow(i);
//            for (int j = 0; j < cols; j++) {
//                Cell cell = row.createCell(j);
//                Object objValue=empData[i][j];
//                if(objValue instanceof String){
//                    cell.setCellValue(objValue.toString());
//                }
//                if(objValue instanceof Integer){
//                    cell.setCellValue((Integer) objValue);
//                }
//                if(objValue instanceof Boolean){
//                    cell.setCellValue((Boolean) objValue);
//                }
//            }
//        }

        String path = "/Users/sakirsahin/Documents/WritingExcelPractice2.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();

    }
}
