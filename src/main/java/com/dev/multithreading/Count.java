package com.dev.multithreading;

public class Count {
    private static short count;
    private final short limit = 100;

    public Count() {
        count = 0;
    }

    public static short getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public boolean finish() {
        return count == limit;
    }
}
