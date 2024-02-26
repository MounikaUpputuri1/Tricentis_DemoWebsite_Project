package testcases;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import POM_Pages.AutomobileVehiclePage;

import base.TricentisTestBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.util1;


public class AutomobileVehiclePage_StepDef extends TricentisTestBase{
	AutomobileVehiclePage a;
	

	@Given("User is on AutoMoblie Page")
	public void user_is_on_auto_moblie_page() {
		initialization();
	}
	@And("Automobile page loaded successfully")
    public void automobile_page_loaded_successfully() {
        a = new AutomobileVehiclePage();
		 Assert.assertEquals(driver.getTitle(), "Enter Vehicle Data", "Unable to open the Automobile page");
		    System.out.println("Automobile page loaded successfully");
		}
	@Then("user should select Automobile Tab")
	public void user_should_select_Automobile_Tab() {
		boolean automobileTab = a.clickIfHeaderDisplayedAndEnabled();
		Assert.assertTrue(automobileTab, "Automobile tab was not clicked.");	
	}
    public List<String> selectedCarMakes = new ArrayList<>();

    @When("user selects multiple car makes")
    public void user_selects_multiple_car_makes() {
        String[] carMakes = {"Audi", "BMW", "Ford", "Honda", "Mazda", "Mercedes Benz", "Nissan", "Opel", "Porsche", "Renault", "Skoda", "Suzuki", "Toyota", "Volkswagen", "Volvo"};
        for (String make : carMakes) {
            String selectedValue = a.selectMake(make);
            selectedCarMakes.add(selectedValue); 
            System.out.println("Selected Make: " + selectedValue);
        }
        util1.waits(500);
    }


	    @Then("verify the selected car makes")
	    public void verify_the_selected_car_makes() {
	        String[] expectedCarMakes = {"Audi", "BMW", "Ford", "Honda", "Mazda", "Mercedes Benz", "Nissan", "Opel", "Porsche", "Renault", "Skoda", "Suzuki", "Toyota", "Volkswagen", "Volvo"};
	        for (String expectedMake : expectedCarMakes) {
	            Assert.assertTrue(selectedCarMakes.contains(expectedMake), "Selected make '" + expectedMake + "' not found");
	        }
	   }
	    
	
        List<String> enteredEnginePerformanceValues = new ArrayList<>();

	    @When("user selects multiple values")
	    public void user_selects_multiple_values() {
	        String[] enginePerformanceValues = {"xyz", "@#$%", "0", "2001", "500"};
	        for (String engine : enginePerformanceValues) {
	            String enteredValue = a.enterEnginePerformance(engine);
	            enteredEnginePerformanceValues.add(enteredValue);
	        util1.waits(500);
	        }
	    }

	    @Then("verify the selected values")
	    public void verify_the_selected_values() {
	    	String[] expectedEnginePerformanceValues = {"xyz", "@#$%", "0", "2001", "500"};
	        for (int i = 0; i < expectedEnginePerformanceValues.length; i++) {
	            Assert.assertEquals(enteredEnginePerformanceValues.get(i), expectedEnginePerformanceValues[i], "Entered engine performance value '" + expectedEnginePerformanceValues[i] + "' not found");
	    }
	   }
	    List<String> enteredDateOfManufacture = new ArrayList<>();

	    @When("user selects multiple date values")
	    public void user_selects_multiple_date_values() {
	        String[] DateOfManufactureValues = {"02/07/2025", "01/01/2024","02/09/2024"};
	        for (String date : DateOfManufactureValues) {
	            String enteredValue = a.enterDateOfManufacture(date);
	            enteredDateOfManufacture.add(enteredValue);
	        util1.waits(500);
	        }
	    }

	    @Then("verify the selected date values")
	    public void verify_the_selected_date_values() {
	        String[] DateOfManufactureValues = {"02/07/2025", "01/01/2024","02/09/2024"};
	        for (int i = 0; i < DateOfManufactureValues.length; i++) {
	            Assert.assertEquals(enteredDateOfManufacture.get(i), DateOfManufactureValues[i], "Entered Date of Manufacture value '" + DateOfManufactureValues[i] + "' not found");
	    }
	   }
	    public List<String> selectedseats = new ArrayList<>();

	    @When("user selects multiple seats values")
	    public void user_selects_multiple_seats_values() {
	        String[] seats = {"1", "2", "3", "4", "5", "6","7", "8","9"};
	        for (String seats1 : seats) {
	            String selectedValue = a.selectNumberOfSeats(seats1);
	            selectedseats.add(selectedValue);
	            System.out.println("Selected seats: " + selectedValue);
	        }
	        util1.waits(500);
	    }

	    @Then("verify the selected seats values")
	    public void verify_the_selected_seats_values() {
	        String[] expectedseatsvalue =  {"1", "2", "3", "4", "5", "6","7", "8","9"};
	        for (String expectedSeat : expectedseatsvalue) {
	            Assert.assertTrue(selectedseats.contains(expectedSeat), "Selected seat '" + expectedSeat + "' not found");
	        }
	   }
	    
	    public List<String> selectedFuel = new ArrayList<>();

	    @When("user selects multiple fuel values")
	    public void user_selects_multiple_fuel_values() {
	        String[] fuel= {"Petrol", "Diesel", "Electric Power", "Gas", "Other"};
	        for (String fuel1 : fuel) {
	            String selectedValue = a.selectFuel(fuel1);
	            selectedFuel.add(selectedValue);
	            System.out.println("Selected fuel: " + selectedValue);
	        }
	        util1.waits(500);
	    }

	    @Then("verify the selected fuel values")
	    public void verify_the_selected_fuel_values() {
	        String[] expectedfuelvalue = {"Petrol", "Diesel", "Electric Power", "Gas", "Other"};
	        for (String expectedfuel : expectedfuelvalue) {
	            Assert.assertTrue(selectedFuel.contains(expectedfuel), "Selected Fuel '" + expectedfuel + "' not found");
	        }
	   }
	    List<String> enteredListPriceValues = new ArrayList<>();

	    @When("user selects multiple price values")
	    public void user_selects_multiple_list_price_values() {
	        String[] listPriceValues = {"xyz","@@#$%^","499", "100001", "500"};
	        for (String price : listPriceValues) {
	            String enteredValue = a.enterListPrice(price);
	            enteredListPriceValues.add(enteredValue);
	            util1.waits(500);
	        }
	    }

	    @Then("verify the selected price values")
	    public void verify_the_selected_list_price_values() {
	        String[] listPriceValues = {"xyz","@@#$%^","499", "100001", "500"};
	        for (int i = 0; i < listPriceValues.length; i++) {
	            Assert.assertEquals(enteredListPriceValues.get(i), listPriceValues[i], "Entered List Price value '" + listPriceValues[i] + "' not found");
	        }
	    }
	    List<String> enteredLicensePlateNumbers = new ArrayList<>();

	    @When("user selects multiple license numbers")
	    public void user_selects_multiple_license_numbers() {
	        String[] licensePlateNumbers = {"123ABC1234567", "6XYZ@#$", "7$%^H89F"};
	        for (String plateNumber : licensePlateNumbers) {
	            String enteredValue = a.enterLicensePlateNumber(plateNumber);
	            enteredLicensePlateNumbers.add(enteredValue);
	            util1.waits(500);
	        }
	    }

	    @Then("verify the selected license numbers")
	    public void verify_the_selected_license_numbers() {
	        String[] licensePlateNumbers ={"123ABC1234567", "6XYZ@#$", "7$%^H89F"};
	        for (int i = 0; i < licensePlateNumbers.length; i++) {
	            Assert.assertEquals(enteredLicensePlateNumbers.get(i), licensePlateNumbers[i], "Entered License Plate Number '" + licensePlateNumbers[i] + "' not found");
	        }
	    }
	    List<String> enteredAnnualMileages = new ArrayList<>();

	    @When("user selects multiple mileage values")
	    public void user_selects_multiple_mileage_values() {
	        String[] annualMileageValues = {"99", "100001", "xyz","@#$%","987"};
	        for (String mileage : annualMileageValues) {
	            String enteredValue = a.enterAnnualMileage(mileage);
	            enteredAnnualMileages.add(enteredValue);
	            util1.waits(500);
	        }
	    }

	    @Then("verify the selected mileage values")
	    public void verify_the_selected_mileage_values() {
	        String[] annualMileageValues = {"99", "100001", "xyz","@#$%","987"};
	        for (int i = 0; i < annualMileageValues.length; i++) {
	            Assert.assertEquals(enteredAnnualMileages.get(i), annualMileageValues[i], "Entered Annual Mileage value '" + annualMileageValues[i] + "' not found");
	        }
	    }
	   @When("user clicks on the star sign")
	    public void user_clicks_on_the_star_sign() {
		   
	    	WebElement starSign = driver.findElement(AutomobileVehiclePage.verifyMandatorysign);
	        starSign.click();
	        WebElement starSign1 = driver.findElement(AutomobileVehiclePage.verifyMandatorysign1);
	        starSign1.click();
	        WebElement starSign2 = driver.findElement(AutomobileVehiclePage.verifyMandatorysign2);
	        starSign2.click();
	        WebElement starSign3 = driver.findElement(AutomobileVehiclePage.verifyMandatorysign3);
	        starSign3.click();
	        WebElement starSign4 = driver.findElement(AutomobileVehiclePage.verifyMandatorysign4);
	        starSign4.click();
	        WebElement starSign5 = driver.findElement(AutomobileVehiclePage.verifyMandatorysign5);
	        starSign5.click();
	        WebElement starSign7 = driver.findElement(AutomobileVehiclePage.verifyMandatorysign7);
	        starSign7.click();
		  
	    }
	    
	    @Then("mandatory message should be displayed")
	    public void mandatory_message_should_be_displayed() {
	    	 
	     Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign));
	       System.out.println("Mandatory sign for Make displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign));
	       Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign1));
	         System.out.println("Mandatory sign for Engine displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign1));
	         Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign2));
	         System.out.println("Mandatory sign for date displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign2));
	         Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign2));
	         System.out.println("Mandatory sign for seats displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign3));
	         Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign4));
	         System.out.println("Mandatory sign for fuel displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign4));
	         Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign5));
	         System.out.println("Mandatory sign for price displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign5));
	         Assert.assertTrue(util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign7));
	         System.out.println("Mandatory sign for annual displayed: " + util1.verifyMandatorySign2(AutomobileVehiclePage.verifyMandatorysign7));
	        
	    	}
	    @When("user hovers over the star sign")
	    public void user_hovers_over_the_star_sign() {
	        String hoverText = util1.verifyHover(AutomobileVehiclePage.verifyMandatorysign1);
	        System.out.println("Hover text of Make: " + hoverText);
	        Assert.assertNotEquals("Hover text is empty", hoverText);
	    }

	    @Then("the mandatory message should be displayed")
	    public void the_mandatory_message_should_be_displayed() {
	        String hoverText = util1.verifyHover(AutomobileVehiclePage.verifyMandatorysign1);
	        if (hoverText == null || hoverText.isEmpty()) {
	            throw new AssertionError("Hover text for mandatory sign is empty");
	        } else {
	            System.out.println("Hover text for mandatory sign: " + hoverText);
	        }
	    }

	   
	   @When("user clicks on the Next Button")
	   public void user_clicks_on_the_Next_Button(){
		   a.clickNextButton();
			util1.waits(500);
		}
	   @Then("user should be navigated to the next page")
	    public void user_should_be_navigated_to_the_next_page() {
		   Assert.assertEquals(driver.getTitle(), "Enter Insurant Data", "Unable to open the Insurant page");
		    System.out.println("Navigated to Insurant page successfully");
			}
		  @After
		  public void captureScreenshotAndTearDown(Scenario scenario) {
			  captureScreenshotOnFailure(scenario);
		        tear();
		    }
		}




	    
	       

	

