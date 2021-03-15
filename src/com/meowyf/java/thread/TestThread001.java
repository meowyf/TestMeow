package com.meowyf.java.thread;

public class TestThread001 extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new TestThread001();
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
