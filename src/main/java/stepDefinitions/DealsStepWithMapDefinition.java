package stepDefinitions;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepWithMapDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")	
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)
	{
		for (Map<String, String> data: credentials.asMaps(String.class, String.class))
		{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
		}

	}
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()
	{
		WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);

	}
	
	@Then("^user name should be displayed on homepage$")
	public void user_is_on_home_page()
	{
		driver.switchTo().frame("mainpanel");
		String userName=driver.findElement(By.xpath("//td[@valign='top']//td[@align='left']")).getText();
		Assert.assertTrue(userName.contains("Avinash TS"));
		driver.switchTo().defaultContent();
	}
	
	public void user_moves_to_new_deal_page()
	{
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	
	@Then("^user moves to new deal page and user enters deal details$")
	public void  user_enters_deals_details(DataTable dealData)
	{
		for(Map<String,String> dealValues : dealData.asMaps(String.class, String.class))
		{
		user_moves_to_new_deal_page();
		driver.findElement(By.id("title")).sendKeys(dealValues.get("title"));
		driver.findElement(By.id("amount")).sendKeys(dealValues.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(dealValues.get("probability"));
		driver.findElement(By.id("commission")).sendKeys(dealValues.get("commission"));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		driver.switchTo().defaultContent();
		}
	}
	
	@Then("^close the browser$")
	public void close_the_browser()
	{
		driver.quit();
	}

}
