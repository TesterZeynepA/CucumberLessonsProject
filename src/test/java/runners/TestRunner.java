package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", //konsol ciktilarinin daha okunakli olmasi icin plugin
                "html:target/reports/html_reports/cucumber1.html", //html formatinda rapor almak icin kullanilan plugin
                "json:target/reports/json-reports/cucumber1.json", //json formatinda rapor almak icin kullanilan plugin
                "junit:target/reports/xml-reports/cucumber1.xml",  //xml formatinda rapor almak icin kullanilan plugin
                "rerun:target/reports/failed-reports/failed1.txt" //failed testler için kullanilan plugin
        },
        monochrome = true,
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    tags = "@hooks",
    dryRun = false
)
public class TestRunner {
}
