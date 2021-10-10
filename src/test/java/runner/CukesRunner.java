package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "src/test/resources/features",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {

}
