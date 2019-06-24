package com.webliska.selenium.social;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramSocial {

	public static void main(String[] args) throws MalformedURLException {
		URL local = new URL("http://localhost:9515");
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		driver.navigate().to("https://www.instagram.com/accounts/emailsignup/?hl=en");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("emailOrPhone")))).sendKeys("8806699967");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("fullName")))).sendKeys("Tanya Singhal");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username")))).sendKeys("qztanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password")))).sendKeys("aa12345bb12345cc");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='react-root']/section/main/div/article/div/div[1]/div/form/div[7]/div/button")))).click();
	}

}
