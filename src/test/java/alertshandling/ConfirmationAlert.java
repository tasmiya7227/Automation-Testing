package alertshandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shivaram\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alerttconfirm = driver.switchTo().alert();
        String name = alerttconfirm.getText();
        System.out.println("Alert text is: " + name);
        Thread.sleep(2000);
        alerttconfirm.accept();
	}

}
