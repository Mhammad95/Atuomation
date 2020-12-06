package com.company.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Abstraction {

	 static WebDriver Driver;
	
	
	public static void main(String[] args) {
		
		Abstraction abstractionDemo = new Abstraction();
		abstractionDemo.login();
		abstractionDemo.logout();

	}

	public void login(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
	     Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		
		        Driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				Driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				Driver.findElement(By.id("btnLogin")).click();
				
				Driver.findElement(By.linkText("Welcome Paul")).click();
				
				JavascriptExecutor js = (JavascriptExecutor) Driver;
		        js.executeScript("window.scrollBy(0,1000)");
		        
//				Driver.findElement(By.xpath("//a[text()='Logout']")).click();

//		        JavascriptExecutor js = (JavascriptExecutor) Driver;
//		        js.executeScript("window.scrollBy(0,1000)");
//				
		
//				Driver.close();
		
	}
	
	
	public static void logout(){
		
		
		Driver.findElement(By.linkText("Welcome Paul")).click();
		Driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}	
}
