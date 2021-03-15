package com.meowyf.java.test;

public class TestJava007 {

    public static void main(String[] args) {
        System.out.println(TestJava007.test());
    }

    public static int test() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}
