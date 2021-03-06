Feature: The user is able to create and process order

 Scenario Outline: The user is able to create and process orders from history from main order dashboard
  Given user on the application 
  When user enter valid user id "<UserId>" password "<pwd>"
  And user click on the order icon
  Then user able to see the Orders page displayed successful
  When click on the new button
  And add product to new order
  And new order id displayed on the order screen
  Then order entry screen successfully populated on screen
  When add more product to the order
  And your list by is set to history
  When add items and quanties to the order 
  Then items and quanties successfully added
  When search within the order by using the search bar
  Then user successfully able to search
  When clear search by claring the field and clicking on the go button
  Then screen reverts back to history guide
  When click on the proccess order button
  Then order details successfully populated on screen
  When click on submit order button
  Then user are able to successfully submitted the order
  When confirmed, validate order dateil in corresponding ERP
  Then order detail in ERP successfully matches Pmobile datail
 
  Examples:
    | UserId	| pwd	| product	      |
    | 1008     	| test	| CHEESE CREAM CUP|