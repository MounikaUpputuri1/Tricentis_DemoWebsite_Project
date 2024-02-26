Feature: Tricentis AutoMobile Page

Background:
  Given User is on AutoMoblie Page
  And Automobile page loaded successfully
  Then user should select Automobile Tab

Scenario: Verify Make Selection
  When user selects multiple car makes
  Then verify the selected car makes

Scenario: Verify EnginePerformance Selection
  When user selects multiple values
  Then verify the selected values

Scenario: Verify DateOfManufacture Selection
  When user selects multiple date values
  Then verify the selected date values

Scenario: Verify NumberOfSeats Selection
  When user selects multiple seats values
  Then verify the selected seats values

Scenario: Verify fueltype Selection
  When user selects multiple fuel values
  Then verify the selected fuel values

Scenario: Verify listprice Selection
  When user selects multiple price values
  Then verify the selected price values

Scenario: Verify licenseplateNumber Selection
  When user selects multiple license numbers
  Then verify the selected license numbers

Scenario: Verify annualmileage Selection
  When user selects multiple mileage values
  Then verify the selected mileage values

Scenario: Verify Mandatory Sign
  When user clicks on the star sign
  Then mandatory message should be displayed
  
 Scenario: Verify Hoverover 
    When  user hovers over the star sign
    Then  the mandatory message should be displayed
  
Scenario: Verify Next Button Functionality
  When user clicks on the Next Button
  Then user should be navigated to the next page
  
  
 
  
