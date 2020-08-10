package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //makes connection between junit and cucumber
@CucumberOptions(

        //plugin = "html:target/cucumber-report.html",
        plugin = {"html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"},
        features = "src\\test\\resources\\features",
        glue = "com\\cybertek\\step_definitions",
        dryRun = false,
        tags = "@wip"  //buraya istedigimiz tag i paste yapip calistirabiliriz

)
public class CukesRunner {
}

/*
Gurhan'in Kodlari:

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "@wiki"
)
public class CukesRunner {
} */

