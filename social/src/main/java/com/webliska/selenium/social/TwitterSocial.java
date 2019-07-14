package com.webliska.selenium.social;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterSocial {

	public static void main(String[] args) throws MalformedURLException, AWTException {
		WebDriverManager.chromedriver().version("2.42").setup();
		 WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://twitter.com/signup");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("name")))).sendKeys("tanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("phone_number")))).sendKeys("8806699121");
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='react-root']/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/span/span")))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("react-root")))).click();
		
	}

}
