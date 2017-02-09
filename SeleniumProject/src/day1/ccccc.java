package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class ccccc 
{
	public static void main(String[] args) {

		//Launch the Browser
				WebDriver driver=new FirefoxDriver();
				driver.get("https://accounts.google.com/SignUp?hl=en");
				driver.manage().window().maximize();
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
				
				Sleeper.sleepTightInSeconds(5);
				driver.findElement(By.name("FirstName")).sendKeys("Saurmi");
				driver.findElement(By.name("LastName")).sendKeys("Sharma");
				driver.findElement(By.id("GmailAddress")).sendKeys("saurmisharma123@gmail.com");
				driver.findElement(By.id("Passwd")).sendKeys("Password@123");
				driver.findElement(By.id("PasswdAgain")).sendKeys("Password@123");
				Sleeper.sleepTightInSeconds(5);
				driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).sendKeys("June");;
//				Sleeper.sleepTightInSeconds(5);
//				List<WebElement> list=driver.findElements(By.xpath(".//*[@id='BirthMonth']/div[2]/div/div"));
				
				
				
//				driver.findElement(By.id("BirthMonth"));
				
				
//				List<WebElement> list=birth.findElements(By.tagName("div"));
//				System.out.println(list.size());
//				driver.findElement(By.xpath(".//*[@id=':6']")).click();
//				for (int i = 0; i < list.size(); i++) 
//				{
//					String text=list.get(i).getText();
//					System.out.println(text);
//					if (text.equalsIgnoreCase("june"))
//					{
//						list.get(i).click();
////						driver.findElement(By.xpath(""))
//						
//						break;
//					}
//				}
				
//			   Select dropdown = new Select(birth);
//		       dropdown.selectByValue("June");
		       
				
				
//		       driver.findElement(By.cssSelector("#BirthDay")).sendKeys("26");
//				driver.findElement(By.id("BirthYear")).sendKeys("1991");
//				Sleeper.sleepTightInSeconds(5);
//				Select dropdown2 = new Select(driver.findElement(By.xpath(".//*[@id='Gender']/div[1]/div")));
//				dropdown2.selectByVisibleText("Female");
//			   driver.findElement(By.className("i18n_phone_number_input-inner_input")).sendKeys("8879209011");
//				driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("saurmi26@gmail.com");
//				driver.findElement(By.id("submitbutton")).click();

				}



}
