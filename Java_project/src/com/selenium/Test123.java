package com.selenium;
 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;





import java.util.concurrent.TimeUnit;


//reading value of a particular cell
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Test123
{
static ChromeDriver chrome;
static String str="https://opensource-demo.orangehrmlive.com/";
static String Username=null;
static String Password=null;

public static void main(String[] args)  throws Exception
{ //String vOutput=null;
  String file1="E:\\Basic java training\\Test_files\\test_emp.xlsx";
ReadCellValue rc=new ReadCellValue();   //object of the class

//reading the value of 2nd row and 2nd column
System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\chromedriver86\\chromedriver.exe");






for(int i=1;i<3;i++)
{
		for(int j=0;j<2;j++) 
		{

 

		System.out.println(i);
		System.out.println(j);
		//vOutput=rc.ReadCellData(i, j,file1);
		//System.out.println(vOutput);
		
		 if (j==0)
			 {
			 Username= rc.ReadCellData(i,j, file1);
			 }
		 else
		 {
			 Password= rc.ReadCellData(i,j, file1);
		 }
		 	
	 
		}
		chrome= new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get(str);
		
		
		
		System.out.println(Username);
		System.out.println(Password);
		chrome.findElement(By.name("txtUsername")).sendKeys(Username);
		
		//chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chrome.findElement(By.name("txtPassword")).sendKeys(Password);
		
		 chrome.findElement(By.name("Submit")).click();
		
		 Thread.sleep(1000);
		 
		chrome.findElement(By.id("welcome")).click();
		chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chrome.findElement(By.linkText("Logout")).click();
		
		chrome.close();
		 
		
}
 
 
 
 
 }

//method defined for reading a cell
public String ReadCellData(int vRow, int vColumn,String file)
{
String value=null;          //variable for storing the cell value
Workbook wb=null;           //initialize Workbook null



try
{
//reading data from a file in the form of bytes
FileInputStream fis=new FileInputStream(file);
//constructs an XSSFWorkbook object, by buffering the whole streaminto the memory
wb=new XSSFWorkbook(fis);


}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e1)
{
e1.printStackTrace();
}

Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
Row row=sheet.getRow(vRow); //returns the logical row
Cell cell=row.getCell(vColumn); //getting the cell representing the given column
value=cell.getStringCellValue(); //getting cell value

try {
wb.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return value;               //returns the cell value

}

}

