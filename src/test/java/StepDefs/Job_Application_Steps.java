package StepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.IOException;
import java.time.Duration;

public class Job_Application_Steps {

    WebDriver driver;

    @Given("that I am looking at the company's homepage")
    public void that_i_am_looking_at_the_company_s_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Harding+\\Harding\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.hardingretail.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html//a[@id='cookie_action_close_header_reject']")).click();
        System.out.println("Opened url");
    }

    @And("searching for an Automated Test Analyst job")
    public void searching_for_an_Automated_Test_Analyst_job() {
        // Write code here that turns the phrase above into concrete actions
        WebElement career = driver.findElement(By.id("menu-item-dropdown-215"));
        Actions hover = new Actions(driver);
        hover.moveToElement(career).build().perform();
        driver.findElement(By.xpath("//ul[@id='menu-primary']/li[4]//a[@title='Landside']")).click();
        System.out.println("Opened Landside Career");

        driver.findElement(By.xpath("//body//div[@class='page-banner']//a[@href='https://careers.hardingretail.com/Department/Landside']")).click();
        driver.findElement(By.id("txtSearchField")).sendKeys("Logistics Administrator");
        driver.findElement(By.id("btnSearch")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.linkText("Logistics Administrator")).click();


    }

    @When("I click on apply button")
    public void i_click_on_apply_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/main[@class='main']/div[@class='pagination-show']//div[@class='content-text']/a[@href='https://careers.hardingretail.com/Apply/TEF49222ORFNJREUgLSBBcHBsaWNhdGlvbiBmb3JtIChNYXIgJzIzKXwzMHwzOTc1NjV8MXx8RmFsc2V8MTA2NnwyMTk0MDcyfDA%3d?i=zgWlUHYI3D4%3d']")).click();
        System.out.println("Clicked on Apply");
    }

    @Then("I should be able to fill in the mandatory fields with the Basic data on the first page")
    public void i_should_be_able_to_fill_in_the_mandatory_fields_with_the_basic_data_on_the_first_page(DataTable dataTable) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[1]/div/input[@name='ApplicantFirstName']")).sendKeys(dataTable.cell(1, 0));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[2]/div/input[@name='ApplicantSurname']")).sendKeys(dataTable.cell(1, 1));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[3]/div/input[@name='ApplicantEmail']")).sendKeys(dataTable.cell(1, 2));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[4]/div/input[@name='ApplicantMobile']")).sendKeys(dataTable.cell(1, 3));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[2]/div[@class='col-lg-6']/div/input[@name='ApplicantMunicipality']")).sendKeys(dataTable.cell(1, 4));
        driver.findElement(By.xpath("//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[5]/div/div[@class='application-dropzone dz-clickable']/div[@class='dz-message']")).click();


        Runtime.getRuntime().exec("C:\\Automation\\Harding+\\Harding\\src\\main\\resources\\PDF upload.exe");

    }

    @And("I should get the <expected result> when submitting the application.")
    public void i_should_get_the_expected_result_when_submitting_the_application() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html//button[@id='btnCreateApplication']")));
        next.click();
        driver.findElement(By.xpath("//div[@id='application-rendered-form']/div[1]/div[@class='panel-body']/div[2]/div[@class='col-lg-12']/div/select[@name='6ff4a8a3-9a51-4ef5-9e8f-32d2da1bf8c4']")).click();
        System.out.println("Opened url");
    }

    @Then("I should be able to fill in the {string} with the Basic data and upload {string} on the first page")
    public void iShouldBeAbleToFillInTheMandatoryFieldsWithTheBasicDataAndUploadFileOnTheFirstPage(String mandatory, String file, DataTable dataTable) throws IOException {

        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[1]/div/input[@name='ApplicantFirstName']")).sendKeys(mandatory);
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[2]/div/input[@name='ApplicantSurname']")).sendKeys(dataTable.cell(1, 0));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[3]/div/input[@name='ApplicantEmail']")).sendKeys(dataTable.cell(1, 1));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[4]/div/input[@name='ApplicantMobile']")).sendKeys(dataTable.cell(1, 2));
        driver.findElement(By.xpath("/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[2]/div[@class='col-lg-6']/div/input[@name='ApplicantMunicipality']")).sendKeys(dataTable.cell(1, 3));
        driver.findElement(By.xpath("//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[5]/div/div[@class='application-dropzone dz-clickable']/div[@class='dz-message']")).click();
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Then("I should get the {string} when submitting the application.")
    public void i_should_get_the_when_submitting_the_application(String string) {
        System.out.println("Opened url");

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCreateApplication")));
        next.click();

    }
}
