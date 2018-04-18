package com.company;

import java.util.concurrent.locks.ReentrantLock;


public class PerformSystemCheck implements Runnable {

    private String checkWhat;

    ReentrantLock reentrantLock = new ReentrantLock();

    public PerformSystemCheck(String checkWhat) {
        this.checkWhat = checkWhat;
    }

    public void run() {
        reentrantLock.lock();

        System.out.println("Checking " + this.checkWhat);

        reentrantLock.unlock();

    }

}
