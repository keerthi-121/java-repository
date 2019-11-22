package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		search.sendKeys("java");
		List<WebElement> java=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for(WebElement name:java)
		{
		System.out.println(name.getText());
		}
		/*search.sendKeys("java",keys.ENTER);
		WebElement images=driver.findElement(By.xpath("//div/div[@class=\"hdtb-mitem hdtb-msel hdtb-imb\"]"));
		images.click();
		WebElement java=driver.findElement(By.xpath("//a/img[@id=\"rT8rqQKh8jt3DM:\"]"));
		java.click();*/
	}
}
