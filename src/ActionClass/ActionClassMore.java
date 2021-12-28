package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMore {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http:www.facebook.com/";
	
			driver.get(baseUrl);
	WebElement txtUsername = driver.findElement(By.id("email"));
	
	Actions builder = new Actions(driver);
	Action seriesOfActions = builder
		.moveToElement(txtUsername)	
		.click()
		.keyDown(txtUsername, Keys.SHIFT)
		.sendKeys(txtUsername, "hemlata")
		.keyUp(txtUsername, Keys.SHIFT)
		.doubleClick(txtUsername)
		.contextClick().build();
	
	seriesOfActions.perform();
		
		
		
			
	
	

}
}