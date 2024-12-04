package com.domoguru.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {

    public WebDriver driver;
    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Radio & Checkbox Demo']")
    private WebElement radioButtonText;

    @FindBy(xpath = "//input[@value='Option 1']")
    private WebElement optionbutton;

    @FindBy(xpath = "//input[@value='checkbox1']")
    private WebElement checkbox1;

    public WebElement getRadioButtonText() {
        return radioButtonText;
    }

    public WebElement getOptionbutton() {
        return optionbutton;
    }

    public WebElement getCheckbox1() {
        return checkbox1;
    }
}
