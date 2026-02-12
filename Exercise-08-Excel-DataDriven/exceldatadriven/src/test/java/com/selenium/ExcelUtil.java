package com.selenium;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcelUtil {
    public static Object[][] getExcelData(String filepath,String sheetname){
       try{
        FileInputStream fis = new FileInputStream(new File(filepath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetname);
        int rowCount=sheet.getPhysicalNumberOfRows();
        int colCount=sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount-1][colCount];
        for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    data[i - 1][j] = row.getCell(j).toString();
                }
            }
        workbook.close();
        fis.close();
        return data;
       }
       catch(IOException e){
        e.printStackTrace();
        return null;
       }
    }
}
