package com.softwaretestingboard.magento.cucumber.pages;

import com.softwaretestingboard.magento.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    private static final Logger log = LogManager.getLogger(MenPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;


    public void mouseHoverAndClickOnPants(){

        mouseHoverThree(menMenu,bottoms,pants);
        log.info("click on pants : " +pants.toString());

    }


}
