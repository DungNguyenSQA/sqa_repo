package threads;

import org.apache.log4j.Logger;

public class RunnableDemo implements Runnable {
	static Logger log = Logger.getLogger(RunnableDemo.class);
	public String test = "abc";
	
	public void run() {
		log.info("Entering");
		try {
			synchronized(this){
				if(test.equalsIgnoreCase("xyz")){
					log.info("String is xyz");
				}
			}
			test="xyz";
			for(int i = 4; i > 0; i--) {				
				// Let the thread sleep for a while.
				Thread.sleep(60);
			}
			add(2,2);
			test="abc";
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public synchronized void add(int a, int b){
		log.info(a+b);
	}
}
