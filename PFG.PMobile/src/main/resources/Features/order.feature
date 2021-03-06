Feature: Verify user able to order, view order, sort order, filter, clear edit order 

 Scenario Outline: The user is able to refresh orders 
 Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And user click on the order icon
  And Pull down the refresh arrow
  Then Verify orders are successfully refreshed
 
  Examples:
    | UserId	| pwd	| product	      |
    | 1008     	| test	| CHEESE CREAM CUP|
Scenario Outline: The user is able to sort orders and clear sort 
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And user click on the order icon
  Then user able to see the Orders page displayed successful
  When Click on the Order /# sort box 
  Then user able to see the Orders successfully sorted by order /#
  When user Click on the order date sort box 
  Then user able to see the orders successfully sorted by order date
  When user Click on the customer name sort box 
  Then user able to see the orders successfully sorted by customer name
  When user Click on clear all 
  Then user able to see the Previous sorts successfully cleared 
  
   Examples:
    | UserId	| pwd	| product	      |
    | 1008     	| test	| CHEESE CREAM CUP|
 Scenario Outline: The user is able to filter and clear filter 
  Given user on the application 
  And user enter valid userid "<UserId>" password "<pwd>"
  And user click on the order icon
  Then user able to see the Orders page displayed successful
  When Click on the customrer filter box 
  Then user able to see customer list populates on righthand side
  When Select a customer and click on the apply 
  Then user able to see the Orders are successfully displayed for only that customer
  When user Click on the order date filter box 
  Then user able to see the orders date filter options successfully populated on righthand side
  When user choose a date range and click on apply 
  Then user able to see order for date range successfully populated
  When user clear all on order date filter
  Then user able to see page navigatte to all order 
  When user click on the ship date filter box 
  Then user able to see the ship date filter box displayed successful
  When user choose a date range and click on apply
  Then user able to see all of the order for date range
  When Clear all on ship date filter 
  Then user able to see page navigatte to all order
  When user click on the ship date filter box 
  Then user able to see the ship date filter box displayed successful
  When user choose a filter option (ex last week) and click on the box click on apply 
  Then user able to see order for that time frame successfully display
  When Clear all on ship date filter 
  Then user able to see all order 
  When user click opn the status filter
  Then user able to see all status option successfully on screen
  When user choose a filter option box and click on apply 
  Then user able to see status filter option successfully display on the screen
  When Clear all on ship date filter 
  Then user able to see all order 
   Examples:
    | UserId	| pwd	| 
    | 1008     	| test	|
    
Scenario Outline: The user is able to view orders detail
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And When Select a confirmed order and click continue
  Then Verify orders details are successfully displays
  When select an item and click on it
  Then verify item details successfully displayed 
  When click on the back arrow 
  Then Screen successfully navigate back to the order detail
 
  Examples:
    | UserId	| pwd	| product	  |
    | 1008     	| test	| CHEESE CREAM CUP| 

 
 Scenario Outline: The user is able to edit orders
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And user click on the order icon
  Then user able to see the Orders page displayed successful
  When select an active order and click continue
  Then Verify orders details are successfully displays
  When add an item or make a change
  Then verify item successfully added and changed 
  When click on the x next to proccess order 
  Then confirm box will be pops up
  When click on okay button
  Then user are successfully brought back to the main order page
	
   Examples:
    | UserId	| pwd	| product	      |
    | 10092    	| test	| CHEESE CREAM CUP|

Scenario Outline: The user is able to submit orders
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And user click on the order icon
  Then user able to see the Orders page displayed successful
  When select an active order and click continue
  Then Verify orders details are successfully displays
  When click on the proccess order button
  Then order details successfully populated on screen
  When click on submit order button
  Then user are able to successfully submitted the order
 
  Examples:
    | UserId	| pwd	| product	      |
    | 10092    	| test	| CHEESE CREAM CUP|