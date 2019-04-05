package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static WebDriver driver;
	
	public static void main(String [] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.hoeffner.de/konfigurator/dreamer");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(Locators.width)).click();
		driver.findElement(By.xpath(Locators.height)).click();
		driver.findElement(By.xpath(Locators.color)).click();
		driver.findElement(By.xpath(Locators.submitButton)).click();
		
		
		
		driver.findElement(By.xpath(Locators.tuerenart)).click();
		driver.findElement(By.xpath(Locators.submitButton)).click();
		
		driver.findElement(By.xpath(Locators.handles)).click();
		driver.findElement(By.xpath(Locators.submitButton)).click();
	}
}
