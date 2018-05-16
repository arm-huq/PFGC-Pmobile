package com.pmobile.steps;

import com.pmobile.pages.LoginActionPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchPageSteps {
	
	@Steps
	LoginActionPage loginAction;
	
	@When("^Click in the search field and conduct a search \"([^\"]*)\"$")
	public void click_in_the_search_field_and_conduct_a_search(String arg1) throws Exception {
		loginAction.setSearchProducts(arg1);
	}

	@Then("^user able to see Search successful$")
	public void user_able_to_see_Search_successful() throws Exception {
	   //TO Do
	
	}


}
