package basiclearning;

import org.apache.log4j.Logger;

public class LogExample {

	private static final Logger log = Logger.getLogger(LogExample.class);
	//static because I just need one instantiation of Logger
	//LogExample.class because name of this class. See CalculatorCaller for # name
	
	public static void main(String args[]){
		log.debug("Hello world from debug");		//Development
		log.info("Hello world from info");			//QA
		log.warn("Hello world from warn");			
		log.error("Hello world from error");		//Production
	}
}
