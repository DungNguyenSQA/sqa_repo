package testNg;

import org.apache.log4j.Logger;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	Logger log = Logger.getLogger(ParameterizedTest1.class);
	
    @Test
    @Parameters({"name1","name2"})
    public void parameterTest(@Optional String name1, @Optional String name2) {
    		log.info("name1 is  : " + name1);
    		log.info("name2 is  : " + name2);
    		System.out.println("Parameterized value is : " + name2);
    }
}
