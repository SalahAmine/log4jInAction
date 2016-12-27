package com.learn.java.log4j.in.action;

import org.apache.log4j.Logger;

/**
 * How to use Log4j see log4j.properties
 *
 */
public class BasicExample 
{
	//obtenir une instance du logger relative à la classe
	 final static Logger log = Logger.getLogger(BasicExample.class);
			
    public static void main( String[] args )
    {
    	log.info("this is a log message ");
        System.out.println( "Hello World!" );
    }
    
    
    
    
    
}
