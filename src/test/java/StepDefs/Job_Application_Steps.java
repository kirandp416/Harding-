package StepDefs;

import Elements.Elements;
import Operations.OperationsClass;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static junit.framework.TestCase.fail;

public class Job_Application_Steps {

    WebDriver driver;
    OperationsClass operations;
    GlobalSteps globalSteps;


    public Job_Application_Steps(OperationsClass operations, GlobalSteps globalSteps) {
        this.operations = operations;
        this.driver = globalSteps.getDriver();
    }

    //Launch URL and reject Cookies
    @Given("that I am looking at the company's homepage")
    public void that_i_am_looking_at_the_company_s_homepage() {



        driver.get("https://www.hardingretail.com/");

        driver.manage().window().maximize();

        operations.clickRejectCookies();
    }

    @And("searching for an Automated Test Analyst job")
    public void searching_for_an_Automated_Test_Analyst_job() {
        WebElement career = driver.findElement(By.id("menu-item-dropdown-215"));
        Actions hover = new Actions(driver);
        hover.moveToElement(career).build().perform();
        operations.clickLandsideCareer();

        System.out.println("Opened Landside Career");
        operations.clickLandsideCareerVacancies();
        operations.searchJobs("Logistics Administrator");
        operations.searchForJobs();
        sleep(5000);
        operations.findTheJob();

        sleep(4000);

    }


    @When("I click on apply button")
    public void i_click_on_apply_button() {
        operations.applyForTheJob();
        System.out.println("Clicked on Apply");
    }

    @Then("I should be able to fill in the {string} with the Basic data and upload {string} on the first page")
    public void iShouldBeAbleToFillInTheMandatoryFieldsWithTheBasicDataAndUploadFileOnTheFirstPage(String mandatory, String file, DataTable dataTable) throws IOException {
        operations.firstName(mandatory);
        operations.surname(dataTable.cell(1, 0));
        operations.email(dataTable.cell(1, 1));
        operations.number(dataTable.cell(1, 2));
        operations.city(dataTable.cell(1, 3));
        operations.file();

        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sleep(10000);


    }

    @Then("I should get the {string} when submitting the application.")
    public void i_should_get_the_when_submitting_the_application(String error) {
        System.out.println("Opened url");

        sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(8));
        WebElement next = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btnCreateApplication"))));
        next.click();
        sleep(3000);
        if (driver.findElement(By.xpath("//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[2]/div/div/select")).isDisplayed()) {
            operations.genderDropdown();
            operations.ageOption();
            operations.ethnicityOption();
            operations.religionOption();
            operations.disabilityOption();
            operations.sexualOrientationOption();
            operations.basicDetails("Poorna Kiran Dasari : kirandp416@gmail.com");
            operations.radioBtns();
            operations.saveProgress();

            driver.quit();
        } else if (driver.findElement(By.className("error")).isDisplayed()) {
            if (!driver.getPageSource().contains(error)) {
                fail("Error message doesn't match");
                driver.quit();
            } else {
                driver.quit();
            }
        }

    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
