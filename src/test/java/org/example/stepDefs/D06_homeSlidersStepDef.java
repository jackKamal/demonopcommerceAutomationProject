package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("click on first slider of the nokia-lumia-1020")
    public void clickOnFirstSlider()
    {
        homePage.slider1().click();
    }
    @Then("assert the url of first slider")
    public void assertUrlSlider1()
    {
        String expctedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult =homePage.currentUrl();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expctedResult));
    }

    @Given("navigate to second slider")
    public void clickOnSecondSliderBtn()
    {
        homePage.sliderBtn().click();
    }

    @When("click on second slider of the iphone-6")
    public void clickOnSecondSlider()
    {
        homePage.slider2().click();
    }
    @Then("assert the url of second slider")
    public void assertUrlSlider2()
    {
        String expctedResult = "https://demo.nopcommerce.com/iphone-6";
        String actualResult =homePage.currentUrl();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expctedResult));
    }

}
