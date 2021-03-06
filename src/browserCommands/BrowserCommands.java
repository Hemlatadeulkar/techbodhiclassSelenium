package browserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//GET COMMAND TO INVOKE BROWSER
	driver.get("http://www.seleniumframework.com/Practiceform/");
	 
	//COMMAND TO TAKE TITLE OF PAGE
	String PageTitle =driver.getTitle();
	System.out.println(PageTitle);
	
	//command to take current url
	String PageCurrentURL = driver.getCurrentUrl();
	System.out.println(PageCurrentURL);
	
	//close and quit
	
	driver.findElement((By.xpath("//button[text()='New Browser Tab'] ")));
	
	//driver.close();
	driver.quit();

}
}