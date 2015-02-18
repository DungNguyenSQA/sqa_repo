package threads;

import org.apache.log4j.Logger;

public class RunnableCaller {
	static Logger log = Logger.getLogger(RunnableCaller.class);

	public static void main(String args[]) {
		log.info("Entering");
		RunnableDemo runDemo = new RunnableDemo();
		//add(2,2);
		Thread t1 = new Thread(runDemo);		
		t1.start();

		Thread t2 = new Thread(runDemo);
		t2.start();
	}
	
	public static void add(int a, int b){
		System.out.println(a+b);
	}
}
