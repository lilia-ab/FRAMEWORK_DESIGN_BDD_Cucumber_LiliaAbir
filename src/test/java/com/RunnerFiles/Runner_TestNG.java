package com.RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        dryRun = false,
        monochrome = true,
        features = {"src/test/resources/features_files" },
        glue     = {"com.Steps_Definition", "com.Hooks"},
        tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct or @TutorialsNinjaLogout",
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}

   )

public class Runner_TestNG extends AbstractTestNGCucumberTests{

}

