
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

	public class DeleteSavedSearchPage 
	{
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
		//sign details
		public void oxfordHomepage() throws InterruptedException 
		{
			driver.get("https://academic.oup.com/journals");//Launching the website
			driver.findElement(By.xpath("//*[@id=\"header-account-info-user-fullname\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"user_LoginFormPopup\"]")).sendKeys("gowtham19980303@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys("Gowtham@98");
			driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
		}
		//search comics page
		public void searchPage()
		{
			driver.findElement(By.id("header-account-info-user-fullname")).click();
			driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div/ul/li[4]/div/div/div[1]/a[7]")).click();
		}
		//deleting saved details
		public void deleteSaved() throws IOException
		{
			driver.findElement(By.id("delete1")).click();
			driver.findElement(By.id("header-account-info-user-fullname")).click();
			driver.findElement(By.xpath("/html/body/div[3]/section/div/div[2]/div/ul/li[4]/div/div/div[2]/a")).click();
			
			TakesScreenshot ts = (TakesScreenshot)driver;//Taking the screenshot
			File source =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("src/test/resources/screenshot/del.png"));
			
		}
		public void quit() throws IOException
		{
			
			driver.close();
		}

	}


