package junitTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JUnitLifeCycle {	
	List collection;
	static Logger log;
	
	@BeforeClass
	public static void oneTimeSetUp() {
		// one-time initialization code
		log = Logger.getLogger(JUnitLifeCycle.class);
		System.out.println("@BeforeClass - oneTimeSetUp");
	}

	@AfterClass
	public static void oneTimeTearDown() {
		// one-time cleanup code
		System.out.println("@AfterClass - oneTimeTearDown");
	}

	@Before
	public void setUp() {
		collection = new ArrayList();
		System.out.println("@Before - setUp");
		log.info("Calling before every method");
	}

	@After
	public void tearDown() {
		collection = null;
		//collection.clear();
		System.out.println("@After - tearDown");
	}

	@Test
	public void testEmptyCollection() {
		assertTrue(collection.isEmpty());
		System.out.println("@Test - testEmptyCollection");
	}

	@Test	
	public void testOneItemCollection() {
		collection.add("itemA");
		Assert.assertEquals(1, collection.size());
		//assertEquals(1, collection.size());
		System.out.println("@Test - testOneItemCollection");
	}

}
