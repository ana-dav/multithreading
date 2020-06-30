package com.dev.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableTest implements Runnable {
    private static final Logger logger = LogManager.getLogger(RunnableTest.class);

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            logger.info("Runnable: " + i + "\n");
        }
    }
}
