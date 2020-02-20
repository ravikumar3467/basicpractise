package com.basicpractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static WebDriver driver;
	public static Properties p;
	public static String projectpath =System.getProperty("user.dir");

	public static void init() throws Exception

	{

		//FileInputStream fis = new FileInputStream("D:\\Selenium Prog\\Basiclearning\\data.properties");
		
		FileInputStream fis = new FileInputStream(projectpath+"\\data.properties");
		
		p = new Properties();
		p.load(fis);

	}

	public static void Launch(String browser) throws Exception {

		if (p.getProperty(browser).equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (p.getProperty(browser).equals("Firefox"))

		{

			System.setProperty("webdriver.gecko.driver", projectpath +"\\drivers\\geckodriver.exe");
			Thread.sleep(5000);
			driver = new FirefoxDriver();
		

		}
	}

	public static void navigateurl(String url)

	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));

	}

}
