package junitTests;
import static org.junit.Assert.assertTrue;
//import junitparams.FileParameters;
//import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(JUnitParamsRunner.class)
public class FileReadingParameterizedTest {

    @Test
    //@FileParameters("/Users/prashantnagar/Dropbox/SQA_1/ConfigFiles/csvTest.csv")
    public void testWithCSV(String city, String state, int zip) {
    		System.out.println("city is : " +city);
    		System.out.println("state is : " +state);
    		System.out.println("zip is : " +zip);
        assertTrue(zip > 9999 && zip < 100000);
    }
}