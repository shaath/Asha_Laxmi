package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(3);
//		Sleeper.sleepTightInSeconds(5);
//		s.selectByValue("mercedes");
//		Sleeper.sleepTightInSeconds(5);
//		s.selectByVisibleText("Saab");
		
		List<WebElement> list=s.getOptions();
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++)
		{
			s.selectByIndex(i);
			System.out.println(list.get(i).getText());
		}
	}

}
