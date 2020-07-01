package com.dev.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableTest implements Runnable {
    private static final Logger logger = LogManager.getLogger(RunnableTest.class);

    private final Count count;

    public RunnableTest(Count count) {
        this.count = count;
    }

    public void run() {
        while (!count.finish()) {
            count.increment();
            logger.info("Runnable: " + count.getCount() + "\n");
        }
    }
}
