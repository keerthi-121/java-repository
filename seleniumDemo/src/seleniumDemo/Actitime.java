package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement name=driver.findElement(By.id("username"));
		name.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.name("loginButton"));
		login.click();
		String title1=driver.getTitle();
		System.out.println(title1);

		
	}

	
	}


