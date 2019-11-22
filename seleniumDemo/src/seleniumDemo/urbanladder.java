package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		List<WebElement> menu=driver.findElements(By.xpath("//span[contains(.,'Dining')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
		/*driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		WebElement dining=driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]"));
		System.out.println(dining.getText());
		Thread.sleep(5000);
		driver.findElement(By.id("search")).sendKeys(dining.getText());
		WebElement stores=driver.findElement(By.xpath("//ul/li/a[contains(.,'Stores ')]"));
		stores.click();
		WebElement trackorder=driver.findElement(By.xpath("//li/a[contains(.,'Track Order')]"));
		
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"featuredLinksBar__linkContainer\"]"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}*/
		
	}

}
