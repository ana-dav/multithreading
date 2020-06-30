package com.dev.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadTest extends Thread {
    private static final Logger logger = LogManager.getLogger(ThreadTest.class);

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            logger.info("ThreadTest: " + i + "\n");
        }
    }
}
