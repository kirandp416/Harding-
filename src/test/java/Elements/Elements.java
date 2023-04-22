package Elements;

import StepDefs.GlobalSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    WebDriver driver;
    @FindBy(xpath = "/html//a[@id='cookie_action_close_header_reject']")
    public WebElement cookiesReject;
    @FindBy(id = "menu-item-dropdown-215")
    public WebElement careerDropdown;
    @FindBy(xpath = "//ul[@id='menu-primary']/li[4]//a[@title='Landside']")
    public WebElement landsideCareers;
    @FindBy(xpath = "//body//div[@class='page-banner']//a[@href='https://careers.hardingretail.com/Department/Landside']")
    public WebElement landsideCareerVacancies;
    @FindBy(id = "txtSearchField")
    public WebElement landsideSearchTextField;
    @FindBy(id = "btnSearch")
    public WebElement landsideSearchButton;
    @FindBy(linkText = "Logistics Administrator")
    public WebElement vacancyLogistics;
    @FindBy(xpath = "/html/body/main[@class='main']/div[@class='pagination-show']//div[@class='content-text']/a[@href='https://careers.hardingretail.com/Apply/TEF49222ORFNJREUgLSBBcHBsaWNhdGlvbiBmb3JtIChNYXIgJzIzKXwzMHwzOTc1NjV8MXx8RmFsc2V8MTA2NnwyMTk0MDcyfDA%3d?i=zgWlUHYI3D4%3d']")
    public WebElement applyButton;
    @FindBy(xpath = "/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[1]/div/input[@name='ApplicantFirstName']")
    public WebElement firstName;
    @FindBy(xpath = "/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[2]/div/input[@name='ApplicantSurname']")
    public WebElement surname;
    @FindBy(xpath = "/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[3]/div/input[@name='ApplicantEmail']")
    public WebElement email;
    @FindBy(xpath = "/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[4]/div/input[@name='ApplicantMobile']")
    public WebElement mobile;
    @FindBy(xpath = "/html//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[2]/div[@class='col-lg-6']/div/input[@name='ApplicantMunicipality']")
    public WebElement city;
    @FindBy(xpath = "//div[@id='ApplicantDetailsControl']/div[@class='panel-body']/div[1]/div[5]/div/div[@class='application-dropzone dz-clickable']/div[@class='dz-message']")
    public WebElement file;
    @FindBy(id = "btnCreateApplication")
    public WebElement next;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[2]/div/div/select")
    public WebElement gender;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[2]/div/div/select/option[2]")
    public WebElement genderOption;

    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[3]/div/div/select/option[3]")
    public WebElement age;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[6]/div/div[1]/select/option[21]")
    public WebElement ethinicity;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[7]/div/div[1]/select/option[5]")
    public WebElement relegion;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[8]/div/div[1]/select/option[3]")
    public WebElement disablity;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[1]/div[2]/div[9]/div/div[1]/select/option[5]")
    public WebElement sexualOrientation;
    @FindBy(xpath = "//div[@id='application-rendered-form']/div[2]/div[@class='panel-body']/div[1]/div[@class='col-lg-12']/div[1]/textarea[@name='c730862c-6db4-44dd-b477-27c47b4cd8e9']")
    public WebElement basicDetails;
    @FindBy(xpath = "//div[@id='application-rendered-form']/div[2]/div[@class='panel-body']/div[2]/div[@class='col-lg-12']/div[1]/input[@name='c5eff365-f289-4ac0-b5da-8d335b37755e']")
    public WebElement radioBtn1;

    @FindBy(xpath = "//div[@id='application-rendered-form']/div[2]/div[@class='panel-body']/div[2]/div[@class='col-lg-12']/div[2]/input[@name='917887de-cddd-423f-bfaa-d9977b6d3b52']")
    public WebElement radioBtn2;
    @FindBy(xpath = "//div[@id='application-rendered-form']/div[2]/div[@class='panel-body']/div[2]/div[@class='col-lg-12']/div[3]/input[@name='f53a5f5f-f2db-4278-aefe-a31fe919c572']")
    public WebElement radioBtn3;
    @FindBy(xpath = "//div[@id='application-rendered-form']/div[2]/div[@class='panel-body']/div[2]/div[@class='col-lg-12']/div[4]/input[@name='e191c33c-85c9-45c9-b297-2dd12e723eb4']")
    public WebElement radioBtn4;
    @FindBy(xpath = "//div[@id='save-application-column']/button[@type='button']")
    public WebElement saveProgress;
    @FindBy(xpath = "//*[@id=\"application-rendered-form\"]/div[3]/div[1]")
    public WebElement successMessage;


    public Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

