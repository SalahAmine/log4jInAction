package com.learn.java.log4j.in.action;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class LogExceptions 
{
	//obtenir une instance du logger relative à la classe
	 final static Logger log = Logger.getLogger(LogExceptions.class);
			
    public static void main( String[] args )
    {
    	log.info("this is a log message ");
        System.out.println( "Hello World!" );
        
        
        LogExceptions obj = new LogExceptions();

		try{
			obj.divide();
		}catch(ArithmeticException ex){
			log.error("Sorry, something wrong!", ex);
		}
    }
    
	private void divide(){

		int i = 10 /0;

	}
    
    
}
