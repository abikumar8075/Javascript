package dataDriveTest;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\dsataDriven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		// Simple Alert
	 
//		driver.findElement(By.xpath(" //button[@class='btn btn-danger']")).click();
//		org.openqa.selenium.Alert a = driver.switchTo().alert();
//		a.accept();
		
		// confirm Alert
		
//	    driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
//	    Thread.sleep(30000);
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
//		Thread.sleep(5000);
//		org.openqa.selenium.Alert c = driver.switchTo().alert();
//		c.dismiss();
		
		//prompet Allert
		 driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		    Thread.sleep(30000);
			driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
			Thread.sleep(3000);
			org.openqa.selenium.Alert p = driver.switchTo().alert();
			Thread.sleep(3000);
			 p.sendKeys("Abinash");
			 Thread.sleep(3000);
			 p.accept();
	}
}