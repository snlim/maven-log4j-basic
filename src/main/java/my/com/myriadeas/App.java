package my.com.myriadeas;

import org.apache.log4j.Logger;

/**
 * Hello world!
 * 
 */
public class App {

	static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		
		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.fatal("Here is some FATAL");
		
		System.out.println("Hello World!");
	}
}
