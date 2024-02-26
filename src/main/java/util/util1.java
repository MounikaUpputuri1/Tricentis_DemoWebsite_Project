package util;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TricentisTestBase;

public class util1 extends TricentisTestBase  {
	public static int THREAD_sleep=500;
	
	public static void waits(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static boolean verifyMandatorySign2(By verifyMandatorysign) {
		try {
            return driver.findElement(verifyMandatorysign).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
	}
	public static String verifyHover(By verifyMandatorySign) {
	    Actions actions = new Actions(driver);
	    try { 
	        WebElement element = driver.findElement(verifyMandatorySign);
	        actions.moveToElement(element).perform();
	        String hoverText = element.getAttribute("title");
	        if (hoverText == null || hoverText.isEmpty()) {
	            return "Hover text is empty";
	        }
	        return hoverText;
	    } catch (NoSuchElementException e) {
	        System.out.println("Element not found: " + verifyMandatorySign);
	        return "Element not found";
	    }
	}

		
	}
	
	
	


