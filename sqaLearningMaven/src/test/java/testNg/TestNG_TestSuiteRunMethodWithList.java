package testNg;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class TestNG_TestSuiteRunMethodWithList {
	
	@Test
	public void runTestNGTest() {
		 
		//Create an instance on TestNG
		 TestNG myTestNG = new TestNG();
		 List<String> file = new ArrayList<String>();
	        file.add("/git_repo/sqa_repo/sqaLearningMaven/TestNGSuiteFromXML.xml");
//	        file.add("/git_repo/sqa_repo/sqaLearningMaven/TestNGSuiteFromXMLWithGroups.xml");
	        file.add("/git_repo/sqa_repo/sqaLearningMaven/TestNGSuiteFromXMLWithMethods.xml");
		 myTestNG.setTestSuites(file);
		//invoke run() - this will run your class.
		 myTestNG.run();
		}		
}
