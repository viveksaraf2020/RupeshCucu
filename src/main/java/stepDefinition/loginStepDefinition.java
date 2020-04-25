
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class loginStepDefinition {

	WebDriver driver;

	String expectedTitle = "Cogmento CRM";

	@Given("^user is already on Login Page$")
	public void user_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
	}

	@When("^title of login page is Cogmento CRM$")
	public void login_page_title() throws InterruptedException {
		String title = driver.getTitle();
		Thread.sleep(10000);
		System.out.println(title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void enter_login_credentials(String username, String password) 
	{
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(15000);
	}

	@And("^user is on home page$")
	public void user_is_on_home_page() {
		Boolean username = driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();
		if (username.equals(true)) {
			System.out.println("On home page");
		} else {
			System.out.println("Failed to load Home Page");
		}
	}

	@Then("^user click on Contact option from options$")
	public void click_on_Contact_Option() throws InterruptedException {
		driver.findElement(By.xpath("//a//*[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
	}

	@Then("^user click on Deals option from options$")
	public void click_on_Deals_Option() throws InterruptedException {
		driver.findElement(By.xpath("//a//*[contains(text(),'Deals')]")).click();
		Thread.sleep(5000);
	}

	@Then("^user click on New button to create contact$")
	public void click_on_new_button_to_create_new_contact() throws InterruptedException {
		driver.findElement(By.xpath("//a//*[contains(text(),'New')]")).click();
		Thread.sleep(5000);
	}

	@Then("^user click on New button to create deal$")
	public void click_on_new_button_to_create_new_deal() throws InterruptedException {
		driver.findElement(By.xpath("//a//*[contains(text(),'New')]")).click();
		Thread.sleep(5000);
	}

	@Then("^user enters details \"(.*)\" and \"(.*)\"$")
	public void enter_new_contact_details(String firstname, String lastname) throws InterruptedException {
		Boolean present = driver.findElement(By.name("first_name")).isDisplayed();
		Assert.assertTrue(present);
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		driver.findElement(By.name("last_name")).sendKeys(lastname);
		Thread.sleep(5000);
	}

	@Then("^user enters deals details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void enter_new_deals_details(String title, String probability, String commission)
			throws InterruptedException {

		Boolean present = driver.findElement(By.name("title")).isDisplayed();
		Assert.assertTrue(present);
		driver.findElement(By.name("title")).sendKeys(title);
		driver.findElement(By.name("probability")).sendKeys(probability);
		driver.findElement(By.name("commission")).sendKeys(commission);

		Thread.sleep(5000);
	}

	@Then("^user click on Save button$")
	public void click_on_Save_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='ui right secondary pointing menu toolbar-container']//div//button[2]")).click();
		Thread.sleep(3000);
	}

	@Then("^user close browser$")
	public void user_close_browser() {
		driver.quit();
	}

}
