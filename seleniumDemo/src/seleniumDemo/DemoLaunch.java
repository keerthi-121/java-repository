package seleniumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("keerthi");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("keerthi");
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent+"P");
		Thread.sleep(2000);
		Set<String> wins=driver.getWindowHandles();
		Thread.sleep(2000);
		//wins.remove(parent);
		for(String win:wins)
		{
			System.out.println(win +"c");
			Thread.sleep(2000);
			driver.navigate();
			
		}
		/*driver.navigate().to("https://www.google.com/search?ei=CgjVXciVFYzK0PEPyvKTgAM&q=google&oq=google&gs_l=psy-ab.3..0i131i67l2j0l4j0i131j0l2j0i131.9901.9901..10846...0.2..0.413.413.4-1......0....1..gws-wiz.......0i71.uhxdl1VG2kw&ved=0ahUKEwjIwr_PvfjlAhUMJTQIHUr5BDAQ4dUDCAs&uact=5");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
		/*driver.get("https://www.google.com/search?q=facebook&oq=facebo&aqs=chrome.0.0j69i57j0l4.3772j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();*/
			}

}
