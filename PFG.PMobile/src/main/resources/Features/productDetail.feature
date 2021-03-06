 Feature: The user is able to view, navigate on the proiduct details 
 
 Scenario Outline: The user is able to view, expand and minimize product details, product card and description when clicking on specific item
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And  user click on the Orders icon
  Then Verify orders details are successfully displays
   When click on the new button
  Then order entry screen successfully populated on screen
  When click on the item
  Then item detail screen successfully populated
  When click on the min/max arrow for all sections 
  Then All screen successfully minimize and maximize
  When click on the product card 
  Then product card successfully displays
  
  Examples:
    | UserId	| pwd	| 
    | 1008     	| test	| 
    
 Scenario Outline: The user is able to navigate through product details when clicking on the arrow to go to next item 
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And  user click on the Orders icon
  Then Verify orders details are successfully displays
   When click on the new button
  Then order entry screen successfully populated on screen
  When click on the item
  Then item detail screen successfully populated
  When using the top right arrows navigate to peviuos and next item
  Then navigation will be success
  
  Examples:
    | UserId	| pwd	| 
    | 1008     	| test	| 

 Scenario Outline: The user is able to navigate back to order from product details wqhen clicking on the back arrow 
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And  user click on the Orders icon
  Then Verify orders details are successfully displays
   When click on the new button
  Then order entry screen successfully populated on screen
  When click on the item
  Then item detail screen successfully populated
  When click on the top left arrows in th edetails bar
  Then successfully navigated back to main order entry screen
  
  Examples:
    | UserId	| pwd	| 
    | 1008     	| test	| 
    
 Scenario Outline: The user is able see and use the quick add tool when clicking on an item quantity box
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And  user click on the Orders icon
  Then Verify orders details are successfully displays
  When click on the new button
  Then order entry screen successfully populated on screen
  When click on the order quantity box
  Then quick add tool successfully populated on the screen
  When click on the any number
  Then verify clicked Order quantity successfully added to item
  
  Examples:
    | UserId	| pwd	| 
    | 1008     	| test	| 

 Scenario Outline: validate The user is able to use search funtion in the submit order screens when using the search bar
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And  user click on the Orders icon
  Then Verify orders details are successfully displays
  When click on the new button
  Then order entry screen successfully populated on screen
  When add item and quanties to the order
  Then item and quentities successfully added
  When click on the process order
  Then order details screen successfully populated
  When using the search bar on the top left conduct a search within the order
  Then search will be successfull
  
  Examples:
    | UserId	| pwd	| 
    | 1008     	| test	| 