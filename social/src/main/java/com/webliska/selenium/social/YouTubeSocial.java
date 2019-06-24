package com.webliska.selenium.social;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTubeSocial {

	public static void main(String[] args) throws MalformedURLException {
		URL local = new URL("http://localhost:9515");
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		driver.navigate().to("https://www.youtube.com/");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("ytd-masthead div#buttons ytd-button-renderer a")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("identifierId")))).sendKeys("tanyasinghal92@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("identifierNext")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password")))).sendKeys("Positive_23");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("passwordNext")))).click();
	}

}
