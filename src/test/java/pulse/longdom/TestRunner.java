package pulse.longdom;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", 
glue="pulse/longdom/stepDef", monochrome=true)
public class TestRunner {

}