package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginSteps {
	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Menakas/Downloads/chrome/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pwd) throws InterruptedException {
	    driver.findElement(By.id("name")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    Thread.sleep(3000);
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
	    driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

}
