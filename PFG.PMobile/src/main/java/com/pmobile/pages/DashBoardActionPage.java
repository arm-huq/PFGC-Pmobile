package com.pmobile.pages;

import com.pmobile.elements.pages.DashBoardElementPage;
import com.pmobile.utilities.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DashBoardActionPage extends ScenarioSteps {

	DashBoardElementPage deshbrdelemnt;
	HomePage home ;
	
	
	@Step
	void openProductDetailPage() {
		deshbrdelemnt.openAt(home.getDriver().getCurrentUrl());
	}
	
	@Step
	public void clickMessageButton(){
		deshbrdelemnt.messageButtton.click();	
		
	}
	
	@Step
	public void clickOrderButton(){
		//deshbrdelemnt.orderButton.waitUntilEnabled();
		deshbrdelemnt.orderButton.click();
	}
	
	@Step
	public void clickInvoicesButton(){
		deshbrdelemnt.inventoryButton.click();		
	} 

	@Step
	public void clickProductsButton(String userName){
		deshbrdelemnt.productsButton.click();
	}
	
	@Step
	public void clickCusctomersButton(String pwd){
		deshbrdelemnt.customersButton.click();
	}
	
	@Step
	public void clickInventoryButton(){
		deshbrdelemnt.inventoryButton.click();
		
	}

	@Step
	public void clickSettingsButton(String userName){
		deshbrdelemnt.settingButton.click();
	}
}
