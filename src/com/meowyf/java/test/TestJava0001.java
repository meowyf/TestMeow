package com.meowyf.java.test;

/**
 * 描述
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/27 14:05:35
 */
public class TestJava0001 {

    public static void main(String[] args) {
       StringBuffer a = new StringBuffer("A");
       StringBuffer b = new StringBuffer("B");
       append(a, b);
        System.out.println(a + "," + b);

        int[] e = new int[4];
        Integer[] d = {1,null,2};
        String[] f = {null};

    }

    static void append (StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }


}
