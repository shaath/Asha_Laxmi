package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args)
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();

		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links available in google page "+links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			
			if (!lText.equalsIgnoreCase("")) 
			{
				System.out.println(lText);
				count++;
			}
		}
		System.out.println("The visible links count is "+count);

	}

}
