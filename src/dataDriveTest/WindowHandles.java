package dataDriveTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\dsataDriven\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			 driver.findElement(By.id("nav-search-submit-button")).click();
			 
			 String windowHandle = driver.getWindowHandle();
			 System.out.println(windowHandle);
			 driver.findElement(By.xpath(" (//img[@class='s-image'])[1]")).click();
			
	         Set<String> windowHandles = driver.getWindowHandles();
	         System.out.println(windowHandles);
	         
	        for(String x:windowHandles) {
	        	if(!windowHandle.equals(x)) {
	        		driver.switchTo().window(x);
	        		
	        	}
	        }
	        Thread.sleep(5000);
			 driver.quit();
		}
	 
	

		 
	}


