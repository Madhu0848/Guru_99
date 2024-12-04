package com.demo.gurutest;

import com.domoguru.repository.TablePage;
import com.guru.baseutility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest extends BaseClass {

    @Test
    public void Tabletest() {
        // Create object of TablePage
        TablePage tp = new TablePage(driver);

        // Click on the table text to navigate to the table
        tp.getTableText().click();

        // Locate the table header
        WebElement table = tp.getTableHeader();

        // Get all rows of the table
        List<WebElement> Rows = tp.getTableRows();

        // Iterate through each row
        for (int i = 0; i < Rows.size(); i++) {
            // Get all cells (columns) for the current row
            List<WebElement> cells = Rows.get(i).findElements(By.tagName("td"));

            // Build a string for the current row
            StringBuilder rowText = new StringBuilder();

            // Iterate through each cell
            for (int j = 0; j < cells.size(); j++) {
                // Append the cell text to the row text
                rowText.append(cells.get(j).getText()).append(" ");
            }

            // Print the current row
            System.out.println("Row " + (i + 1) + " -- Output: " + rowText.toString().trim());
        }
    }
}