package com.webliska.selenium.social;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitterSocial {

	public static void main(String[] args) throws MalformedURLException {
		URL local = new URL("http://localhost:9515");
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		driver.navigate().to("https://twitter.com/signup");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("name")))).sendKeys("tanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("phone_number")))).sendKeys("8806699967");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='react-root']/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/span/span")))).click();
	}

}
