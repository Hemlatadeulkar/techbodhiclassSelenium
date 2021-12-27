package RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");	
		
		boolean RadioButtonSelected = driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
		System.out.println(RadioButtonSelected);
		
		if(RadioButtonSelected == false)
		{
			driver.findElement(By.xpath("//input[@value='Bicycle']")).click();
		}
		
		List<WebElement> RadioButtons = driver.findElements(By.name("vehicle"));
		System.out.println(RadioButtons.size());
		
		//driver close();
		
		
	}

}
