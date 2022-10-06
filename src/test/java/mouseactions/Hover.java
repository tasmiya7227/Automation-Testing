package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl;
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aptransport.org/");
		//	d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions mouse=new Actions(driver);
		driver.manage().window().maximize();
		mouse.moveToElement(driver.findElement(By.linkText("LICENCE"))).build().perform();
		Thread.sleep(1000);
	}

}
