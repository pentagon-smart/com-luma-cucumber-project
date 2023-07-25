package com.softwaretestingboard.magento.cucumber.steps;

import com.softwaretestingboard.magento.cucumber.pages.MenPage;
import com.softwaretestingboard.magento.cucumber.pages.ProductPage;
import com.softwaretestingboard.magento.cucumber.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenSteps {

    @When("I Mouse Hover on Men menu Bottoms and Click on Pants")
    public void iMouseHoverOnMenMenuBottomsAndClickOnPants() {
        new MenPage().mouseHoverAndClickOnPants();
    }
    @And("I am Mouse Hover on product name Cronus Yoga Pant")
    public void iAmMouseHoverOnProductNameCronusYogaPant() {
        new ProductPage().mouseHoverOnProduct();
    }

    @And("I click on size {int}")
    public void iClickOnSize(int num) {
        new ProductPage().mouseHoverAndClickOnSize();
    }

    @And("I click on colour Black")
    public void iClickOnColourBlack() {
        new ProductPage().mouseHoverAndClickOnColour();

    }
    @And("I am Mouse Hover on product")
    public void iAmMouseHoverOnProduct() {
        new ProductPage().mouseHoverOnProduct();
    }

    @And("I click on Add To Cart Button.")
    public void iClickOnAddToCartButton() {
        new ProductPage().mouseHoverAndClickOnCart();
    }


    @And("I Verify the product message {string}")
    public void iVerifyTheProductMessageYouAddedCronusYogaPantToYourShoppingCart(String expectedmsg) {
        Assert.assertEquals("Added message not found",expectedmsg,new ShoppingCartPage().getShoppingCart());
    }

    @And("I Click on shopping cart Link into msg")
    public void iClickOnShoppingCartLinkIntoMsg() {
        new ShoppingCartPage().clickOnShoppingCart();
    }

    @And("I Verify the shopping cart text {string}")
    public void iVerifyTheShoppingCartTextShoppingCart(String text) {
//        Assert.assertEquals("Shopping Cart is not displayed",text,new ShoppingCartPage().getShoppingCartText());
    }

    @And("I Verify the products name {string}")
    public void iVerifyTheProductsNameCronusYogaPant(String text) {
        Assert.assertEquals("Product name is not displayed",text,new ShoppingCartPage().getProductName());
    }

    @And("I Verify the product size {string}")
    public void iVerifyTheProductSize(String size) {
        Assert.assertEquals("size is not displayed",size,new ShoppingCartPage().getProductSize());
    }

    @Then("I Verify the product colour {string}")
    public void iVerifyTheProductColourBlack(String text) {
        Assert.assertEquals("Colour is not displayed",text,new ShoppingCartPage().getProductColour());
    }



}
