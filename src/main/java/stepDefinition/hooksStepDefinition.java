package stepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooksStepDefinition {

	@Before
	public void setup() 
	{
		System.out.println("In Before Annotation");
	}
	
	@After
	public void teardown() 
	{
		System.out.println("In After Annotation");
	}
	
	@Before("@First")
	public void setupFirst() 
	{
		System.out.println("Tagged Hook - Before");
	}
	
	@After("@First")
	public void teardownFirst() 
	{
		System.out.println("Tagged Hook - After");
	}
	
	@Given("^user perform step1$")
	public void user_perform_step() 
	{
		System.out.println("In Step 1");
	}

	@When("^user user perform step2$")
	public void user_user_perform_step() 
	{
		System.out.println("In Step 2");

	}

	@Then("^user performs step3$")
	public void user_performs_step() 
	{
		
		System.out.println("In Step 3");
	}

}
