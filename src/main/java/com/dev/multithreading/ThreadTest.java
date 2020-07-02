package com.dev.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadTest extends Thread {
    private static final Logger logger = LogManager.getLogger(ThreadTest.class);
    private final Count count;

    public ThreadTest(Count count) {
        this.count = count;
    }

    public void run() {
        while (!count.finish()) {
            count.increment();
            logger.info("ThreadTest: " + count.getCount() + "\n");
        }
    }
}
