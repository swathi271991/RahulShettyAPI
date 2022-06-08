package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",plugin ="json:target/jsonReports/cucumber-report.json",
glue = {"stepDefinations"})
public class TestRunner {
	
	
	

}


/*Steps to generate HTML and JSON reports

1) step1 : Add below plugin in POM.xml

build>
		<plugins>
		<plugin>
                <groupId>net.masterthought</groupId>
                <artifactId>maven-cucumber-reporting</artifactId>
                <version>5.7.0</version>
                <executions>
                    <execution>
                        <id>execution</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <projectName>cucumber-jvm-example</projectName>
                            <!-- optional, per documentation set this to "true" to bypass generation of Cucumber Reports entirely, defaults to false if not specified -->
                            <skip>false</skip>
                            <!-- output directory for the generated report -->
                            <outputDirectory>${project.build.directory}</outputDirectory>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <inputDirectory>${project.build.directory}/jsonReports</inputDirectory>
                            <jsonFiles>
                                <!-- supports wildcard or name pattern -->
                               // <param>**/   //*.json</param>
                    /*        </jsonFiles>
                            <parallelTesting>false</parallelTesting>
                            <!-- optional, set true to group features by its Ids -->
                            <mergeFeaturesById>false</mergeFeaturesById>
                            <!-- optional, set true to get a final report with latest results of the same test from different test runs -->
                            <mergeFeaturesWithRetest>false</mergeFeaturesWithRetest>
                            <!-- optional, set true to fail build on test failures -->
                            <checkBuildResult>false</checkBuildResult>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
			
			
			
			
		</plugins>
	</build>
		*/


 //Step2 :  add plugin ="json:target/jsonReports/cucumber-report.json", in TestRunner before glue

//Step3 : run from command line wuth the command  : mvn test verify


//step4: one overview-features.html report will be generated under cuucmber-html-reports copy the path and paste in google.