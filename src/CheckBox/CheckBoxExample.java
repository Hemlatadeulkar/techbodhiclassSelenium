package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");	
		
		List<WebElement> totalcheckbox = driver.findElements(By.name("accessories"));
		
		for(int i=0;i<=totalcheckbox.size()-1;i++)
		{
			System.out.println(totalcheckbox.get(i).getAttribute("value"));
			totalcheckbox.get(i).click();

		}

}
}