package com.syntax.class32;

import com.syntax.util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/ExcelDemo6.xlsx";
        List<Map<String, String>> excelData = ExcelReader.getData(path, "Sheet1");
        System.out.println(excelData.get(1).get("FirstName") );
    }
}
