package dataDriveTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\dsataDriven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 WebElement face = driver.findElement(By.id("email"));
	 face.sendKeys("Abinashyadav6004@gmail.com");
	 
	 Actions a = new Actions(driver);
	 a.doubleClick(face).perform();
	 a.contextClick().perform();
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
}
}

	
