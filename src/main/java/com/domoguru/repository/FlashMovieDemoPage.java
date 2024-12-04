package com.domoguru.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlashMovieDemoPage {

    public WebDriver driver;
   public  FlashMovieDemoPage(WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(), 'Selenium') and @class='dropdown-toggle']")
    private WebElement seleniumDropdown;

    @FindBy(xpath = "//a[contains(text(), 'Flash Movie Demo')]")
    private WebElement flashMovieDemoText;

    @FindBy(xpath = "//font[text()='DEMO Flash Movie']")
    private WebElement demoFlashMovieTitle;

    public WebElement getSeleniumDropdown() {
        return seleniumDropdown;
    }

    public WebElement getFlashMovieDemoText() {
        return flashMovieDemoText;
    }

    public WebElement getDemoFlashMovieTitle() {
        return demoFlashMovieTitle;
    }
}
