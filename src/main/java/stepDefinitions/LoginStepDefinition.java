package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinition {
	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")	
//	public void user_already_on_login_page()
//	{
//		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.freecrm.com");
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_free_CRM()
//	{
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
//	}
//	
	//We can use any of the below Regular options
	//1. \"(.*)\"
	//2. \"([^\"]*)\"
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password)
//	{
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//
//	}
	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials)
//	{
//		List<List<String>> data=credentials.raw();
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
//
//	}
//
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button()
//	{
//		WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", loginButton);
//
//	}
//	
//	@Then("^user name should be displayed on homepage$")
//	public void user_is_on_home_page()
//	{
//		driver.switchTo().frame("mainpanel");
//		String userName=driver.findElement(By.xpath("//td[@valign='top']//td[@align='left']")).getText();
//		Assert.assertTrue(userName.contains("Avinash TS"));
//		driver.switchTo().defaultContent();
//	}
//	
//	
//	@Then("^close the browser$")
//	public void close_the_browser()
//	{
//		driver.quit();
//	}
	

}
