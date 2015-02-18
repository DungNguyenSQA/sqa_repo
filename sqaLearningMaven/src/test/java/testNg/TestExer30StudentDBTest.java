package testNg;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import classExercise.StudentInfo;

public class TestExer30StudentDBTest {
	private Set<String> stdNames;
	
	@BeforeClass
	//This is the expected input set that we are defining.
	public void setExpectedStdNames(){
		stdNames = new HashSet<String>();
		stdNames.add("Robert");
		stdNames.add("Jack");
		stdNames.add("Jon");
		stdNames.add("David");
		stdNames.add("Paul");
		stdNames.add("Mike");
	}
	
	@Test(dataProviderClass = TestNgDataProvider.class, dataProvider="studentDetails")	
	/*input of this at runtime will be a list of total 6 objects.
	below method will get called once for every object from the list.
	for e.g. Robert
			Jack
			Jon 
			are 3 elements in the list
			then below method will get called 3 times by passing every object one at a time.
	 * 
	 */
	public void testStudentNames(StudentInfo stdInfo) {		
		Assert.assertTrue(stdNames.contains(stdInfo.getStudentName()));
	}
}
