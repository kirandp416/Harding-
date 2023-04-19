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
import java.io.IOException;

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
        System.out.println("Opened Landside Career");

        driver.findElement(By.xpath("//body//div[@class='page-banner']//a[@href='https://careers.hardingretail.com/Department/Landside']")).click();
        driver.findElement(By.id("txtSearchField")).sendKeys("Automated Test Analyst");
        driver.findElement(By.id("btnSearch")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.linkText("Automated Test Analyst")).click();


    }
    @When("I click on apply button")
    public void i_click_on_apply_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/main[@class='main']/div[@class='pagination-show']//div[@class='content-text']/a[@href='https://careers.hardingretail.com/Apply/TEFe239cORFNJREUgLSBBcHBsaWNhdGlvbiBmb3JtIChNYXIgJzIzKXwzMHwzOTI4MDB8MXx8RmFsc2V8MTA2NnwyMTczMDUzfDA%3d?i=raUHQKvXTeU%3d']")).click();
        System.out.println("Clicked on Apply");
    }
    @Then("I should be able to fill in the mandatory fields with the Basic data on the first page")
    public void i_should_be_able_to_fill_in_the_mandatory_fields_with_the_basic_data_on_the_first_page() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[1]/div/input[@name='ApplicantFirstName']")).sendKeys("Agnes");
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[2]/div/input[@name='ApplicantSurname']")).sendKeys("Nemeth");
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[3]/div/input[@name='ApplicantEmail']")).sendKeys("Agnes.Nemeth@hardingretail.com");
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[4]/div/input[@name='ApplicantMobile']")).sendKeys("07777 111111");
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[2]/div[@class='col-lg-6']/div/input[@name='ApplicantMunicipality']")).sendKeys("Bristol");
        driver.findElement(By.xpath("//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[5]/div/div[@class='application-dropzone dz-clickable']/div[@class='dz-message']")).click();
        Runtime.getRuntime().exec("C:\\Automation\\Harding+\\Harding\\src\\main\\resources\\fileupload.exe");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("btnCreateApplication")).click();
//        driver.quit();


        System.out.println("Opened url");
    }
    @And("I should get the <expected result> when submitting the application.")
    public void i_should_get_the_expected_result_when_submitting_the_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opened url");
    }
}
