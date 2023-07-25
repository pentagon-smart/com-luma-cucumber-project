package com.softwaretestingboard.magento.cucumber.steps;


import com.softwaretestingboard.magento.cucumber.pages.GearPage;
import com.softwaretestingboard.magento.cucumber.pages.ProductPage;
import com.softwaretestingboard.magento.cucumber.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearSteps
{
    @And("I Mouse Hover on Gear Menu and I Click on Bags")
    public void iMouseHoverOnGearMenuAndIClickOnBags() {
        new GearPage().mouseHoverAndClickOnBags();
    }

    @When("I click on Product Name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new ProductPage().clickOnProduct();
    }

    @And("I verify the text Overnight Duffle {string}")
    public void iVerifyTheTextOvernightDuffle(String expectedMsg) {
        Assert.assertEquals("Overnight Duffle text not found",expectedMsg,new ProductPage().getProductText());
    }

    @And("I change Qty")
    public void iChangeQty() {
        new ProductPage().changeQty();
    }

    @And("I click on Add to Cart Button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnaddToCart();
    }

    @And("I verify the text You added Overnight Duffle to your shopping cart {string}")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart(String expectedMsg) {
        Assert.assertEquals("Overnight Duffle text not found in cart",expectedMsg,new ShoppingCartPage().getMessageText());
    }

    @And("I click on shopping cart Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new ShoppingCartPage().clickOnShoppingCart1();
    }

    @And("I verify the product name Overnight duffle {string}")
    public void iVerifyTheProductNameOvernightDuffle(String expectedMsg) {
        //Assert.assertEquals("Overnight Duffle not found",expectedMsg ,new ShoppingCartPage().getProductOvernightDuffel());
    }

    @And("I verify the Qty {string}")
    public void iVerifyTheQty(String expectedMsg) {
        // Assert.assertEquals("Quantity 3 not found",expectedMsg,new ShoppingCartPage().verifyQuantity());
    }

    @And("I verify the product price {string}")
    public void iVerifyTheProductPrice(String expectedMsg) {
        Assert.assertEquals("Product price not found",expectedMsg,new ShoppingCartPage().getProductPrice());
    }

    @And("I change quantity {string}")
    public void iChangeQuantity(String updatePrice) throws InterruptedException {
        new ShoppingCartPage().enterQty(updatePrice);
        Thread.sleep(1000);
    }

    @And("I click on Update Shopping Cart button")
    public void iClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
        Thread.sleep(2000);
    }

    @Then("I verify the updated product price {string}")
    public void iVerifyTheUpdatedProductPrice(String expectedMsg) {
        Assert.assertEquals("Product price not Updated",expectedMsg,new ShoppingCartPage().getProductPrice1());
    }

}