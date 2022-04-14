package com.syntax.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static List<Map<String, String>> getData(String path,String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();

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
       return excelData;
    }
}
