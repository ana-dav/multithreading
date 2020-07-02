package com.dev.multithreading;

public class App {
    public static void main(String[] args) {
        Count count = new Count();
        ThreadTest thread1 = new ThreadTest(count);
        thread1.start();
        Runnable runnable1 = new RunnableTest(count);
        Thread runnableThread = new Thread(runnable1);
        runnableThread.start();
    }
}
