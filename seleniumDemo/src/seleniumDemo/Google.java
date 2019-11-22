package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		WebElement clear=driver.findElement(By.name("q"));
		clear.clear();
		Thread.sleep(2000);
		WebElement assign=driver.findElement(By.name("q"));
		assign.sendKeys("selenium",Keys.ENTER);
		driver.navigate().back();
		
		//Thread.sleep(2000);
		//search.click();
	}

}
