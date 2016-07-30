package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class run {
	
	WebDriver driver = new FirefoxDriver();
	pom.login mylogin;
	pom.register myregister;


@BeforeTest
public void launchlogin()
{
	
	mylogin = new login(driver);
	mylogin.getpage();
	mylogin.loginToShine("ravi@xyz.com", "12456_abc");
}

@Test
public void DoRegistration() 
{
	myregister = new register(driver);
	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	myregister.AddPersonalDetails();
	myregister.AddWorkExperience();
}

@AfterTest
public void quit ()
{
	driver.quit();
}
}




