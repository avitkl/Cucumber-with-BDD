package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\JavaSeleniumFramework\\maven\\src\\main\\java\\features\\taggedhooks.feature" //path of the feature files
		,glue= {"stepDefinitions"}  //path of the step definition files
		,format= {"pretty","html:test-output","json:json_output/json_result.json","junit:junit_ouput/junit_result.xml"} //To generate different types of reporting
		,monochrome=true  // display the console output in a proper readable format 
		,strict=false // if it is true then test case will start to execute but if there is no step definition for any step then it will throw PendingException
		,dryRun=false // if it true then test case will not executed but it will check all the steps contains steps definitions
		//,tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}
		)

public class TestRunner {

}

//OR : tags= {"@SmokeTest , @RegressionTest"} -- execute all the tests tagged as @SmokeTEst OR @RegressionTest
//ANDed : tags= {"@SmokeTest","@RegressionTest"} -- execute all the tests tagged as @SmokeTEst AND @RegressionTest
//Ignore tests : tags={"~@SmokeTest","@RegressionTest","~End2End"}

