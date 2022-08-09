package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.Jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="com.stepdefinition", monochrome=true, 
dryRun = false,
plugin= {"pretty",
		
		"junit:C:\\Users\\USER\\eclipse-workspace\\My-WorkRepo\\RCBTest\\target\\Report\\JUNIT.junit"
		}
)
public class TestRunnerClass {
	
	@AfterClass()
	public static void jvm() {
		Jvmreport.JvmReportGenerate("C:\\Users\\USER\\eclipse-workspace\\My-WorkRepo\\RCBTest\\target\\Report\\JSONReport.json");
	}
	}
	
	
	
	


