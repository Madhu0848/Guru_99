package com.domoguru.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessingLinkPage {

    public WebDriver driver;
    public AccessingLinkPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Accessing Link']")
    private WebElement accessLink;

    @FindBy(xpath = "//a[text()='click here' and @ href='http://www.google.com']")
    private WebElement clickHereLink1;

    @FindBy(xpath = "//a[text()='click here' and @ href='http://www.fb.com']")
    private WebElement clickHereLink2;

    public WebElement getAccessLink() {
        return accessLink;
    }

    public WebElement getClickHereLink1() {
        return clickHereLink1;
    }

    public WebElement getClickHereLink2() {
        return clickHereLink2;
    }
}
