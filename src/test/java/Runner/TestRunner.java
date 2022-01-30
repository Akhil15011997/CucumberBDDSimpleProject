package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"StepDef"},
				 monochrome = true,plugin={"pretty","json:target/cucumber.json"}
				 //,tags="{@Test}"
				 //,tags="{(@Test or @Regression) and @Sanity}"
				 //,tags="{@Test and not @Regression}" 
				 )
public class TestRunner {
}


//plugin={"pretty","json:target/Report.json"}
//plugin={"pretty","html:target/HTMLReports/report.html"}
//plugin={"pretty","junit:target/Report.xml"}