package seleniumcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) 
	{
	    WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		//WebDriver driver= new FirefoxDriver();
		
		/*driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://www.youtube.com");  //same as that of driver.get(); command
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();*/
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		//driver.quit();
		

	}

}
