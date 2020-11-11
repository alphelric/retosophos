package com.co.certificacion.wong.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static ui.ProductPage.CART_ITEM;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Article;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.OpenWong;
import tasks.Search;
import tasks.SelectProduct;

import java.util.List;

public class BuyingProductStepsDefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("Miguel");
    }
    @Given("^He goes to Wong home page$")
    public void heGoesToWongHomePage() {
        theActorInTheSpotlight().attemptsTo(OpenWong.url());
    }

    @When("^He search an item on page$")
    public void heSearchAnItemOnPage(List<Article> item) {
        theActorInTheSpotlight().attemptsTo(Search.element(item));
    }

    @When("^He select the item$")
    public void heSelectTheItem() {
        theActorInTheSpotlight().attemptsTo(SelectProduct.addCart());
    }

    @Then("^He see the product in cart shop$")
    public void heSeeTheProductInCartShop() {
        theActorInTheSpotlight().should(seeThat(the(CART_ITEM), isCurrentlyVisible()));
    }
}
