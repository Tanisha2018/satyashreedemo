package StepDefinationFiles;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefination {
	public WebDriver driver;
	
	@Given("^Initialize the Chrome Browser$")
    public void initialize_the_chrome_browser() throws Throwable {
		//System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\web\\Desktop\\selenium java\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
        
    }
	@And("^Navigate to Url$")
    public void navigate_to_url() throws Throwable {
		//System.out.println("hello");
		driver.get("https://login.salesforce.com/");
    }

    @When("^User enters Username and Password and clicks on Login button$")
    public void user_enters_username_and_password_and_clicks_on_login_button() throws Throwable {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("satyashree");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secure123");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    @Then("^user should be able to Login$")
    public void user_should_be_able_to_login() throws Throwable {
    	System.out.println("hello");
    }

    

}
