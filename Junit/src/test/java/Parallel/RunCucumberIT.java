package Parallel;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\Parallel\\"} ,glue = {"Parallel"},
    
    		 monochrome = true
)
public class RunCucumberIT {
}
