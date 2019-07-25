package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="Feaatures",glue="Case01",/*tags= {"@Smoke"},*/
plugin={"html:target/cucumber-htmlreport.html"})
public class SendToJenkins {

}
