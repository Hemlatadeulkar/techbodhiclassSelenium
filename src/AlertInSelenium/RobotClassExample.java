package AlertInSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//specify the file location
		StringSelection sel = new StringSelection("F:\\HEMLATARESUME.docx");
		
		//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		
		//open naukri.com
		driver.get("https://www.naukri.com/account/register/basicdetails");
		
		//click on upload resume button
		//driver.findElement(By.xpath("//button[@title='Iam a Professional']")).click();
		//Thread.sleep(3000);
		
		//click on upload resume button
		driver.findElement(By.name("uploadCV")).click();
		Thread.sleep(1000);
		
		//create object of robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		
		//press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//RELEASE ENTER
		robot.keyRelease(KeyEvent.VK_ENTER);
		//press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//RELEASE CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		
		
		
		
		
		
		
		
}
}