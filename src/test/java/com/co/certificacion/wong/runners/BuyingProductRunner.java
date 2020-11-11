package com.co.certificacion.wong.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/wong/buying_product.feature",
snippets = SnippetType.CAMELCASE, glue = "com.co.certificacion.wong.stepsdefinitions")
public class BuyingProductRunner {
}
