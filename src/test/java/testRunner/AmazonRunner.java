package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * single scenario=== tags=@Mobiles
 * multiple scenario=== tags=@HomePage @Mobiles
 * ignore scenario=== not tagname
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="stepdef",
					tags="not @Deal",
					publish=true)
public class AmazonRunner {

}
