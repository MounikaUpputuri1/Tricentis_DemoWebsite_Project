package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TricentisTestBase {
	 public static WebDriver driver;

	    public static void initialization() {
	        Properties prop = new Properties();
	        try (FileInputStream input = new FileInputStream("src\\main\\java\\configure_properties\\config1.properties")) {
	            prop.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String browser = prop.getProperty("browser");
	        if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				}else if(browser.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        String url = prop.getProperty("url");
	        driver.get(url);
	    }
	    public void captureScreenshotOnFailure(Scenario scenario) {
	    	if (scenario.isFailed()) {
	            try {
	                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	                String currentDir = System.getProperty("user.dir");
	                FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	                System.out.println("Screenshot captured and saved successfully");
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	    	}
	    }
	    public void tear() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

		
	


