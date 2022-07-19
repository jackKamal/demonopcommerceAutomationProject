package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P02_LoginPage {

    public WebElement gotoLogin()
    {
        WebElement gotoLoginBtn = driver.findElement(By.className("ico-login"));
        return gotoLoginBtn;
    }
    public WebElement email() {
        By mail = By.id("Email");
        WebElement mailEle = driver.findElement(mail);
        return mailEle;
    }
    public WebElement password() {
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle;
    }
    public WebElement loginBtn() {
        By loginBtn = By.className("button-1 login-button");
        WebElement loginBtnEle = driver.findElement(loginBtn);
        return loginBtnEle;
    }
    public void loginCreditional(String email,String password)
    {
        email().sendKeys(email);
        password().sendKeys(password);
    }
    public WebElement pressLoginBtn()
    {
        WebElement pressLoginBtnEle=driver.findElement(By.className("login-button"));
        return pressLoginBtnEle;
    }
        public String CurrentUrl(){
           return driver.getCurrentUrl();
        }
    public WebElement myAccountTab()
    {
        WebElement myAccountEle =driver.findElement(By.className("ico-account"));
        return myAccountEle;
    }
    public WebElement unSuccessMassage()
    {
        WebElement unSuccessMassageEle =driver.findElement(By.className("validation-summary-errors"));
        return unSuccessMassageEle;
    }
}
