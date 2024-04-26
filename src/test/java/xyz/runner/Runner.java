package xyz.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/main/resources"}, glue = "xyz.stepdef",
        tags = "@abc",
        plugin = {"pretty", "html:target/cucumber_report/cucumberReport.html"}, monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }


}
