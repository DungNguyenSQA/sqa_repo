package testNg;

import org.testng.annotations.Test;

public class testNgAnnotationDependenciesOnMethod {

	//3 tests, dependencies on method
	@Test(groups={"groupeTest1"}, dependsOnMethods="test2")
	public void test1() {
		System.out.println("in test 1, group 1");
	}
	
	@Test(groups={"groupeTest1"})
	public void test2() {
		System.out.println("in test 2, group 1");
	}
	@Test(groups={"groupeTest2"}, dependsOnMethods="test4")
	public void test3() {
		System.out.println("in test 3, group 2");
	}

	@Test(groups={"groupeTest2"})
	public void test4() {
		System.out.println("in test 4, group 2");
	}
	@Test(groups={"groupeTest1"}, dependsOnMethods="test1")
	public void test5() {
		System.out.println("in test 5, group 1");
	}
	@Test(groups={"groupeTest2"}, dependsOnMethods="test3")
	public void test6() {
		System.out.println("in test 6, group 2");
	}
	@Test(groups={"groupeTest1","groupeTest2"})
	public void test7() {
		System.out.println("in test 7, groupeTest1,groupeTest2");
	}
//	@Test(groups={"groupeTest3"}, dependsOnMethods="test9")
//	public void test8() {
//		System.out.println("in test 8, groupeTest3");
//	}
//	@Test(groups={"groupeTest3"}, dependsOnMethods="test8")
//	public void test9() {
//		System.out.println("in test 9, groupeTest3");
//	}
}
