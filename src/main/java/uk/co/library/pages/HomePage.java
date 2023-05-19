package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement enterJobTitle;

    @CacheLookup
    @FindBy(css = "#location")
    WebElement enterLocation;

    @CacheLookup
    @FindBy(css = "#distance")
    WebElement enterDistanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement clickMoreSearchOptionsLink;

    @CacheLookup
    @FindBy(css = "#salarymin")
    WebElement enterSalaryMin;

    @CacheLookup
    @FindBy(css = "#salarymax")
    WebElement enterSalaryMax;

    @CacheLookup
    @FindBy(css = "#salarytype")
    WebElement enterSalaryTypeDropDown;

    @CacheLookup
    @FindBy(css = "#tempperm")
    WebElement enterJobTypeDropDown;

    @CacheLookup
    @FindBy(css = "#hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    public void setEnterJobTitle(String jobTitle)
    {
        sendTextToElement(enterJobTitle, jobTitle);
        Reporter.log("Select job title :" +jobTitle.toString() +"<br>");
        log.info("Select job title :" +jobTitle.toString() +"<br>");
    }

    public void setEnterLocation(String location)
    {
        sendTextToElement(enterLocation, location);
        Reporter.log("Select Location : " +location.toString() + "<br>");
        log.info("Select Location : " +location.toString() + "<br>");
    }

    public void setEnterDistanceDropDown(String distance)
    {
        selectByVisibleTextFromDropDown(enterDistanceDropDown, distance);
        Reporter.log("Select Distance" + distance.toString() + "<br>");
        log.info("Select Distance" + distance.toString() + "<br>");
    }

    public void clickOnMoreSearchOption()
    {
        clickOnElement(clickMoreSearchOptionsLink);
        Reporter.log("Click on more search option");
        log.info("Click on more search option");
    }

    public void setEnterSalaryMin(String minSalary)
    {
        sendTextToElement(enterSalaryMin, minSalary);
        Reporter.log("Select salary minimum :" +minSalary.toString() +"<br>");
        log.info("Select salary minimum :" +minSalary.toString()+"<br>");
    }

    public void setEnterSalaryMax(String maxSalary)
    {
        sendTextToElement(enterSalaryMax, maxSalary);
        Reporter.log("Select salary maximum : " +maxSalary.toString() +"<br>");
        log.info("Select salary maximum : " +maxSalary.toString() +"<br>");
    }

    public void setEnterSalaryTypeDropDown(String sType)
    {
        selectByVisibleTextFromDropDown(enterSalaryTypeDropDown, sType);
        Reporter.log("Select salary type :"+sType.toString()+"<br>");
        log.info("Select salary type :"+sType.toString()+"<br>");
    }

    public void setEnterJobTypeDropDown(String jobType)
    {
        selectByVisibleTextFromDropDown(enterJobTypeDropDown, jobType);
        Reporter.log("Select job type : " +jobType.toString()+"<br>");
        log.info("Select job type : " +jobType.toString()+"<br>");
    }

    public void clickFindJob()
    {
        clickOnElement(findJobsBtn);
        Reporter.log("Click find job :");
        log.info("Click find job :");
    }

    public void acceptCookies()
    {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
        log.info("Acceptcookies:"+acceptCookies.toString());
    }

}
