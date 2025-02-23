package testRunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.core.options.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(
key = Constants.GLUE_PROPERTY_NAME, value = "StepDefinitions"
)
@ConfigurationParameter(
key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity4"
)
public class TestRunner {

}
