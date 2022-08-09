package org.runner;

import org.junit.AfterClass;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\Rerun\\Failed.txt", glue = "org.stepdefinition", monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, plugin = {
		"html:target\\reports", "junit:target\\reports\\fbjunit.xml", "json:target\\reports\\fblogin.json",
		"rerun:src\\test\\resources\\Rerun\\Failed.txt" })

public class TestReRunnerClass {

	
}
