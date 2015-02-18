package testNg;

import org.testng.annotations.Test;

public class testNgAnnotationTestAndGroup {

	@Test(groups={"groupeTest1"})
	public void test1() {
		System.out.println("in test 1, group 1");
	}
	
	@Test(groups={"groupeTest1"})
	public void test2() {
		System.out.println("in test 2, group 1");
	}
	@Test(groups={"groupeTest2"})
	public void test3() {
		System.out.println("in test 3, group 2");
	}

	@Test(groups={"groupeTest2"})
	public void test4() {
		System.out.println("in test 2, group 2");
	}
	@Test(groups={"groupeTest1"})
	public void test5() {
		System.out.println("in test 3, group 1");
	}
	@Test(groups={"groupeTest2"})
	public void test6() {
		System.out.println("in test 2, group 2");
	}
	@Test(groups={"groupeTest1","groupeTest2"})
	public void test7() {
		System.out.println("in test 3, groupeTest,groupeTest2");
	}
}
//3 tests, dependencies on method