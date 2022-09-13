package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,name = {"Verifying facebook login with valid crementials"}   ,features =   "src\\test\\resources\\featurefolder\\Feat.feature",glue = "com.stepdef")
public class Testruner {

}
