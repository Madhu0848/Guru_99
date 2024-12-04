package com.demoguru.genericutility;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {

    public String getDataFromExcel(String sheetName , int rowNum,int cellNum) throws IOException {

        FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\Guru99_Project\\src\\main\\commandata\\application(1).xlsx");
        Workbook wb= WorkbookFactory.create(fis);
        String data=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

        System.out.println("data : " +data );
        return data;


    }
}
