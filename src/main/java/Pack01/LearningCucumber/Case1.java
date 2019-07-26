package Pack01.LearningCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case1 {
	WebDriver driver;
	@Given("The browser is configured and TestMe URL is opened")
	public void the_browser_is_configured_and_TestMe_URL_is_opened() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Thread.sleep(5000);
//	    throw new cucumber.api.PendingException();
	}

	@Then("SignUp link is clicked")
	public void signup_link_is_clicked() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		
	}
	
	@Then("{string} is given")
	public void is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
	}

	@Then("Required details are given")
	public void required_details_are_given() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mlp");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bji");
			
	}
	
	@Then("{string} is provided")
	public void is_provided(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(string);
	}
	
	@Then("Remaining details are given")
	public void remaining_details_are_given() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc123@ajkj.com");
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("6756886998");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("01/05/1997");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("afsbusdbfudysbgf123");
		driver.findElement(By.xpath("//select[@name='securityQuestion']")).sendKeys("What is your favourite color?");
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("afsbusdbfudysbgf");
	}

	@When("submit button is clicked")
	public void submit_button_is_clicked() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	@Then("Login {string} is given")
	public void login_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		WebElement user = driver.findElement(By.xpath("//*[@id='userName']"));
		user.sendKeys(string);
	}
	
	@Then("Login {string} is provided")
	public void login_is_provided(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys(string);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
