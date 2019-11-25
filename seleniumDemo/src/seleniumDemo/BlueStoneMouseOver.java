package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneMouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		List<WebElement> mouse =driver.findElements(By.xpath("//header/div[1]/div[2]/li"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		for(WebElement name:mouse)
		{
			System.out.println(name.getText());
			a.moveToElement(name).perform();
			Thread.sleep(1000);
		}
	}
		 

}
