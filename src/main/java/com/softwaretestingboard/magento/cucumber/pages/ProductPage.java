package com.softwaretestingboard.magento.cucumber.pages;

import com.softwaretestingboard.magento.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement productFilter;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement priceFilter;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Cronus Yoga Pant')]")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement productSize;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement colour;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement product;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyTextProduct;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Add to Cart']")
    WebElement addToCartProduct;

    public void mouseHoverAndClickOnCart(){
        mouseHoverTwo(productName,addToCartProduct);
        log.info("Click on add to cart " + addToCartProduct.toString());
    }

    public void selectProduct(){
        selectByVisibleTextFromDropDown(productFilter,"Product Name");
        log.info("Product filter " +productFilter.toString());
    }

    public void selectPrice(){
        selectByVisibleTextFromDropDown(priceFilter,"Price");
        log.info("Product filter " +priceFilter.toString());
    }


    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }


    public ArrayList<String> getProductList2()


    {
        List<WebElement> afterFilterProductList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1:afterFilterProductList)
        {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return  afterFilterProductList1;
    }


    public ArrayList<String> getProductPriceList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getProductPriceList2()


    {
        List<WebElement> afterFilterProductList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1:afterFilterProductList)
        {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return  afterFilterProductList1;
    }
    public void mouseHoverOnProduct(){
        mouseHoverToElement(productName);
        log.info("Mouse Hover on Product  " +productName.toString());
    }

    public void mouseHoverAndClickOnSize(){
        mouseHoverToElementAndClick(productSize);
        log.info("Mouse Hover on Product Size " +productSize.toString());
    }
    public void mouseHoverAndClickOnColour(){
        mouseHoverToElementAndClick(colour);
        log.info("Mouse Hover on Product Colour " +colour.toString());
    }
    public void clickOnProduct(){
        clickOnElement(product);
        log.info("Click on product " +product.toString());
    }
    public String  getProductText(){
        String productText = getTextFromElement(verifyTextProduct);
        log.info("verify product text" +verifyTextProduct.toString());
        return productText;
    }
    public void changeQty(){
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        sendTextToElement(qty,"3");
        log.info("Change QTY " +qty.toString());
    }
    public void clickOnaddToCart(){
        clickOnElement(addToCart);
        log.info("Click on add to cart " +addToCart.toString());
    }

}

