package com.pmobile.elements.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://mobiletest.performancefoodservice.com/power-mobile-client/")
public class DashBoardElementPage extends PageObject {
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[1]")
	public WebElementFacade messageButtton;

	@FindBy(how = How.CSS, using = "span[class='icon-shopping-cart']")
	public WebElementFacade orderButton;
	
	@FindBy(how = How.CSS, using = "/html/body/div[2]/div/div[2]/div/a[2]/label")							
	public WebElementFacade ordertextButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[3]/span")
	public WebElementFacade invoicesButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[3]")
	public WebElementFacade invoicestextButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[4]/span")
	public WebElementFacade productsButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[4]")
	public WebElementFacade productsTextButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[5]/span")
	public WebElementFacade customersButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[5]")
	public WebElementFacade customersTextButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[6]/span")
	public WebElementFacade inventoryButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[6]")
	public WebElementFacade inventoryTextButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[7]/span")
	public WebElementFacade settingButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div/a[7]")
	public WebElementFacade settingTextButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tabbar_wrapper']/div/a[1]/span")
	public WebElementFacade homeButton;
	
	
}
