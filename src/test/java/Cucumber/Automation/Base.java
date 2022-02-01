package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		//FileInputStream fis=new FileInputStream("C:\\Users\\Owner\\Documents\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		FileInputStream fis=new FileInputStream("S:\\TESTING\\WEB\\Eclipse\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);
		
		//S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 97.0.4692.71\\chromedriver.exe
		//FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
		System.setProperty("webdriver.chrome.driver", "S:\\TESTING\\WEB\\Eclipse\\Automation\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;

	}

}
