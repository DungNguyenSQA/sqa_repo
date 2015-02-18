package threads;

import org.apache.log4j.Logger;

public class ThreadDemo extends Thread{
static Logger log = Logger.getLogger(ThreadDemo.class);
	
	public void run() {
		log.info("Entering");
		try {
			for(int i = 4; i > 0; i--) {				
				// Let the thread sleep for a while.
				Thread.sleep(50);
				log.info("Printing from "+this.getName()+" : "+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
