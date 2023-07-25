package com.softwaretestingboard.magento.cucumber.pages;

import com.softwaretestingboard.magento.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Utility {

    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Jackets']")
    WebElement jacket;

    public void clickOnJacket(){
        mouseHoverThree(womenMenu,tops,jacket);
        log.info("click on jacket : " +jacket.toString());

    }

}
