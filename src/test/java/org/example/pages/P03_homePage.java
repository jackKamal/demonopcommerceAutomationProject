package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.example.stepDefs.Hooks.driver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class P03_homePage {
    List<WebElement> cols;
    List<WebElement> title;
    public WebElement clickOnCurrencyDropdownMenue() {
        WebElement changeCurrencyBtn = driver.findElement(By.id("customerCurrency"));
        return changeCurrencyBtn;
    }

    public void currencyMenue() {
        WebElement currencyList = driver.findElement(By.id("customerCurrency"));
        Select selectEuro = new Select(currencyList);
        selectEuro.selectByVisibleText("Euro");
    }

    public List<WebElement> productPrice() {
        WebElement products = driver.findElement(By.className("product-grid"));
        // Get all the prices of the products
        cols = products.findElements(By.className("actual-price"));
        return cols;
    }

    public List<WebElement> productTitle() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement products = driver.findElement(By.className("product-grid"));
        // Get all the title of the products
        title = products.findElements(By.className("product-title"));
        return title;
    }

    public WebElement searchEle() {
        WebElement searchEle = driver.findElement(By.className("search-box-text"));
        return searchEle;
    }

    public void fillngSearch(String search) {
        searchEle().sendKeys(search);
    }

    public WebElement searchBtn() {
        WebElement searchBtn = driver.findElement(By.className("search-box-button"));
        return searchBtn;
    }

    public String currentUrl() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        return driver.getCurrentUrl();
    }

    public WebElement openTheProductDetails() {
        WebElement clickOnTheProduct = driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
        return clickOnTheProduct;
    }

    public String returnTheSkuEle() {
        WebElement skuEle = driver.findElement(By.id("sku-4"));
        return skuEle.getText();
    }

    public WebElement hoverSelectedSubCategory() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement subCategoryEle = driver.findElement(By.xpath("//a[@href='/computers']"));
        return subCategoryEle;

    }

    public WebElement selectItem() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement selectItemEle = driver.findElement(By.xpath("//a[@href='/notebooks']"));
        return selectItemEle;
    }

    public WebElement subCategoryTitle() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement titleEle = driver.findElement(By.xpath("//h1[text()='Notebooks']"));
        return titleEle;
    }

    public WebElement slider1() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement sliderEle1 = driver.findElement(By.xpath("(//a[@class='nivo-imageLink'])[1]"));
        return sliderEle1;
    }

    public WebElement slider2() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement sliderEle2 = driver.findElement(By.xpath("(//a[@class='nivo-imageLink'])[2]"));
        return sliderEle2;
    }

    public WebElement sliderBtn()
    {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement sliderBtnEle = driver.findElement(By.xpath("//a[@class='nivo-control']/following-sibling::a[1]"));
        return sliderBtnEle;
    }

    public WebElement faceBookBtn() throws InterruptedException {

        WebElement faceBookBtnEle = driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        Thread.sleep(3000);
        return faceBookBtnEle;
    }
       public WebElement twitterBtn()
    {

        WebElement twitterBtnEle = driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitterBtnEle;
    }
    public WebElement rssBtn()
    {

        WebElement rssBtnEle = driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
        return rssBtnEle;
    }
    public WebElement youtubeBtn()
    {

        WebElement youtubeBtnEle = driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youtubeBtnEle;
    }
    public WebElement addingToWishListBtn()
    {
        WebElement wishListBtnEle = driver.findElement(By.xpath("(//button[@class='button-2 add-to-wishlist-button'])[3]"));
        return wishListBtnEle;
    }
    public WebElement wishListSuccessMassage()
    {
        WebElement successMassageEle =driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return successMassageEle;
    }

    public void explicitWait( )
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1200, 1));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"bar-notification success\"]")));
    }
    public WebElement wishListIcon( )
    {
        WebElement wishListEle = driver.findElement(By.partialLinkText("Wishlist"));
        return wishListEle;
    }
public WebElement getQtyNumberOfWishList()
{
    WebElement QtyNumberEle = driver.findElement(By.className("qty-input"));
    return QtyNumberEle;
}
}