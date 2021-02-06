package com.meowyf.java.test;

import java.util.Random;

public class TestJava004 {

    //-Xms8m -Xmx8m -XX:+PrintGCDetails
    public static void main(String[] args) {
        String a = "meowmeowmeowvmeow";

        while (true) {
            a += a + new Random().nextInt(888888888) + new Random(99999999);
        }
    }
}
