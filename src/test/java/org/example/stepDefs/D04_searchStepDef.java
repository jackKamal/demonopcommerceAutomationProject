package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert soft;
    @Given("^user search for \"(.*)\"$")
    public void searchingForNikeProduct(String search)
    {
        homePage.fillngSearch(search);
    }
    @When("user clicks on search button")
    public void clickOnSearchBtn()
    {
        homePage.searchBtn().click();
    }
    @Then("verify that the url will contains Nike")
    public void assertCureentUrl() {
        soft = new SoftAssert();
        String expctedResult = "Nike";
        String actualResult =homePage.currentUrl();
        System.out.println(actualResult);
        //The url will contains nike
        soft.assertTrue(actualResult.contains(expctedResult));
        soft.assertAll();
    }
   @And("verify that search shows relevant results")
   public void searchShowsRelevantResults() {
       soft = new SoftAssert();
       //Count the number of search results using findElements & size()
       System.out.println(homePage.productTitle().size());
   //Create for loop and verify each result contains the search word
       String expctedResult = "Nike";
       String actualResult = null;
       for (WebElement col : homePage.productTitle()) {
           actualResult = col.getText();
           Assert.assertTrue(actualResult.contains(expctedResult));
           System.out.println(actualResult);
       }
       soft.assertAll();
   }
    @And("click on the product in search result")
    public void openTheProductDetails()
    {
        homePage.openTheProductDetails().click();
    }
    @Then("verify that  the sku shown in this page will be AP_MBP_13")
    public void assertTheSku() {
        String expctedResult = "AP_MBP_13";
       // geting the sku shown in this page then make sure it contains the sku that you are using in search
        String actualResult =homePage.returnTheSkuEle();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expctedResult));
    }
}
