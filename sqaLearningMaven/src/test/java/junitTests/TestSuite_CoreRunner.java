package junitTests;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class TestSuite_CoreRunner {

	public void main (String[] args){
		JUnitCore runner = new JUnitCore();
		runner.addListener(new TextListener(System.out));
		runner.run(
				LenghtTextTest.class,
				TextMessageTest.class);
	}
}
