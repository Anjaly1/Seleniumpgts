package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommand {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("C:/Users/hp/Documents/Selenim%20pgms/html%20code.html");
		
		/*WebElement name=driver.findElement(By.id("001"));
		name.sendKeys("Anjaly");
		WebElement male=driver.findElement(By.id("002"));
		name.click();
		
		WebElement name=driver.findElement(By.name("A"));
		name.sendKeys("Anjaly");
		WebElement male=driver.findElement(By.name("B"));
		male.click();*/
		
		//WebElement link=driver.findElement(By.tagName("a"));
		//link.click();
		
		//xpath
		/*WebElement name=driver.findElement(By.xpath("//input[@id='001']"));
		name.sendKeys("Anjaly");
		WebElement male=driver.findElement(By.xpath("//input[@name='B']"));
		male.click();
		WebElement female=driver.findElement(By.xpath("//input[@name='C']"));
		female.click();*/
		
		//css selector
		WebElement name=driver.findElement(By.cssSelector("input[id='001']"));
		name.sendKeys("Anjaly");
		WebElement male=driver.findElement(By.cssSelector("input[name='B']"));
		male.click();
		WebElement female=driver.findElement(By.cssSelector("input[class='c3']"));
		female.click();
		
		
		
		
		
	}

}
