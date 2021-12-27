package AlertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");	
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		//al.dismiss();
		al.accept();
		
		
		
	}
}
