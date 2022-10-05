package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//name
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//relative xpath
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		//Absolute xpath
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
		//linktext
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		driver.findElement(By.name("firstName")).sendKeys("Abcd");
		driver.findElement(By.name("lastName")).sendKeys("Xyz");
		
		// save button
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		
		//Signout
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//li[4]/a[@class=\"oxd-userdropdown-link\"]")).click();
		
	
	}
	
	

}
