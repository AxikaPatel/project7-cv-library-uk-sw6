package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps
{
    @Given("^I am on home page$")
    public void iAmOnHomePage()
    {
    }







//    @And("^I click on accept cookies tab$")
//    public void iClickOnAcceptCookiesTab()
//    {
//        new HomePage().acceptCookies();
//    }





    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)
    {
        new HomePage().setEnterJobTitle(jobTitle);

    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)
    {
       new HomePage().setEnterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)
    {
        new HomePage().setEnterDistanceDropDown(distance);
    }

    @Then("^I click on more search options link$")
    public void iClickOnMoreSearchOptionsLink()
    {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String salaryMin)
    {
        new HomePage().setEnterSalaryMin(salaryMin);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String salaryMax)
    {
        new HomePage().setEnterSalaryMax(salaryMax);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)
    {
        new HomePage().setEnterSalaryTypeDropDown(salaryType);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)
    {
        new HomePage().setEnterJobTypeDropDown(jobType);
    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton()
    {
        new HomePage().clickFindJob();

    }

    @Then("^I should navigate search job page \"([^\"]*)\"$")
    public void iShouldNavigateSearchJobPage(String text)
    {
        new ResultPage().verifyTheResult(text);
    }



}
