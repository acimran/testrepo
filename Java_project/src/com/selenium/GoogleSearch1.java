package com.selenium;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch1 {


static ChromeDriver chrome;


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\107\\chromedriver.exe");       
 chrome = new ChromeDriver();
chrome.manage().window().maximize();
chrome.get("https://www.google.com");


 chrome.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input").sendKeys("Fan"); 
Thread.sleep(3000); 
chrome.findElementByName("q").sendKeys(Keys.ENTER);

Thread.sleep(4000);
boolean f=chrome.findElementByLinkText("Sign in").isDisplayed();
if(f) {
System.out.println("Test is passed");
chrome.close();
}
else
{
System.out.println("Test is failed");
}



 




}

} 
 