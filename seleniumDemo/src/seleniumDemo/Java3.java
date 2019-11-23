package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		WebElement java=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		java.sendKeys("java",Keys.ENTER);
		List<WebElement> menu=driver.findElements(By.xpath("//span[@class=\"S3Uucc\"]/parent::h3"));
		for(WebElement names:menu)
		{
			System.out.println(names.getText());
		}
		WebElement third=driver.findElement(By.xpath("//span[contains(.,'Introduction to Java - W3Schools')]"));
		third.click();
	
	}
}
