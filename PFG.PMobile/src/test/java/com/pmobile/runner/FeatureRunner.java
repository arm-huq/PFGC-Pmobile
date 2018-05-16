package com.pmobile.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/main/resources/Features"},
glue = { "com.pmobile.steps" })
public class FeatureRunner  {}