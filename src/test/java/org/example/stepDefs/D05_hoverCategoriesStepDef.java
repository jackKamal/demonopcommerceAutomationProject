package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D05_hoverCategoriesStepDef {
    Actions action =new Actions(Hooks.driver);
    P03_homePage homePage = new P03_homePage();
    @Given("user hover one of the main categories at home page")
    public void hoverCategory() throws InterruptedException {
        System.out.println(homePage.hoverSelectedSubCategory().getText());
        action.moveToElement(homePage.hoverSelectedSubCategory()).perform();
        Thread.sleep(1000);

    }
   @When("select one of this sub-category and click on it")
    public void openSubCategory() throws InterruptedException {
       homePage.selectItem().click();
       Thread.sleep(1000);
   }

    @Then("assert that the sub-category url is contains the selected sub-category")
    public void assertCureentUrl() {
        String expctedResult = "https://demo.nopcommerce.com/notebooks";
        String actualResult =homePage.currentUrl();
        System.out.println(actualResult);
        //The url will contains notebooks
        Assert.assertTrue(actualResult.contains(expctedResult));
       String title =homePage.subCategoryTitle().getText().toLowerCase().trim();
        System.out.println(title);
        Assert.assertTrue(actualResult.contains(title));
    }
}
