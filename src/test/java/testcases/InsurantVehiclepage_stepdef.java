package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import POM_Pages.AutomobileInsurantPage;
import base.TricentisTestBase;
import util.util1;

public class InsurantVehiclepage_stepdef extends TricentisTestBase {
    AutomobileInsurantPage b;
    List<String> selectedFirstName = new ArrayList<>();
	 List<String> enteredLastNameValues = new ArrayList<>();


    @Given("User is on AutoMoblie1 Page")
    public void User_is_on_AutoMoblie1_Page() {
        initialization();
    }

    @And("Automobile page1 loaded successfully")
    public void automobile_page1_loaded_successfully() {
        b = new AutomobileInsurantPage();
        Assert.assertEquals(driver.getTitle(), "Enter Vehicle Data", "Unable to open the Automobile page");
        System.out.println("Automobile page loaded successfully");
    }

    @Then("user should select Automobile1 Tab")
    public void user_should_select_Automobile1_Tab() {
        boolean automobileTab = b.clickIfHeaderDisplayedAndEnabled();
        Assert.assertTrue(automobileTab, "Automobile tab was not clicked.");
    }
    
	   @When("user clicks on the Next Button1")
	   public void user_clicks_on_the_Next_Button1(){
		   b.clickNextButton();
			util1.waits(500);
		}
	   @Then("user should be navigated to the next page1")
	    public void user_should_be_navigated_to_the_next_page1() {
		   Assert.assertEquals(driver.getTitle(), "Enter Insurant Data", "Unable to open the Insurant page");
		    System.out.println("Navigated to Insurant page successfully");
			}

    @When("user selects multiple Firstname values")
    public void user_selects_multiple_Firstname_values() {
        String[] engineFirstNameValues = {"b", "2", "$", "def"};
        for (String first : engineFirstNameValues) {
            String enteredValue = b.enterfirstname(first);
            selectedFirstName.add(enteredValue);
            util1.waits(500);
        }
    }

    @Then("verify the selected firstname values")
    public void verify_the_selected_firstname_values() {
        String[] expectedFirstNameValues = {"b", "2", "$", "def"};
        for (int i = 0; i < expectedFirstNameValues.length; i++) {
            Assert.assertEquals(selectedFirstName.get(i), expectedFirstNameValues[i], "Entered FirstNameValue '" + expectedFirstNameValues[i] + "' not found");
        }
   
   }

   @When("user selects multiple lastname values")
    public void When_user_selects_multiple_lastname_values() {
    	        String[] engineLastNameValues = {"a", "1", "#", "abc"};
    	        for (String last : engineLastNameValues) {
    	            String enteredValue = b.enterlastname(last);
    	            enteredLastNameValues.add(enteredValue);
    	            util1.waits(500);
    	        }
    	    }
    @Then("verify the selected lastname values")
    public void verify_the_selected_lastname_values() {
	        String[] expectedLastNameValues = {"a", "1", "#", "abc"};
	        for (int i = 0; i < expectedLastNameValues.length; i++) {
	            Assert.assertEquals(enteredLastNameValues.get(i), expectedLastNameValues[i], "Entered LastNameValue '" + expectedLastNameValues[i] + "' not found");
	        }
	
    }
    List<String> enteredbirthdate = new ArrayList<>();

    @When("user selects multiple DOB values")
    public void user_selects_multiple_DOB_values() {
        String[] birthdateValues = {"01-02-2003", "02-29-2024", "02-02-2024", "02/29/2004"};
        for (String date : birthdateValues) {
            String enteredValue = b.enterbirthdate(date);
            enteredbirthdate.add(enteredValue);
            util1.waits(500);
        }
    }

    @Then("verify the selected DOB values")
    public void verify_the_selected_DOB_values() {
        String[] BirthdateValues = {"01-02-2003", "02-29-2024", "02-02-2024", "02/29/2004"};
        for (int i = 0; i < BirthdateValues.length; i++) {
            Assert.assertEquals(enteredbirthdate.get(i), BirthdateValues[i], "Entered Date of Manufacture value '" + BirthdateValues[i] + "' not found");
        }
    }

    List<String> selectedgender = new ArrayList<>();

    @When("user selects multiple gender values")
    public void user_selects_multiple_gender_values() {
        String[] genders = {"Male", "Female"};
        for (String genders1 : genders) {
            String selectedValue = b.selectgender(genders1);
            selectedgender.add(selectedValue);
            System.out.println("Selected genders: " + selectedValue);
            util1.waits(500);
        }
    }

    @Then("verify the selected genders values")
    public void verify_the_selected_genders_values() {
        String[] expectedgendersvalue = {"Male", "Female"};
        for (String expectedgender : expectedgendersvalue) {
            Assert.assertTrue(selectedgender.contains(expectedgender), "Selected gender '" + expectedgender + "' not found");
        }
    }

    List<String> enteredstreetaddressValues = new ArrayList<>();

    @When("user selects street values")
    public void user_selects_street_values() {
        String[] streetaddressValues = {"as", "main"};
        for (String last : streetaddressValues) {
            String enteredValue = b.enterstreetaddress(last);
            enteredstreetaddressValues.add(enteredValue);
            util1.waits(500);
        }
    }

    @Then("verify the selected street values")
    public void verify_the_selected_street_values() {
        String[] expectedstreetaddressValues = {"as", "main"};
        for (int i = 0; i < expectedstreetaddressValues.length; i++) {
            Assert.assertEquals(enteredstreetaddressValues.get(i), expectedstreetaddressValues[i], "Entered streetaddressValue '" + expectedstreetaddressValues[i] + "' not found");
        }
    }

    List<String> enteredzipcodeValues = new ArrayList<>();

    @When("user selects multiple ZC values")
    public void user_selects_multiple_ZC_values() {
        String[] listzipcode = {"499", "100001", "1234567"};
        for (String code : listzipcode) {
            String enteredValue = b.enterzipcode(code);
            enteredzipcodeValues.add(enteredValue);
            util1.waits(500);
        }
    }

    @Then("verify the selected ZC values")
    public void verify_the_selected_ZC_values() {
        String[] listzipValues = {"499", "100001", "1234567"};
        for (int i = 0; i < listzipValues.length; i++) {
            Assert.assertEquals(enteredzipcodeValues.get(i), listzipValues[i], "Entered zipcode value '" + listzipValues[i] + "' not found");
        }
    }
}
