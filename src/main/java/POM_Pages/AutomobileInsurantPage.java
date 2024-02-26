package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.TricentisTestBase;

public class AutomobileInsurantPage extends TricentisTestBase {
	public WebElement getHeaderElement() {
		return driver.findElement(By.name("Navigation Automobile"));
	}
	public WebElement firstname() {
        return driver.findElement(By.name("First Name"));
    }
  public WebElement lastname () {
        return driver.findElement(By.name("Last Name"));
    }
  public WebElement birthdate () {
        return driver.findElement(By.id("birthdate"));
    }
  public WebElement gender () {
        return driver.findElement(By.className("main"));
    }
  public WebElement streetaddress () {
        return driver.findElement(By.id("streetaddress"));
    }
  public WebElement country () {
        return driver.findElement(By.id("country"));
    }
  public WebElement zipcode () {
        return driver.findElement(By.id("zipcode"));
    }
  public WebElement next1 () {
     return driver.findElement(By.id("nextenterinsurantdata"));
 }
  public boolean isHeaderDisplayed() {
      return getHeaderElement().isDisplayed();
	}
	 public boolean isHeaderEnabled() {
	        return getHeaderElement().isEnabled();
	  }
	public void clickHeader() {
      getHeaderElement().click();
  }
	 public boolean clickIfHeaderDisplayedAndEnabled() {
	        if (isHeaderDisplayed() && isHeaderEnabled()) {
	            clickHeader();
	            System.out.println("Automobile Tab:  got clicked.");
	            return true;
	        } else {
	            return false;
	        }
	 }
  
  public String enterfirstname( String firstnamevalue) {
	  firstname().clear();
	  firstname().sendKeys(firstnamevalue);
	   return firstname().getAttribute("value");
  }
  public String enterlastname( String lastnamevalue) {
	  lastname().clear();
	  lastname().sendKeys(lastnamevalue);
	   return lastname().getAttribute("value");
  }
  
  public String enterbirthdate (String datevalue) {
	  birthdate ().clear();
	  birthdate ().sendKeys(datevalue);
	  return birthdate().getAttribute("value");			 
	  }
  public String selectgender ( String gender) {
        Select genderButton = new Select(gender());
        genderButton.selectByValue(gender);
        return genderButton.getFirstSelectedOption().getText();
    }

  public String enterstreetaddress (String addressvalue   )	{
	  streetaddress().clear();
	  streetaddress().sendKeys(addressvalue);
	  return streetaddress().getAttribute("value");	
  }
  
  public String selectcountry () {
        Select countryDropdown = new Select(country ());
        countryDropdown.selectByValue("India");
        return countryDropdown.getFirstSelectedOption().getText();
    }
 
  public String enterzipcode (String zipcodevalue)	{
	  zipcode ().clear();
	  zipcode ().sendKeys(zipcodevalue);
	   return zipcode ().getAttribute("value");	
	 
  }
  public void clickNextButton() {
      next1().click();
  }
	

}
