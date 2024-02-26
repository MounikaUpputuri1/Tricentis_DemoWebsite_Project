package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.TricentisTestBase;

public class AutomobileVehiclePage extends TricentisTestBase {

		public WebElement getHeaderElement() {
			return driver.findElement(By.name("Navigation Automobile"));
		}
		 public WebElement make() {
	        return driver.findElement(By.name("Make"));
	    }
		public WebElement Engineperformance () {
	        return driver.findElement(By.id("engineperformance"));
	    }
		public WebElement dateOfManufacture () {
	        return driver.findElement(By.id("dateofmanufacture"));
	    }
		public WebElement numberOfSeats () {
	        return driver.findElement(By.id("numberofseats"));
	    }
		public WebElement Fuel () {
	        return driver.findElement(By.id("fuel"));
	    }
		public WebElement listprice () {
	        return driver.findElement(By.id("listprice"));
	    }
		public WebElement licensePlateNumber () {
	        return driver.findElement(By.id("licenseplatenumber"));
	    }
		public WebElement annuelMileage() {
	        return driver.findElement(By.id("annualmileage"));
	    }
		public WebElement next () {
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
	    public String selectMake(String Make) {
	        Select makeDropdown = new Select(make());
	        makeDropdown.selectByValue(Make);
	        return makeDropdown.getFirstSelectedOption().getText();
	    }
	    public String enterEnginePerformance(String performanceValue) {
	        Engineperformance().clear(); 
	        Engineperformance().sendKeys(performanceValue);
	        return Engineperformance().getAttribute("value");
	        }
	   public String enterDateOfManufacture(String dateValue) {
	    	dateOfManufacture().clear(); 
	    	dateOfManufacture().sendKeys(dateValue);
	        return dateOfManufacture().getAttribute("value");
	        }
	    public String selectNumberOfSeats(String Seats) {
	        Select seatsDropdown = new Select(numberOfSeats());
	        seatsDropdown.selectByValue(Seats);
	        return seatsDropdown.getFirstSelectedOption().getText();
	    }
	    public String selectFuel(String Fuel) {
	        Select fuelDropdown = new Select(Fuel());
	        fuelDropdown.selectByValue(Fuel);
	        return fuelDropdown.getFirstSelectedOption().getText();
	    }
	    public String enterListPrice(String Listprice) {
	    	listprice().clear();
	    	listprice().sendKeys(Listprice);
	        return listprice().getAttribute("value");

	    }
	   
       public String enterLicensePlateNumber(String Platenumber) {
    	   licensePlateNumber().clear();
	        licensePlateNumber().sendKeys(Platenumber);
	        return licensePlateNumber().getAttribute("value");
	    }
	    public String enterAnnualMileage(String mileage) {
	    	annuelMileage().clear();
	        annuelMileage().sendKeys(mileage);
	        return annuelMileage().getAttribute("value");

	    }
	     public static final By verifyMandatorysign  = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/i");
	     public static final By verifyMandatorysign1  = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/i");
		 public static final By verifyMandatorysign2  = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/i");
		 public static final By verifyMandatorysign3 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/i");
		 public static final By verifyMandatorysign4 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/i");
		 public static final By verifyMandatorysign5  = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/i");
		 public static final By verifyMandatorysign6 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/i");
		 public static final By verifyMandatorysign7 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/i");
	    public void clickNextButton() {
	        next().click();
	    }
		
	}