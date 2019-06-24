package com.webliska.selenium.social;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSocial {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		URL local = new URL("http://localhost:9515");
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		driver.navigate().to("https://www.facebook.com/r.php");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_m")))).sendKeys("tanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_o")))).sendKeys("singhal");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_r")))).sendKeys("tanyasinghal92@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_u")))).sendKeys("tanyasinghal92@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_y")))).sendKeys("sushma_68");
		Select date = new Select(driver.findElement(By.xpath("id('day')")));
        date.selectByVisibleText("24");
        Select month = new Select(driver.findElement(By.xpath("id('month')")));
        month.selectByVisibleText("Dec");
        Select year = new Select(driver.findElement(By.xpath("id('year')")));
        year.selectByVisibleText("1989");
        driver.findElement(By.xpath("//input[@value='1']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_16")))).click();
	}

}
