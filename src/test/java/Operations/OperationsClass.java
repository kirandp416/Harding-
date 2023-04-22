package Operations;

import Elements.Elements;
import StepDefs.GlobalSteps;
import org.openqa.selenium.WebDriver;

public class OperationsClass {

    private WebDriver driver;
    Elements elements;

    public OperationsClass(GlobalSteps globalSteps){
        this.driver=globalSteps.getDriver();
        elements= new Elements(driver);
    }
    public void clickRejectCookies(){
        elements.cookiesReject.click();
    }
    public void clickLandsideCareer(){
        elements.landsideCareers.click();
    }
    public void clickLandsideCareerVacancies(){
        elements.landsideCareerVacancies.click();
    }
    public void searchJobs(String job){
        elements.landsideSearchTextField.sendKeys(job);
    }
    public void searchForJobs(){
        elements.landsideSearchButton.click();
    }
    public void findTheJob(){
        elements.vacancyLogistics.click();
    }
    public void applyForTheJob(){
        elements.applyButton.click();
    }
    public void firstName(String firstName){
        elements.firstName.sendKeys(firstName);
    }
    public void surname(String surname){
        elements.surname.sendKeys(surname);
    }
    public void email(String email){
        elements.email.sendKeys(email);
    }
    public void number(String number){
        elements.mobile.sendKeys(number);
    }
    public void city(String city){
        elements.city.sendKeys(city);
    }
    public void file(){
        elements.file.click();
    }
    public void nextBtn(){
        elements.next.click();
    }
    public void genderDropdown(){
        elements.genderOption.click();
    }
    public void ageOption(){
        elements.age.click();
    }
    public void ethnicityOption(){
        elements.ethinicity.click();
    }
    public void religionOption(){
        elements.relegion.click();
    }
    public void disabilityOption(){
        elements.disablity.click();
    }
    public void sexualOrientationOption(){
        elements.sexualOrientation.click();
    }
    public void basicDetails(String basicDetails){
        elements.basicDetails.sendKeys(basicDetails);
    }
    public void radioBtns(){
        elements.radioBtn1.click();
        elements.radioBtn2.click();
        elements.radioBtn3.click();
        elements.radioBtn4.click();
    }
    public void saveProgress(){
        elements.saveProgress.click();
    }
    public boolean successMessage(){return elements.successMessage.isDisplayed();}
}

