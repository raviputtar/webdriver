package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class login {
	
	WebDriver driver= new FirefoxDriver();
	String BaseUrl="http://shine.com";
	
@BeforeTest
public void LoginPage()
{
	driver.get(BaseUrl);
	WebElement login = driver.findElement(By.linkText("Login"));
	login.click();
}

@Test
public void checklogin()
{
	WebElement email = driver.findElement(By.xpath("//input[@id='id_email_login']"));
	WebElement pwd = driver.findElement(By.xpath(".//input[@id='id_password']"));
	email.sendKeys("ravi@xyz.com");
	pwd.sendKeys("12456_abc");
	WebElement button = driver.findElement(By.xpath("//input[@class='cls_candidate_login ui-btn search-btn cls_sendGA submitred']"));
	button.click();
	String actual = driver.getTitle();
	String expected = "Shine.com - Create Profile | Step 2";
	
	Assert.assertEquals(actual, expected, "the title is"+actual);
}

@AfterTest
public void checkLogout()
{
driver.quit();
	
}
}




