package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.in/");
		WebElement name=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	
		System.out.println(name.getText());
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys(name.getText());
	}
}
