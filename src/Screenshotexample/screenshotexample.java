package Screenshotexample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotexample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\techbodhi\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in/");
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File cpFile =scrshot.getScreenshotAs(OutputType.FILE);
		
		//TAKE CURRENT DATE AND TIME
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String abc = formatter.format(date).toString().replace("/", "");
		String exactpathfilename=abc.replace(" ", "").replace(":", "");
		System.out.println(exactpathfilename);
		
		String CapturePath = "E:\\techbodhi\\file\\"+exactpathfilename+".png";
				
		try		
		{
			//save the screenshot taken in destination path
			FileUtils.copyFile(cpFile, new File(CapturePath));
		}
			
		catch (IOException e)	{
			e.printStackTrace();
		}
			driver.close();
			
		}
				
				
				
				
				
				
				
		
		
	
		
		
		
		
		
		
		
		
		
	}


