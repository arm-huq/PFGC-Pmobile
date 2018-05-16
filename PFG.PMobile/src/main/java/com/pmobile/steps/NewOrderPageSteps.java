package com.pmobile.steps;

import com.pmobile.confirmation.pages.OrderConfirmationPages;
import com.pmobile.pages.NewOrderActionPage;
import com.pmobile.pages.OrderDetailActionPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class NewOrderPageSteps{
	
	@Steps
	NewOrderActionPage newOrderAct;
	OrderConfirmationPages orderConDetail;
	
	@When("^click on the new button$")
	public void click_on_the_new_button() throws Exception {
		newOrderAct.clickOnNewbutton();
	}

	@Then("^order entry screen successfully populated on screen$")
	public void order_entry_screen_successfully_populated_on_screen() throws Exception {
	
	}
	@When("^add product to new order$")
	public void add_product_to_new_order() throws Exception {
		newOrderAct.addNewProduct();
	  
	}

	@When("^new order id displayed on the order screen$")
	public void new_order_id_displayed_on_the_order_screen() throws Exception {
	
	}

	@When("^add more product to the order$")
	public void add_more_product_to_the_order() throws Exception {
	
	}


	@Then("^your list by is set to history$")
	public void your_list_by_is_set_to_history() throws Exception {
	
	}

	@When("^add items and quanties to the order$")
	public void add_items_and_quanties_to_the_order() throws Exception {
	
	}

	@Then("^items and quanties successfully added$")
	public void items_and_quanties_successfully_added() throws Exception {
	
	}

	@When("^search within the order by using the search bar$")
	public void search_within_the_order_by_using_the_search_bar() throws Exception {
	
	}

	@Then("^user successfully able to search$")
	public void user_successfully_able_to_search() throws Exception {
	
	}

	@When("^clear search by claring the field and clicking on the go button$")
	public void clear_search_by_claring_the_field_and_clicking_on_the_go_button() throws Exception {
	
	}

	@Then("^screen reverts back to history guide$")
	public void screen_reverts_back_to_history_guide() throws Exception {
	
	}

	@When("^confirmed, validate order dateil in corresponding ERP$")
	public void confirmed_validate_order_dateil_in_corresponding_ERP() throws Exception {
	
	}

	@Then("^order detail in ERP successfully matches Pmobile datail$")
	public void order_detail_in_ERP_successfully_matches_Pmobile_datail() throws Exception {
	
	}

	@When("^click on the bid guide, choose a guide and click apply$")
	public void click_on_the_bid_guide_choose_a_guide_and_click_apply() throws Exception {
	
	}

	@Then("^order entry screen successfully populated with bid guide$")
	public void order_entry_screen_successfully_populated_with_bid_guide() throws Exception {
	
	}

	@Then("^screen reverts back to bid guide$")
	public void screen_reverts_back_to_bid_guide() throws Exception {
	
	}

	@When("^click on the standard guide, choose a guide and click apply$")
	public void click_on_the_standard_guide_choose_a_guide_and_click_apply() throws Exception {
	
	}

	@Then("^order entry screen successfully populated with par list$")
	public void order_entry_screen_successfully_populated_with_par_list() throws Exception {
	
	}

	@Then("^screen reverts back to standard guide$")
	public void screen_reverts_back_to_standard_guide() throws Exception {
	
	}

	@When("^click on the par lists, choose a par list and click apply$")
	public void click_on_the_par_lists_choose_a_par_list_and_click_apply() throws Exception {
	
	}

	@Then("^order entry screen successfully populated with standard guide$")
	public void order_entry_screen_successfully_populated_with_standard_guide() throws Exception {
	
	}

	@Then("^screen reverts back to par list$")
	public void screen_reverts_back_to_par_list() throws Exception {
	
	}

	@When("^click on the critical item list$")
	public void click_on_the_critical_item_list() throws Exception {

	}

	@Then("^order entry screen successfully populated with the critical item list$")
	public void order_entry_screen_successfully_populated_with_the_critical_item_list() throws Exception {
	
	}

	@Then("^screen reverts back to custom guide$")
	public void screen_reverts_back_to_custom_guide() throws Exception {
	
	}

	@When("^click on sort by price$")
	public void click_on_sort_by_price() throws Exception {
	
	}

	@Then("^order entry screen successfully sorted by price$")
	public void order_entry_screen_successfully_sorted_by_price() throws Exception {

	}

	@When("^click on clear all sortby$")
	public void click_on_clear_all_sortby() throws Exception {
	 
	}

	@Then("^sort by successfully cleared$")
	public void sort_by_successfully_cleared() throws Exception {
	
	}

	@When("^click on the filter by brands$")
	public void click_on_the_filter_by_brands() throws Exception {
	
	}

	@Then("^filter by brands options screen populated on right hand side$")
	public void filter_by_brands_options_screen_populated_on_right_hand_side() throws Exception {
	
	}

	@When("^select a brand to filter by and click apply$")
	public void select_a_brand_to_filter_by_and_click_apply() throws Exception {
	
	}

	@Then("^order successfully filtered by specific brand$")
	public void order_successfully_filtered_by_specific_brand() throws Exception {
	
	}

	@When("^click on clear all brands filter$")
	public void click_on_clear_all_brands_filter() throws Exception {
	
	}

	@Then("^filter successfully cleared$")
	public void filter_successfully_cleared() throws Exception {
	
	}

	@When("^click on the filter by catagory$")
	public void click_on_the_filter_by_catagory() throws Exception {
	
	}

	@Then("^filter by catagory options screen populated on right hand side$")
	public void filter_by_catagory_options_screen_populated_on_right_hand_side() throws Exception {
	
	}

	@When("^select a catagory to filter by and click apply$")
	public void select_a_catagory_to_filter_by_and_click_apply() throws Exception {
	
	}

	@Then("^order successfully filtered by specific catagory$")
	public void order_successfully_filtered_by_specific_catagory() throws Exception {
	
	}

	@When("^click on clear all catagory filter$")
	public void click_on_clear_all_catagory_filter() throws Exception {
	
	}

	@When("^click on the filter by new items$")
	public void click_on_the_filter_by_new_items() throws Exception {
	
	}

	@Then("^order successfully filter by new items$")
	public void order_successfully_filter_by_new_items() throws Exception {
	
	}

	@When("^click on filter by previous order$")
	public void click_on_filter_by_previous_order() throws Exception {
	
	}

	@Then("^filter by previous options screen populated on right hand side$")
	public void filter_by_previous_options_screen_populated_on_right_hand_side() throws Exception {
	
	}

	@When("^select a previous order and click apply$")
	public void select_a_previous_order_and_click_apply() throws Exception {
	
	}

	@Then("^previous order details successfully displayed$")
	public void previous_order_details_successfully_displayed() throws Exception {
	
	}

	@When("^click on clear all previous order filter$")
	public void click_on_clear_all_previous_order_filter() throws Exception {
	
	}

	@When("^click on filter by classes$")
	public void click_on_filter_by_classes() throws Exception {
	
	}

	@Then("^filter by classes options screen populated on right hand side$")
	public void filter_by_classes_options_screen_populated_on_right_hand_side() throws Exception {
	
	}

	@When("^select a class to filter by and click apply$")
	public void select_a_class_to_filter_by_and_click_apply() throws Exception {
	
	}

	@Then("^order successfully filtered by specific class$")
	public void order_successfully_filtered_by_specific_class() throws Exception {
	
	}

	@When("^click on clear all class filter$")
	public void click_on_clear_all_class_filter() throws Exception {
	
	}

	@When("^enter quantity and validate that the \\$'s, Qty,Cu\\. ft and lb field's populated and update as items are added$")
	public void enter_quantity_and_validate_that_the_$_s_Qty_Cu_ft_and_lb_field_s_populated_and_update_as_items_are_added() throws Exception {
	
	}

	@Then("^All field's successfully populated$")
	public void all_field_s_successfully_populated() throws Exception {
	
	}

}
