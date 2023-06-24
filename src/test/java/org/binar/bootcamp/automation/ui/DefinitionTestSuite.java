package org.binar.bootcamp.automation.ui;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/",
        tags = { "@LihatProdukFeature"}
)
public class DefinitionTestSuite {}