package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		/*WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello world");
		WebElement messagec=driver.findElement(By.id("button-one"));
		messagec.click();
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("10");
		WebElement A=driver.findElement(By.id("button-one"));
		A.click();
		WebElement B=driver.findElement(By.id("value-b"));
		B.sendKeys("10.5");*/
		
		//xpath
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Hello world");
		WebElement messagec=driver.findElement(By.xpath("//button[@id='button-one']"));
		messagec.click();
		WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		valueA.sendKeys("10");
		WebElement B=driver.findElement(By.xpath("//input[@id='value-b']"));
		B.sendKeys("10.5");
		WebElement AnB=driver.findElement(By.xpath("//button[@id='button-two']"));
		AnB.click();
		

	}

}
