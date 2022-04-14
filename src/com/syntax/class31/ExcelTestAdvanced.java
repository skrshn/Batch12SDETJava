package com.syntax.class31;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelTestAdvanced {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/ExcelTest.xlsx";
        String pathO = "/Users/sakirsahin/Documents/ExcelTestOutput.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(2).getLastCellNum();
        for (int i = 3; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String value = sheet.getRow(i).getCell(j).toString();
                System.out.println(value);
            }
        }

//        sheet.createRow(0).createCell(0).setCellValue("Test");
//        sheet.getRow(5).getCell(3).setCellValue(55523.59);

        for (int i = 3; i < rows; i++) {
            if (sheet.getRow(i).getCell(4).toString().equals("Yes")){
                //sheet.createRow(0).createCell(0).setCellValue("Test");
                sheet.getRow(i).getCell(0).setCellValue("Sakir1");
                sheet.getRow(i).getCell(1).setCellValue("Sahin1");
                sheet.getRow(i).getCell(2).setCellValue("11111");
                sheet.getRow(i).getCell(3).setCellValue("");
                sheet.getRow(i).shiftCellsRight(3,4,5);

            }
        }


        FileOutputStream fileOutputStream=new FileOutputStream(pathO);
        workbook.write(fileOutputStream);

        workbook.close();
        fileInputStream.close();


    }
}
