package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    ArrayList<String> tabs;
    P03_homePage homePage = new P03_homePage();
    @Given("user opens facebook link")
    public void clickOnFaceBook() throws InterruptedException {
        homePage.faceBookBtn().click();
        Thread.sleep(3000);
    }
    @When("^assert current url \"(.*)\"$")
    public void assertCurrentUrl(String link) throws InterruptedException {
        System.out.println(link);
    tabs =new ArrayList<>(driver.getWindowHandles());
      //  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
      //  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),link);
        Thread.sleep(3000);


    }
    @Given("user opens twitter link")
    public void clickOnTwitter() throws InterruptedException {
        homePage.twitterBtn().click();
        Thread.sleep(3000);
    }
    @Given("user opens rss link")
    public void clickOnRss() throws InterruptedException {
        homePage.rssBtn().click();
        Thread.sleep(3000);
    }
    @Given("user opens youtube link")
    public void clickOnYoutube() throws InterruptedException {
        homePage.youtubeBtn().click();
        Thread.sleep(3000);
    }
    @Then("close current link and return to home page")
    public void closeCurrentTab() throws InterruptedException {
        driver.close();
       tabs =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
     //   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl());
     //   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
}
