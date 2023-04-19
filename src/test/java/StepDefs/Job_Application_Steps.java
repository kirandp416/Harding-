package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Job_Application_Steps {

    WebDriver driver;
    @Given("that I am looking at the company's homepage")
    public void that_i_am_looking_at_the_company_s_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Harding+\\Harding\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.hardingretail.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html//a[@id='cookie_action_close_header_reject']")).click();
        System.out.println("Opened url");
    }
    @And("searching for an Automated Test Analyst job")
    public void searching_for_an_Automated_Test_Analyst_job() {
        // Write code here that turns the phrase above into concrete actions
        WebElement career= driver.findElement(By.id("menu-item-dropdown-215"));
        Actions hover= new Actions(driver);
        hover.moveToElement(career).build().perform();
        driver.findElement(By.xpath("//ul[@id='menu-primary']/li[4]//a[@title='Landside']")).click();
        System.out.println(career);
        driver.quit();
    }
    @When("I click on apply button")
    public void i_click_on_apply_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opened url");
    }
    @Then("I should be able to fill in the mandatory fields with the Basic data on the first page")
    public void i_should_be_able_to_fill_in_the_mandatory_fields_with_the_basic_data_on_the_first_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opened url");
    }
    @And("I should get the <expected result> when submitting the application.")
    public void i_should_get_the_expected_result_when_submitting_the_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opened url");
    }
}
