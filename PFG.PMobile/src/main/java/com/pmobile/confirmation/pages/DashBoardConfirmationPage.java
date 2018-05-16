package com.pmobile.confirmation.pages;

import com.pmobile.elements.pages.OrderDetailElementPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DashBoardConfirmationPage extends ScenarioSteps {
	
	OrderDetailElementPage orderDetails;
	
	@Step
	public String getOrderHeaderText(){
		String text = orderDetails.ordertextheader.getText();
		System.out.println("ttest 1 :" + text);
		return text;
	}
	
	@Step
	public String getorderNumber(){
		String orderNumber = orderDetails.orderNumber.getText();
		System.out.println("ttest 2 :" + orderNumber);
		return orderNumber;
	}

}
