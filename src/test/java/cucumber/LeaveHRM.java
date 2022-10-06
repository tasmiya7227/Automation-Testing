package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveHRM {
	
		private static WebDriver driver = null;
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		@When("user enters user name and password")
		public void user_enters_user_name_and_password() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			 
		
		}
		@Then("home page is displayed")
		public void home_page_is_displayed() {
		String actualResult;
		String expectedResult;
		expectedResult= "PIM";
		actualResult= driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualResult, expectedResult);
		
		}
		
		@Then("user able to apply for the leave")
		public void leave() {
			driver.findElement(By.linkText("Leave")).click();
			driver.findElement(By.linkText("Apply")).click();
			driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
			driver.findElement(By.xpath("//*[contains(text(),\"CAN\")]")).click();
			driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]/input")).sendKeys("2022-09-21");
			driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"][2]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).click();
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		}
	
		
		
		
	}

