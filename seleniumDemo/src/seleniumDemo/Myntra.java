package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement myntra=driver.findElement(By.xpath("//div/input[@class=\"desktop-searchBar\"]"));
		myntra.sendKeys("shoes",Keys.ENTER);
		driver.findElement(By.xpath("//img[@src=\"https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/productimage/2019/5/23/6dcbe5ad-4a79-4e81-8dd8-576ab3b8533e1558558334633-1.jpg\"]")).click();
		
	    
	}

}
