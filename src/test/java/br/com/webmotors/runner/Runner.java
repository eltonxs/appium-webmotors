package br.com.webmotors.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/br/com/webmotors/feature", tags = "@buscar", glue = "br.com.webmotors.steps", strict = true)
public class Runner {

}
