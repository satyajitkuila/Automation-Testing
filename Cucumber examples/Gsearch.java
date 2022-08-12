package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	WebDriver driver=null;

	@Given("Open the browser")
	public void open_the_browser() {
		System.out.println("Insisde Step: browser is open");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Insisde Step: user in search page");
		driver.get("https://www.google.co.in/");

		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Insisde Step: user enters text in box");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

	}

	@And("User clicks on search\\/hit enter")
	public void user_clicks_on_search_hit_enter() {
		System.out.println("Insisde Step: user clicked on search/hit enter");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Insisde Step: Search reslts are visible");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
		
	}

}		
