package com.demo.gurutest;

import com.domoguru.repository.CheckboxPage;
import com.guru.baseutility.BaseClass;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase;
import org.testng.annotations.Test;

import java.awt.*;

public class CheckboxTest extends BaseClass {

    @Test
    public void Checkboxtset() {

        /*Object of CheckboxPage*/
        CheckboxPage checkbox=new CheckboxPage(driver);
        /*
         click on radioButtonTest and select the radiobutton and checkbox
         */
        checkbox.getRadioButtonText().click();
        checkbox.getOptionbutton().click();
        checkbox.getCheckbox1().click();
        System.out.println("radio button is selected :"+checkbox.getOptionbutton().isSelected());
        System.out.println("checkbox is selected :"+checkbox.getCheckbox1().isSelected());

        checkbox.getOptionbutton().click();
        checkbox.getCheckbox1().click();
        System.out.println("radio button is not selected :"+checkbox.getOptionbutton().isSelected());
        System.out.println("checkbox is not selected :"+checkbox.getCheckbox1().isSelected());



    }




}
