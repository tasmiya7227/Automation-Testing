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
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//name
		driver.findElement(By.name("username")).sendKeys("Admin");
		//relative xpath
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		//Absolute xpath
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//linktext
		driver.findElement(By.linkText("Add Employee")).click();
		
		//PIM
		driver.findElement(By.name("firstName")).sendKeys("Abcd");
		driver.findElement(By.name("lastName")).sendKeys("Xyz");
		// save button
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		
		//Admin
		driver.findElement(By.xpath("//a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();	
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text-input\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"ESS\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Alice Duval");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text-input\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Enabled\")]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		
		//Apply leave		
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"CAN\")]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]/input")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"][2]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(10000);
		//Directory
		driver.findElement(By.linkText("Directory")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Peter Mac Anderson");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Chief Financial Officer\")]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Signout
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//li[4]/a[@class=\"oxd-userdropdown-link\"]")).click();
		
	
	}
	
	

}
