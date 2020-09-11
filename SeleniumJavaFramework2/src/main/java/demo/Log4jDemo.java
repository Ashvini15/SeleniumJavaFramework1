
package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
 private static Logger logger = LogManager.getLogger(Log4jDemo.class);
 
 public static void main(String[] args) {
	 System.out.println("\n Hello World....!! \n");
	 logger.trace("This is Trace");
		logger.info("This is Information");
		logger.error("This is Error");
		logger.warn("This is Warning");
		logger.fatal("This is Fatal  Message");
		System.out.println("\nCompleted");
}
}