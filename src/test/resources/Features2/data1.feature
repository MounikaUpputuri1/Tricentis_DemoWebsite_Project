Feature: Tricentis AutoMobile1 Page

Background:
  Given User is on AutoMoblie1 Page
  And Automobile page1 loaded successfully
  Then user should select Automobile1 Tab
  When user clicks on the Next Button1
  Then user should be navigated to the next page1

Scenario: Verify FirstName Selection
  When user selects multiple Firstname values
  Then verify the selected firstname values
  
 Scenario: Verify LastName Selection
 When  user selects multiple lastname values
  Then verify the selected lastname values
  
 Scenario: Verify dateOfBirth Selection
  When  user selects multiple DOB values
  Then verify the selected DOB values
  
 Scenario: Verify Gender Selection
  When  user selects multiple gender values
  Then verify the selected genders values
  
  Scenario: Verify streetaddress Selection
  When user selects street values
  Then verify the selected street values
  
  
  Scenario: Verify Zipcode Selection
  When  user selects multiple ZC values
  Then verify the selected ZC values
  
 
  
  
  
 