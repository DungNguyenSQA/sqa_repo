package junitTests;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classObject.PersonOvrldCnstr;

/*
 * 1.	Write a test class for testing Person class.
2.	Write test case for testing if name is assigned properly in constructor.
3.	Write test case for testing weather age is assigned properly in constructor.
4.	Write test case for testing weather ssn is assigned properly in constructor.
5.	Define a member variable for Person class.
6.	Before the class loads, initialize the logger
7.	Before every test case, assign the person reference to a new person object.
8.	After every test case, assign the person reference to null;

 */
public class TestExer23PersonTest {

	private PersonOvrldCnstr varPerson;
	static Logger log;

	@BeforeClass
	// Before the class loads, initialize the logger
	public static void beforeClass() {
		log = Logger.getLogger(TestExer23PersonTest.class);
		System.out.println("@BeforeClass");
	}

	@Before
	public void testBefore(){
		varPerson = new PersonOvrldCnstr("John",34,"433-43-4356");
		System.out.println("@Before");
		log.info("@Before");
	}

	@After
	public void testAfter(){
		varPerson = null;
		System.out.println("@After");
		log.info("@After");
	}
	@Test
	public void testName(){  
		//Test if name is assigned properly in constructor.		
		Assert.assertEquals("John",varPerson.getName());
		System.out.println("@Test Name");
	}

	@Test
	public void testAge(){  
		//Test if Age is assigned properly in constructor.		
		Assert.assertEquals(34,varPerson.getAge());
		System.out.println("@Test Age");
	}

	@Test
	public void testSsn(){  
		//Test if SSN is assigned properly in constructor.
		Assert.assertEquals("433-43-4356",varPerson.getSsn());
		System.out.println("@Test SSN");
	}
}
