package com.pmobile.pages;

import com.pmobile.confirmation.pages.DashBoardConfirmationPage;
import com.pmobile.elements.pages.DashBoardElementPage;
import com.pmobile.elements.pages.LoginElementsPage;
import com.pmobile.elements.pages.OrderDetailElementPage;
import com.pmobile.utilities.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewOrderActionPage  extends ScenarioSteps{
	

	HomePage home ;
	LoginElementsPage loginElemnt;
	DashBoardElementPage dashbrdelemnt;
	OrderDetailElementPage orderDetails;
	
	@Step
	public void openHomePage(){
		home.open();
	}
	
	@Step
	public void setUserName(String userName){
		loginElemnt.userid.sendKeys(userName);
	}
	
	@Step
	public void setPassword(String pwd){
		loginElemnt.password.sendKeys(pwd);
	}
	
	@Step
	public void clickLogin() throws InterruptedException{
		loginElemnt.clicklogin.click();
		Thread.sleep(3000);
	}
	
	@Step
	public void clickonOrderButton() throws InterruptedException{
		dashbrdelemnt.orderButton.click();
	}
	@Step
	public void clickonClearAllButton() throws InterruptedException{
		orderDetails.sortClearAll.click();
	}

	public void clickOnNewbutton() throws InterruptedException {
		Thread.sleep(2000);
		orderDetails.newButton.click();
	}
	
	public void clickOnAddItemAndQuentity() throws InterruptedException {
		Thread.sleep(2000);
		orderDetails.newButton.click();
	}

	public void addNewProduct() throws InterruptedException {
		orderDetails.clearFilter.click();
		orderDetails.sortClearAll.click();
		orderDetails.searchProducts.sendKeys("Chicken");
		orderDetails.newProductSearchbutton.click();
		orderDetails.newProduct.click();
		Thread.sleep(2000);	
		orderDetails.productQuentity.click();
		System.out.println("		Clicked on qty -------------");
		orderDetails.productQuentityClick.click();
		
	}
}