package com.webliska.selenium.social.controller;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



@RestController
public class AccountCreateController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/googleaccountcreation")
    public String googleaccountcreation() throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().version("2.46").setup();
		 WebDriver driver = new ChromeDriver(); 
       driver.navigate().to("https://accounts.google.com/signup?hl=en-GB");
       WebDriverWait wait = new WebDriverWait(driver, 4000);
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("firstName")))).sendKeys("tanya");
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("lastName")))).sendKeys("singhal");
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("username")))).sendKeys("zqtanya");
       Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(By.id("passwd")));
       actions.click();
       actions.sendKeys("susam_68");
       actions.build().perform();
       actions.moveToElement(driver.findElement(By.id("confirm-passwd")));
       actions.click();
       actions.sendKeys("susam_68");
       actions.build().perform();
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("accountDetailsNext")))).click();
       Thread.sleep(1000);
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("phoneNumberId")))).sendKeys("8806699967");
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("gradsIdvPhoneNext")))).click();
        return "BenefitWordCompletionAPI";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/facebookaccountcreation")
    public String facebookaccountcreation() throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().version("2.46").setup();
		 WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.facebook.com/r.php");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_m")))).sendKeys("tanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_o")))).sendKeys("singhal");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_r")))).sendKeys("tosocial52@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_u")))).sendKeys("tosocial52@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_y")))).sendKeys("selenium@123");
		Select date = new Select(driver.findElement(By.xpath("id('day')")));
        date.selectByVisibleText("24");
        Select month = new Select(driver.findElement(By.xpath("id('month')")));
        month.selectByVisibleText("Dec");
        Select year = new Select(driver.findElement(By.xpath("id('year')")));
        year.selectByVisibleText("1989");
        driver.findElement(By.xpath("//input[@value='1']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("u_0_16")))).click();
        return "Facebook";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/instagramaccountcreation")
    public String instagramaccountcreation() throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().version("2.46").setup();
		 WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.instagram.com/accounts/emailsignup/?hl=en");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("emailOrPhone")))).sendKeys("8806699967");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("fullName")))).sendKeys("Tanya Singhal");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username")))).sendKeys("qztanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password")))).sendKeys("aa12345bb12345cc");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='react-root']/section/main/div/article/div/div[1]/div/form/div[7]/div/button")))).click();
        return "Instagram";
    }

	@RequestMapping(method = RequestMethod.GET, path = "/youtubeaccountcreation")
    public String youtubeaccountcreation() throws InterruptedException, MalformedURLException {
		URL server = new URL("http://132.148.240.192:4444/wd/hub");
		//http://132.148.240.192:4444/grid/console
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName("chrome");
	    WebDriver driver = new RemoteWebDriver(server, capabilities);
		/*WebDriverManager.chromedriver().version("2.46").setup();
		 WebDriver driver = new ChromeDriver(); */
		driver.navigate().to("https://www.youtube.com/");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("ytd-masthead div#buttons ytd-button-renderer a")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("identifierId")))).sendKeys("tosocial52@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("identifierNext")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password")))).sendKeys("selenium@123");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("passwordNext")))).click();
        return "Youtube";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/twitteraccountcreation")
    public String twitteraccountcreation() throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().version("2.46").setup();
		 WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://twitter.com/signup");
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("name")))).sendKeys("tanya");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("phone_number")))).sendKeys("8806699967");
        return "twitter";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/index")
    public String index() {
      // logger.debug("Index page hit");
        return "It worked";
    }


}
