package com.softwaretestingboard.magento.cucumber.pages;

import com.softwaretestingboard.magento.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-25']")
    WebElement bags;


    public void mouseHoverAndClickOnBags(){
       mouseHoverTwo(gearMenu,bags);
       log.info("click on bags : " +bags.toString());
    }



}
