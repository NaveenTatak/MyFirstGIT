package com.app.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {
	
	public static WebDriver driver = null;

		public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys(excelreuse(3,0));
		driver.findElement(By.id("password")).sendKeys(excelreuse(4,0));
	}
		
//	public static String excelreuse(int i, int j) {
//		String value = null;
//		try {
//			File f = new File("C:\\Users\\NANIKUTTY\\Downloads\\A_July_2025\\A_July_2025\\src\\test\\resources\\TestData");
//			// read
//			FileInputStream fis = new FileInputStream(f);
//			//
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.getSheet("Sheet1");
//			Row row = sheet.getRow(i);
//			Cell cell = row.getCell(j);
//			int cellType = cell.getCellType();
//			if (cellType == 1) {
//				value = cell.getStringCellValue();
//				System.out.println(value);
//			} else if (cellType == 0) {
//				if (DateUtil.isCellDateFormatted(cell)) {
//					Date dateCellValue = cell.getDateCellValue();
//					// System.out.println(dateCellValue);
//					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
//					value = sm.format(dateCellValue);
//					System.out.println(value);
//				} else {
//					double numericCellValue = cell.getNumericCellValue();
//					long l = (long) numericCellValue;
//					value = String.valueOf(l);
//					System.out.println(value);
//				}
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return value;
//
//	}
//
//}
