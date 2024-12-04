package com.demo.gurutest;

import com.domoguru.repository.FlashMovieDemoPage;
import com.guru.baseutility.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * FlashMovieDemo is a test class that validates the title of the Flash Movie Demo page.
 */
public class FlashMovieDemo extends BaseClass {

    /**
     * Test method to validate the Flash Movie Demo functionality.
     */
    @Test
    public void flashmovieTest() {
        // Instantiate the Page Object Model class for Flash Movie Demo
        FlashMovieDemoPage fp = new FlashMovieDemoPage(driver);

        // Click on the Selenium Dropdown menu
       // fp.getSeleniumDropdown().click();

        // Click on the Flash Movie Demo option from the dropdown
        fp.getFlashMovieDemoText().click();

        // Get the title of the Flash Movie Demo page
        WebElement Title = fp.getDemoFlashMovieTitle();

        // Print the title text to the console
        System.out.println(Title.getText());

        // Validate the title text with an expected value
        Assert.assertEquals(Title.getText(), "DEMO Flash Movie");

        // Print a success message to the console if the assertion passes

        Assert.assertEquals(Title.getText(), "DEMO Flash Movie", "Page title does not match the expected value.");
        System.out.println("Validation successful: Page title is 'DEMO Flash Movie'. Test case passed.");

    }
}
