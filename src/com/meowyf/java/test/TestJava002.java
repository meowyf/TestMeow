package com.meowyf.java.test;

public class TestJava002 {


    public static void main(String[] args) {
        TestJava001 testJava001 = new TestJava001();
        String str = "0";
        str = testJava001.strChange(str);
        System.out.println(str);

        int i = 0;
        i = testJava001.inChange(i);
        System.out.println(i);

    }
}
