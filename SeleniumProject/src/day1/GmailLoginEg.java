package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args)
	{
		//Launching the browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launching the application
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Identifying the email textbox 
		
		WebElement email=driver.findElement(By.id("Email"));
		
		//Entering the text into the text box
		
		email.sendKeys("sharathqedge449");
		
		//Clearing the text in text box
		
//		email.clear();
		//Clicking on next button
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		//Entering text into password text box
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		//clicking on sign in button
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
