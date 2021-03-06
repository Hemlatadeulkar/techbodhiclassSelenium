package SwitchToWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchtoWindowExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");	
		Thread.sleep(3000);
		driver.findElement(By.id("win1")).click();
		
		//get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		Iterator<String> iterator = allWindowHandles.iterator();
		while(iterator.hasNext())
		{
		String child_window=iterator.next();
		if(!mainWindowHandle.equals(child_window))
		{
			driver.switchTo().window(child_window);
			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.close();
		}	
		//switch to the parent window
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("sedan-checkbox")).click();
		System.out.println(driver.getTitle());
		
		
		}
		}
		
		

}
