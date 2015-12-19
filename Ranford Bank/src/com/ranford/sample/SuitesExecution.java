package com.ranford.sample;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class SuitesExecution {
  @Test
  public void f() {
	  TestNG testng=new TestNG();
	  List<String> suites=new ArrayList<String>();
	  suites.add("testng.xml");
	  testng.setTestSuites(suites);
	  testng.run();
	  
  }
}
