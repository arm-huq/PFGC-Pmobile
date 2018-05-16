package com.pmobile.elements.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductDetailElementPage extends PageObject{

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[2]/div[2]/div[2]/div/form/div[1]/div/input")	
	public WebElementFacade searchForOrder;
}
