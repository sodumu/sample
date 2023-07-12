package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);	

		WebElement NR=driver.findElement(By.partialLinkText("New"));
		NR.click();
		Thread.sleep(3000);	
		driver.navigate().back();
		
		WebElement E=driver.findElement(By.linkText("Electronics"));
		E.click();
		Thread.sleep(3000);	
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.close();
	}

}
