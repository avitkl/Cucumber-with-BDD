package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;


public class DealsStepDefinition {
	
//     WebDriver driver;
//	
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page()
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//		driver.switchTo().defaultContent();
//	}
//	
//	@Then("^user enters deal details$")
//	public void  user_enters_contact_details(DataTable dealData)
//	{
//		List<List<String>> dealValues = dealData.raw();
//		driver.switchTo().frame("mainpanel");
//		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		driver.switchTo().defaultContent();
//	}

}
