package dataDriveTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\dsataDriven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Thread.sleep(50000);
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("abikumar");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Pappu@8075");
		WebElement log = driver.findElement(By.xpath("//input[@value='Login']"));
		log.click();
		WebDriver frame = driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}

}
