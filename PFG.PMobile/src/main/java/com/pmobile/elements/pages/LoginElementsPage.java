package com.pmobile.elements.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://mobiletest.performancefoodservice.com/power-mobile-client/")
public class LoginElementsPage extends PageObject{
	
	@FindBy(how = How.XPATH, using = "//*[@id='splash']/div[2]/div/form/div[2]/input")
	public WebElementFacade userid;

	@FindBy(how = How.XPATH, using = "//*[@id='splash']/div[2]/div/form/div[4]/input")
	public WebElementFacade password;

	@FindBy(how = How.XPATH, using = "//*[@id='splash']/div[2]/div/form/div[5]/input")
	public WebElementFacade clicklogin;

}
