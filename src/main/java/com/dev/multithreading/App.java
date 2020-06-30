package com.dev.multithreading;

public class App {
    public static void main(String[] args) {
        ThreadTest thread1 = new ThreadTest();
        thread1.start();
        Runnable runnable1 = new RunnableTest();
        Thread runnableThread = new Thread(runnable1);
        runnableThread.start();
    }
}
