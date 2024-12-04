package com.domoguru.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TablePage {

    public WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Table Demo']")
    private WebElement tableText;

    @FindBy(tagName = "table")
    private WebElement tableHeader;

    @FindBy(tagName = "tr")
    private List<WebElement> tableRows;

    @FindBy(tagName = "td")
    private List<WebElement> tableCells;

    public WebElement getTableText() {
        return tableText;
    }

    public WebElement getTableHeader() {
        return tableHeader;
    }

    public List<WebElement> getTableRows() {
        return tableRows;
    }

    public List<WebElement> getTableCells() {
        return tableCells;
    }
}
