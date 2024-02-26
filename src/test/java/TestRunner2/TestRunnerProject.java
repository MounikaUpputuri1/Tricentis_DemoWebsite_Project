package TestRunner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/resources/Features2/data.feature"},glue= {"testcases"},plugin= {"pretty","html:target/htmlreport.html"})


public class TestRunnerProject  extends AbstractTestNGCucumberTests {
	


}
     
