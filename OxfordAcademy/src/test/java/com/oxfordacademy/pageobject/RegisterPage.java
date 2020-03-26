package com.oxfordacademy.pageobject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	public class RegisterPage {
	
		WebDriver driver;
		By register=By.className("register");
		By email=By.id("EmailAddress");
		By Password=By.name("Password");
		By confirm_password=By.id("ConfirmPassword");
		By submit=By.xpath("//*[@id=\"registerBtn\"]");
		
		public RegisterPage(WebDriver driver) 
		{
			this.driver=driver;
		}

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
				driver.get("https://academic.oup.com/journals");//Launching the website
				System.out.println(driver.getTitle());
			}
			//Enter the details for valid registration
			public void registerDetails(String emailId,String password,String confrimPassword) throws InterruptedException, IOException
			//Entering the details in the required field
			{
				driver.findElement(register).click();
				driver.findElement(email).sendKeys(emailId);
				driver.findElement(Password).sendKeys(password);
			    driver.findElement(Password).sendKeys(Keys.TAB);
				driver.findElement(confirm_password).sendKeys(confrimPassword);
			    driver.findElement(confirm_password).sendKeys(Keys.TAB);
			    driver.findElement(confirm_password).sendKeys(Keys.TAB);
				driver.findElement(submit).sendKeys(Keys.ENTER);
				
				TakesScreenshot ts = (TakesScreenshot)driver;//Taking the screenshot
				File source =ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source,new File("src/test/resources/screenshot/inv.png"));
				
			}
			
			public void exit() throws InterruptedException, IOException
			{
				
				
				driver.quit();//closing the website
			}

	}

