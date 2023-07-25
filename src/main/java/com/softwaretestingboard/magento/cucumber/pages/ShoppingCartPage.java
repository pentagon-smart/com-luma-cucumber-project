package com.softwaretestingboard.magento.cucumber.pages;


import com.softwaretestingboard.magento.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "(//span[text()='Add to Cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyproductName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyproductSize;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColour;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffel;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[text()='$135.00']")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[text()='$225.00']")
    WebElement verifyPrice1;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyChage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppigCart;



    public String getShoppingCart(){
        String verifyCarttxt = getTextFromElement(verifyCart);
        log.info("Getting add to cart " + verifyCart.toString());
        return verifyCarttxt;
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
        log.info("Click on Shopping cart " + shoppingCartLink.toString());
    }
    public String getShoppingCartText(){
        String shoppingTxt = getTextFromElement(shoppingCart);
        log.info("getting Shopping cart " + shoppingCart.toString());
        return shoppingTxt;
    }
    public String getProductName(){
        String producttxt = getTextFromElement(verifyproductName);
        log.info("Getting Product name " + verifyproductName.toString());
        return producttxt;
    }
    public String getProductSize(){
        String sizeTXt =  getTextFromElement(verifyproductSize);
        log.info("Getting Size " + verifyproductSize.toString());
        return sizeTXt;
    }
    public String getProductColour(){
        String clrtxt = getTextFromElement(verifyProductColour);
        log.info("Getting Clr " + verifyProductColour.toString());
        return clrtxt;
    }
    public String getMessageText(){
        String txt =  getTextFromElement(verifyText);
        log.info("getting txt " + verifyText.toString());
        return txt;
    }
    public void clickOnShoppingCart1(){
        clickOnElement(shoppingCart1);
        log.info("Click on shopping  cart " + shoppingCart1.toString());
    }
    public String getProductOvernightDuffel(){
        String product = getTextFromElement(productOvernightDuffel);
        log.info("Getting product  " + productOvernightDuffel.toString());
        return product;
    }
    public String getProductPrice(){
        String price = getTextFromElement(verifyPrice);
        log.info("getting Price " + verifyPrice.toString());
        return price;
    }
    public void enterQty(String Qty){
        driver.findElement(By.xpath("//input[@class='input-text qty']")).clear();
        sendTextToElement(qtyChage,"5");
        log.info("Changing QTY " + qtyChage.toString());
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppigCart);
        log.info("Updasting Shopping Cart " + updateShoppigCart.toString());
    }
    public String getProductPrice1(){
        String prc = getTextFromElement(verifyPrice1);
        log.info("Getting price" + verifyPrice1.toString());
        return prc;
    }
}
