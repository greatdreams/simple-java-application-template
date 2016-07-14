package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** the main class of the program
 *
 *@author greatdreams
 */
public class Hello {
    private static Logger LOGGER = LoggerFactory.getLogger(Hello.class);
    /** the entry method of the program
     * @param args application arguments
     */
    public static void main(String[] args) {
        LOGGER.info("This application is build with the sbt tool");
    }
}
