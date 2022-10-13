package alertshandling;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

				System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        
		        driver.get("https://demo.automationtesting.in/Alerts.html"); //getting website
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
				driver.findElement(By.linkText("Alert with Textbox")).click();
				driver.findElement(By.xpath("//button[@onclick = 'promptbox()']")).click();
				Alert alert = driver.switchTo().alert(); // switch to alert
				String alertMessage= driver.switchTo().alert().getText(); // capture alert message
				alert.sendKeys("Automation Testing- Krittika"); //sending keys 
				System.out.println(alertMessage); // Print Alert Message
				alert.accept();//accepting alert

				   

			}

		
	}


