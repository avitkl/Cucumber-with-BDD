package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	
	//Global hooks
	@Before(order=0)
	public void setUP()
	{
		System.out.println("Launch browser");
		System.out.println("Enter URL for Free CRM application");	   
	}
	
	@After(order=0)
	public void tearDown() {
		System.out.println("Close the browser");
	}
	
	@Before(order=1)
	public void setUP1()
	{
		System.out.println("Launch browser");
		System.out.println("Enter URL for Free CRM application");	   
	}
	
	@After(order=1)
	public void tearDown1() {
		System.out.println("Close the browser");
	}
	
	//local hooks - only for first scenario
	@Before("@First")
	public void beforeFirst()
	{
		System.out.println("before only first scenario");
	}
	
	//local hooks - only for first scenario
	@After("@First")
	public void afterFirst()
	{
		System.out.println("after only first scenario");
	}
	
	//local hooks - only for second scenario
	@Before("@Second")
	public void beforeSecond()
	{
		System.out.println("before only second scenario");
	}
	
	//local hooks - only for second scenario
	@After("@Second")
	public void afterSecond()
	{
		System.out.println("after only second scenario");
	}
	
	//local hooks - only for third scenario
	@Before("@Third")
	public void beforeThird()
	{
		System.out.println("before only third scenario");
	}
	
	//local hooks - only for third scenario
	@After("@Third")
	public void afterThird()
	{
		System.out.println("after only third scenario");
	}
		
	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable 
	{
		System.out.println("This is the 1st step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable 
	{
		System.out.println("This is the 2nd setp");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable
	{
		System.out.println("This is the 3rd step");
	}

}
