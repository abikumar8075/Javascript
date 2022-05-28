package dataDriveTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTest {
	public static void main(String[] args) throws IOException {

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
		System.out.println(frame);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		WebElement newcontain = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		newcontain.click();

		WebElement select = driver.findElement(By.name("title"));

		Select s = new Select(select);
		s.selectByVisibleText("Dr.");
		driver.findElement(By.id("first_name")).sendKeys("Abinash");
		driver.findElement(By.id("middle_initial")).sendKeys("kumar");
		driver.findElement(By.id("surname")).sendKeys("yadav");
		WebElement select2 = driver.findElement(By.name("suffix"));
		Select s2 = new Select(select2);
		s2.selectByVisibleText("IV");

		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,
				new File("C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\dsataDriven\\screenshot.jpg"));

		WebElement radio = driver.findElement(By.name("receive_email"));
		radio.click();
		boolean selected = radio.isSelected();
		System.out.println(selected);

		WebElement radio1 = driver.findElement(By.xpath("(//input[@value='N'])[1]"));
		radio1.click();
		WebElement index = driver.findElement(By.name("type"));
		Select s3 = new Select(index);
		s3.selectByIndex(1);

		// driver.findElement(By.id("fieldId_birthday")).sendKeys("3/7/1993");

		// driver.findElement(By.id("")).sendKeys("3");

		// driver.findElement(arg0)

	}
}
