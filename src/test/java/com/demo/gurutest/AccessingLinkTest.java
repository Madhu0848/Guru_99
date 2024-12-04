package com.demo.gurutest;

import com.domoguru.repository.AccessingLinkPage;
import com.guru.baseutility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class AccessingLinkTest extends BaseClass {

    @Test
     public void AccessingLinktest() {

        /* create the object of AccessingLinkTest
         navigate to the accessible links
        * Verify the href for attribute and first link
        * */
        AccessingLinkPage AlP = new AccessingLinkPage(driver);

        AlP.getAccessLink().click();

        WebElement hrefLink =AlP.getClickHereLink1();
        String href = hrefLink.getAttribute("href");
        System.out.println("Href attribute: " + href);

        Assert.assertEquals(href, "http://www.google.com/", "Link is not correct");

        // Optional: Verify the Firsttext
        String linkText = hrefLink.getText();
        System.out.println("Link text: " + linkText);
        Assert.assertEquals(linkText, "click here", "Link text is not correct");

        // Verify the href attribute and secondlink
        WebElement hrefLink1 =AlP.getClickHereLink2();
        String href1 = hrefLink1.getAttribute("href");
        System.out.println("Href attribute: " + href1);

        Assert.assertEquals(href1, "http://www.fb.com/", "Link is not correct");


        /*Click the first link and come back and click on second link */
        String  before_NavigatingTitle = driver.getTitle();

        AccessingLinkTest a = new AccessingLinkTest();
        a.navigateToLink(driver,AlP.getClickHereLink2(), "Facebook – log in or sign up");
        driver.navigate().back();
        Assert.assertEquals(before_NavigatingTitle, driver.getTitle(), "Title is not correct");
        a.navigateToLink(driver,AlP.getClickHereLink1(), "Google");
        driver.navigate().back();
        Assert.assertEquals(before_NavigatingTitle, driver.getTitle(), "Title is not correct");



    }
    public  void navigateToLink(WebDriver driver ,WebElement element, String pageTitle) {
        element.click();
        Assert.assertEquals(pageTitle, driver.getTitle(), "Title is not correct");


    }

}
