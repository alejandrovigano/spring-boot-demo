package ar.com.cgarcete.demo.utils;

import org.apache.log4j.Logger;

public class Log {
	// Initialize Log4j logs
	private static Logger logger = Logger.getLogger(Log.class.getName());
	 
	// Need to create these methods, so that they can be called   
	 public static void info(String message) {
		 logger.info(message);
	 }
	 
	 public static void warn(String message) {
	    logger.warn(message);
	 }
	 
	 public static void error(String message) {
	    logger.error(message);
	 
	 }
	 
	 public static void fatal(String message) {
	    logger.fatal(message);
	}
	 
	 public static void debug(String message) {
	    logger.debug(message);
	 }
}
