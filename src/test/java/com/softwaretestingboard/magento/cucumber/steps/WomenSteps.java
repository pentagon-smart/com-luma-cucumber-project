package com.softwaretestingboard.magento.cucumber.steps;

import com.softwaretestingboard.magento.cucumber.pages.ProductPage;
import com.softwaretestingboard.magento.cucumber.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WomenSteps {


    @When("I Mouse Hover on Women menu tops and Click on Jackets")
    public void iMouseHoverOnWomenMenuTopsAndClickOnJackets()  {
        new WomenPage().clickOnJacket();

    }


    @And("I Select Sort By filter “Product Name”")
    public void iSelectSortByFilterProductName() {
        new ProductPage().selectProduct();

    }

    @Then("I Verify the products name display in alphabetical order")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals("Product is not displayed in alphabetical Order",new ProductPage().getProductList1(), new ProductPage().getProductList2());

    }

    @And("I Select Sort By filter “Price”")
    public void iSelectSortByFilterPrice() {
        new ProductPage().selectPrice();
    }

    @Then("Verify the products price display in Low to High")
    public void verifyTheProductsPriceDisplayInLowToHigh() {
        Assert.assertEquals("Price is not displayed in low to high",new ProductPage().getProductPriceList1(), new ProductPage().getProductPriceList2());

    }


}
