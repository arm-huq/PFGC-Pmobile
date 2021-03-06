package com.pmobile.pages;


import com.pmobile.confirmation.pages.DashBoardConfirmationPage;
import com.pmobile.elements.pages.DashBoardElementPage;
import com.pmobile.elements.pages.LoginElementsPage;
import com.pmobile.elements.pages.OrderDetailElementPage;
import com.pmobile.elements.pages.ProductDetailElementPage;
import com.pmobile.utilities.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginActionPage  extends ScenarioSteps{
	
	HomePage home ;
	LoginElementsPage loginElemnt;
	DashBoardElementPage dashbrdelemnt;	
	OrderDetailElementPage orderDetails;
	DashBoardConfirmationPage dashConfirm;
	ProductDetailElementPage productDetail;
	
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
		Thread.sleep(5000);		
	}
	
	@Step
	public void clickOnOrder() throws InterruptedException{
	dashbrdelemnt.orderButton.click();
	String text = orderDetails.ordertextheader.getText();
	System.out.println("  HeaderText :" + text);
	Thread.sleep(3000);
	//String orderNumber = orderDetails.orderNumber.getText();
	//System.out.println("  Order Number : " + orderNumber);
	//dashbrdelemnt.homeButton.click();
	Thread.sleep(5000);
	}
	
	@Step
	public void setProdName(String prodName){		
		productDetail.searchForOrder.sendKeys(prodName);		
	}
	
	@Step
	public void clickOnClearFilter(){		
		orderDetails.clearFilter.click();	
	}
	
	@Step
	public void clickOnNewOrder(){		
		orderDetails.addNewOrder.click();	
	}

	@Step
	public void setSearchProducts(String prod){		
		orderDetails.searchProducts.sendKeys(prod);
	}
	
	public void assertMessagesLandingPage() throws InterruptedException{
		String iconText = dashbrdelemnt.messageButtton.getText();
		dashbrdelemnt.messageButtton.click();
		String text = orderDetails.messageTextheader.getText();
		if(iconText.equalsIgnoreCase(text)){
			System.out.println(" Messages dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" Messages dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		dashbrdelemnt.homeButton.click();
	}
	
	public void assertOrderLandingPage() throws InterruptedException{
		Thread.sleep(3000);
		dashbrdelemnt.orderButton.click();
		String text = orderDetails.ordertextheader.getText();
		if(text.equalsIgnoreCase("Orders")){
			System.out.println(" order dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" order dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		dashbrdelemnt.homeButton.click();
	}
	
	public void assertInvoicesLandingPage() throws InterruptedException{
		Thread.sleep(3000);
		String iconText = dashbrdelemnt.invoicestextButton.getText();
		dashbrdelemnt.invoicesButton.click();
		String text = orderDetails.invoicesTtextheader.getText();
		if(iconText.equalsIgnoreCase(text)){
			System.out.println(" Invoices dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" Invoices dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		dashbrdelemnt.homeButton.click();
	}
	
	public void assertProductsLandingPage() throws InterruptedException{
		Thread.sleep(3000);
		String iconText = dashbrdelemnt.productsTextButton.getText();
		dashbrdelemnt.productsButton.click();
		String text = orderDetails.ProductsTextheader.getText();
		if(iconText.equalsIgnoreCase(text)){
			System.out.println(" Products dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" Products dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		dashbrdelemnt.homeButton.click();
	}
	
	public void assertCusctomerLandingPage() throws InterruptedException{
		Thread.sleep(3000);
		String iconText = dashbrdelemnt.customersTextButton.getText();
		dashbrdelemnt.customersButton.click();
		String text = orderDetails.customersTextheader.getText();
		if(iconText.equalsIgnoreCase(text)){
			System.out.println(" Customer dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" Customer dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		dashbrdelemnt.homeButton.click();
	}
	
	public void assertInventoryLandingPage() throws InterruptedException{
		Thread.sleep(3000);
		String iconText = dashbrdelemnt.inventoryTextButton.getText();
		dashbrdelemnt.inventoryButton.click();
		String text = orderDetails.inventoriesTextheader.getText();
		if(iconText.equalsIgnoreCase(text)){
			System.out.println(" Inventory dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" Inventory dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		dashbrdelemnt.homeButton.click();
	}
	
	public void assertSettingsLandingPage() throws InterruptedException{
		Thread.sleep(3000);
		String iconText = dashbrdelemnt.settingTextButton.getText();
		dashbrdelemnt.settingButton.click();
		String text = orderDetails.settingsTextheader.getText();
		if(iconText.equalsIgnoreCase(text)){
			System.out.println(" Settings  dashboard " + "Passed" + " -- ");
		}else{
			System.out.println(" settings dashboard " + "Failed " + " -- ");
		}
		Thread.sleep(2000);
		orderDetails.logOUt.click();
	}
}
