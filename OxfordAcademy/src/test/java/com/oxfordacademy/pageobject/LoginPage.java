package com.oxfordacademy.pageobject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginPage {
	
	WebDriver driver;
		
	public void launchBrowser(String browser) //Launch url
	{
		try
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","src\\test\\resources\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Internet Explore"))
			{
				System.setProperty("webdriver.ie.driver","src\\test\\resources\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		catch(WebDriverException e)
		{
			System.out.println("Browser could not be launched");
		}
		
	}
		public void oxfordHomepage()
		{
			driver.get("https://academic.oup.com/journals");//Launching the Oxford journal Website

			driver.findElement(By.xpath("//*[@id=\"header-account-info-user-fullname\"]")).click();//Clicking the sign in button
	}
		//Enter user details for valid and invalid log in
		public void oxfordDetails(String emailId,String password)throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"user_LoginFormPopup\"]")).sendKeys(emailId);
			driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.ENTER);
			//Thread.sleep(2000);
		}
			
		public void oxfordClose() throws InterruptedException, IOException 
		{
			
			
			driver.close();//closing the website
		}

	}

