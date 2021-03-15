package com.meowyf.java.test;

public class TestJava006 {
    // 1-100 相加
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        /* sum = (n + 1) * n / 2;*/
        System.out.println(sum);
    }


}
