package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="Features",glue="Pack01.LearningCucumber",plugin = {"json:target/cucumber.json"})
//@CucumberOptions(features="Features",glue="Pack01.LearningCucumber",/*tags= {"@Smoke"},*/
//plugin={"html:target/cucumber-htmlreport.html"})
public class SendToJenkins {
	
}
