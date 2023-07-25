package com.softwaretestingboard.magento.cucumber;


import com.softwaretestingboard.magento.cucumber.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.cucumber.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
