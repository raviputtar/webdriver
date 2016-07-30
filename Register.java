package test;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {
	
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		String BaseUrl="http://shine.com";
		driver.get(BaseUrl);
		driver.findElement(By.linkText("Register")).click();
		WebElement myEmail= driver.findElement(By.xpath("//form[@id='reg1']//input[@id='id_email']"));
		myEmail.sendKeys("ravi@xyz.com");
		WebElement myPwd= driver.findElement(By.xpath("//form[@id='reg1']//input[@id='Password']"));
		myPwd.sendKeys("12456_abc");
		
		WebElement myCell= driver.findElement(By.xpath("//form[@id='reg1']//input[@id='id_cell_phone']"));
		myCell.sendKeys("7878787878");
		
		
		WebElement mySms= driver.findElement(By.xpath("//form[@id='reg1']//input[@id='id_sms_alert_flag']"));
		mySms.click();
		driver.findElement(By.xpath("//form[@id='reg1']//button")).click();
		   System.exit(0);
	}
	   

}

