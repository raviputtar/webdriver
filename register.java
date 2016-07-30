package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class register {
	
	WebDriver driver;
	
	By name = By.xpath("//input[@id='id_name']");
	By dropdown_city = By.xpath("//select[@id='id_candidate_location']");
	By radiobutton_gender = By.xpath("//input[@id='id_gender_0']");
	
	By radiobutton_experience = By.xpath("//input[@id='id_is_fresher_1']");
	By radiobutton_fresher = By.xpath("//input[@id='id_is_fresher_0']");
	By dropdown_exp_yrs=By.xpath(".//*[@id='id_experience_in_years']");
	By dropdown_exp_mnths=By.xpath("//*[@id='id_experience_in_months']");
	By dropdown_salary_lakhs=By.xpath(".//*[@id='id_salary_in_lakh']");
	By dropdown_salary_thousands=By.xpath(".//*[@id='id_salary_in_thousand']");
	By job_title=By.xpath(".//*[@id='id_job_title']");
	By company=By.xpath(".//*[@id='id_company_name']");
	By dropdown_industry=By.xpath(".//*[@id='id_industry']");
	By dropdown_functional=By.xpath(".//*[@id='id_registration_from_two']/div[2]/div[2]/ul[3]/li[6]/div[1]/div/div/div/input");
	By dropdown_duration_start_month=By.xpath(".//*[@id='id_start_month']");
	By dropdown_duration_start_year=By.xpath(".//*[@id='id_start_year']");
	By dropdown_duration_end_month=By.xpath(".//*[@id='id_end_month']");
	By dropdown_duration_end_year=By.xpath(".//*[@id='id_end_year']");
	
	By checkbox_currntly_work_here = By.xpath(".//*[@id='id_registration_from_two']/div[2]/div[2]/ul[3]/li[9]/label[2]");
	
	By dropdown_education_level=By.xpath(".//*[@id='id_education_level']");
	By education_specialization=By.xpath(".//*[@id='id_registration_from_two']/div[3]/div[2]/ul/li[2]/div[1]/div/div/div/div/input");
	By education_specialization_selection=By.xpath("//input[@id='id_education_specialization_96']");
	
	By institute_name=By.xpath(".//*[@id='id_institute_name']");
	
	By institute_year_of_passout=By.xpath(".//*[@id='id_year_of_passout']");
	
	By course_type=By.xpath("//input[@id='id_course_type_0']");
	
	

			
	public register(WebDriver driver)
	{

        this.driver = driver;

    }
	
	public void AddPersonalDetails()
	{
		driver.findElement(name).sendKeys("ravinder");
		Select dropdown = new Select(driver.findElement(dropdown_city));
		dropdown.selectByValue("453");
		driver.findElement(radiobutton_gender).click();
	}
	
	public void AddWorkExperience()
	{
		driver.findElement(radiobutton_experience).click();
		Select dropdown1 = new Select(driver.findElement(dropdown_exp_yrs));
		dropdown1.selectByValue("7");
		Select dropdown2 = new Select(driver.findElement(dropdown_exp_mnths));
		dropdown2.selectByVisibleText("8 Months");
		Select dropdown3 = new Select(driver.findElement(dropdown_salary_lakhs));
		dropdown3.selectByVisibleText("10");
		Select dropdown4 = new Select(driver.findElement(dropdown_salary_thousands));
		dropdown4.selectByVisibleText("50");
		 
		driver.findElement(job_title).sendKeys("QA engineer");
		driver.findElement(company).sendKeys("Remaxys Infotech");
		
		Select dropdown5 = new Select(driver.findElement(dropdown_industry));
		dropdown5.selectByValue("18");;
	
	  	
		
	}
	
	public void AddEducation()
	{
		
	}
	
	
	public void uploadResume()
	{
		
	}
	
	public void submit()
	{
		
	}
	
}
