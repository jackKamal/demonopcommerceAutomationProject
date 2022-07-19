package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    @Given("user click on currency dropdown list on the top left of home page")
    public void clickOnCurrencyDropdownMenue()
    {
        homePage.clickOnCurrencyDropdownMenue().click();
    }
    @When("user select Euro currency from the dropdown list")
    public void selectingEuroCurrency()
    {
        homePage.currencyMenue();
    }
    @Then("verify that Euro Symbol € is shown on the 4 products displayed in Home page")
    public void verifyThatEuroSymbolIsShowing()
    {
        String expctedResult = "€";
        String actualResult = null;
        for (WebElement col : homePage.productPrice()) {
            actualResult = col.getText();
            Assert.assertTrue(actualResult.contains(expctedResult));
            System.out.println(actualResult);
        }
    }
}
