package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilities {
	public  ChromeDriver driver= new ChromeDriver();
	

	public void launch_url(String s) {
		driver.get(s);
		driver.manage().window().maximize();
		
	}
	public void login(String uname, String Password) throws InterruptedException
	{
		//String uname1="Admin";
		//String Password="admin123";
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElementByXPath("//button[@type='submit']").click();
		
	
	}
	public void Adminlaunch() throws InterruptedException {
		
		
		Thread.sleep(3000);
		//driver.findElementByXPath("//span[text()='Admin']").click();
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']").sendKeys("Admin");
		driver.findElementByXPath("//button[@type='submit']").click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		 			

		 Thread.sleep(3000);
		driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]/i[1]").click();
		 Thread.sleep(3000);
		boolean b = driver.findElementByXPath("//span[contains(text(),'User Management')]").isDisplayed();
        if(b)
        {
        	System.out.println("we verified the Admin tab");
        	
        }
        else {
        	System.out.println("Not verified the Admin tab");
        }
			
		
	}
	public void Pim() throws InterruptedException
	{	Thread.sleep(4000);
	    driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span").click();
		//driver.findElementByXPath("    <button type=\"button\" class=\"oxd-button oxd-button--medium oxd-button--secondary\" data-v-7e88b27e=\"\" data-v-31d6f9fc=\"\" xpath=\"1\"></button>").click();
		Thread.sleep(2000);
	    driver.findElementByXPath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']").sendKeys("0038");
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", ""); 
		boolean b = driver.findElementByXPath("//span[@class='oxd-topbar-body-nav-tab-item']").isDisplayed();
        if(b)
        {
        	System.out.println("we verified the pim tab");
        	
        }
        else {
        	System.out.println("Not verified the pim tab");
        }
			
		
	}
	public void Time() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]").click();
        
		Thread.sleep(3000);
		boolean b = driver.findElementByXPath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']").isDisplayed();
        if(b)
        {
        	System.out.println("we verified the time tab");
        	
        }
        else {
        	System.out.println("Not verified the time tab");
        }
        
	}
	
	public void closebrowser()
	{
		driver.close();
	}
	public void Recruitment() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Recruitment']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-candidate-page']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-header-container']/button[1]").click();
		Thread.sleep(3000);
		boolean b = driver.findElementByXPath("//div[@class='oxd-topbar-body']").isDisplayed();
		
		if(b)
        {
        	System.out.println("we verified the Recruitment tab");
        	
        }
        else {
        	System.out.println("Not verified the Recruitment tab");
        }
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[contains(text(),'Logout')]").click();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\107\\chromedriver.exe");       
			// driver= new ChromeDriver();
		  String file1="E:\\Basic java training\\Test_files\\test_emp.xlsx";
			
		utilities  a = new utilities();
		a.launch_url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ReadCellValue r=new ReadCellValue();
		
		String username=r.ReadCellData(1, 0, file1);
		String password=r.ReadCellData(1, 1, file1);
	 	a.login(username, password);
		a.Adminlaunch();
		a.logout();
	 
		a.login("Admin", "admin123");
		a.Pim();
		a.logout();
	 	
		a.login("Admin", "admin123");
		a.Time();
		a.logout();
	 
		a.login("Admin", "admin123");
		a.Recruitment();
		a.logout();
		a.closebrowser();
	
	}

}
