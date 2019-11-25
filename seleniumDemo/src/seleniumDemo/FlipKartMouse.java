package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		WebElement popup=driver.findElement(By.xpath("//div/button[@class=\"_2AkmmA _29YdH8\"]"));
		popup.click();
		//driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::ul[@class='QPOmNK']/li/a[@title='Mi']"));
		
		List<WebElement> menu=driver.findElements(By.xpath("//div/ul[@class=\"_114Zhd\"]/li"));
		Actions a =new Actions(driver);
		Thread.sleep(3000);
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
			a.moveToElement(name).perform();
			Thread.sleep(3000);
		}
		
		
	}
}
