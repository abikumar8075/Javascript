package dataDriveTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\dsataDriven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
     
//		WebElement  table = driver.findElement(By.xpath("//table[@id='customers']"));
//       List<WebElement> allrows = table.findElements(By.tagName("tr"));
//       int size = allrows.size();
//       System.out.println(size);
//       String text = allrows.get(1).getText();
//       System.out.println(text);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1] 
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath ="//*[@id='customers']/tbody/tr[";
		String afterXpath= "]/td[1]";
		
		for(int i=2;i<=7;i++) {
		String actualXpath=	beforeXpath+i+afterXpath;
		WebElement xpath = driver.findElement(By.xpath(actualXpath));
		String text = xpath.getText();
	System.out.println(text);
			 
		}
		
}
}