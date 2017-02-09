package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void empreg(String f, String l, String eId)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).sendKeys(eId);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg Failed");
	}
	
	@DataProvider()
	public Object[][] data()
	{
		Object[][] d=new Object[3][3];
		
		d[0][0]="Sharath";
		d[0][1]="Chandra";
		d[0][2]="7894";
		
		d[1][0]="Asha";
		d[1][1]="Roy";
		d[1][2]="7895";
		
		d[2][0]="Lakshmi";
		d[2][1]="Arcot";
		d[2][2]="7895";
		
		return d;
	}

}
