package com.company;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.*;

public class Main {

    public static void main(String[] args) {
        addThreadsToPool();

    }

    public static void addThreadsToPool() {
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Email"), 5, 5, SECONDS);

        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Discord"), 5, 5, SECONDS);

        System.out.println("Number of threads: " + Thread.activeCount());

        Thread[] listOfThreads = new Thread[Thread.activeCount()];

        Thread.enumerate(listOfThreads);

        for (Thread i : listOfThreads) {
            System.out.println(i.getName());
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {

        }
    }
}
