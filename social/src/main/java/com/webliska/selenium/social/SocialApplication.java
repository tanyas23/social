package com.webliska.selenium.social;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialApplication {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//SpringApplication.run(SocialApplication.class, args);
		URL local = new URL("http://localhost:9515");

		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());

		// open the browser and go to open google.com

		
        driver.navigate().to("https://accounts.google.com/signup?hl=en-GB");
        WebDriverWait wait = new WebDriverWait(driver, 4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("firstName")))).sendKeys("tanya");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("lastName")))).sendKeys("singhal");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("username")))).sendKeys("zqtanya");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("passwd")));
        actions.click();
        actions.sendKeys("sushma_68");
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.id("confirm-passwd")));
        actions.click();
        actions.sendKeys("sushma_68");
        actions.build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("accountDetailsNext")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("phoneNumberId")))).sendKeys("8806699967");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("gradsIdvPhoneNext")))).click();
      
	}

}
