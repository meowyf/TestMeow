package com.meowyf.java.test;

import java.util.Random;

public class TestJava003 {

    public static void main(String[] args) {
        long max = Runtime.getRuntime().maxMemory(); //字节
        long sum = Runtime.getRuntime().totalMemory();

        System.out.println((max/(double)1024/1024));
        System.out.println((sum/(double)1024/1024));
        //
    }
}
