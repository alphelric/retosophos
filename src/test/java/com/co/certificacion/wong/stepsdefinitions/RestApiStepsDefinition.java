package com.co.certificacion.wong.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.RestModel;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.util.EnvironmentVariables;

import java.util.List;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class RestApiStepsDefinition {

    private EnvironmentVariables variable;
    private String baseUrl;

    @Given("^(.*) call an api from (.*)$")
    public void miguelCallAnApiFromHttpsGorestCoIn(String actor, String url) {
        baseUrl = variable.optionalProperty("restapi.baseurl").orElse(url);
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(actor).whoCan(CallAnApi.at(baseUrl));
    }

    @When("^He Put in (.*)$")
    public void hePutAnAlbumsApi(String api, List<RestModel> newUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(Post.to(api + newUser.get(0).getId())
                .with(request -> request.queryParam("_format=json", "access-token=z3WxmSBpkuKwu8ax8IEgpM6Jc415HQHIdoDE")
                        .body(newUser)));
        OnStage.theActorInTheSpotlight().should(seeThatResponse("The user should have been successfully added", response -> response.statusCode(200)));
    }

    @Then("^He Get the (.*)$")
    public void heGetTheAlbumsApi(String api, List<RestModel> newUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(Get.resource(api + newUser.get(0).getId())
                .with(request -> request.queryParam("_format=json", "access-token=z3WxmSBpkuKwu8ax8IEgpM6Jc415HQHIdoDE")
                        .body(newUser)));
        OnStage.theActorInTheSpotlight().should(seeThatResponse("The user should have been successfully added", response -> response.statusCode(200)));
    }

}
