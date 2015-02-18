package threads;

import org.apache.log4j.Logger;

public class ThreadCaller {
	static Logger log = Logger.getLogger(RunnableCaller.class);

	public static void main(String args[]) {
		log.info("Entering");
		ThreadDemo runDemo1 = new ThreadDemo();
		runDemo1.start();
		
		ThreadDemo runDemo2 = new ThreadDemo();
		runDemo2.start();
	}
}
