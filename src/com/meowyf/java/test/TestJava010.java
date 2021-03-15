package com.meowyf.java.test;

/**
 * 描述
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/20 23:12:47
 */
public class TestJava010 {

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        String s = String.join(", ", names);

        System.out.println(s);

    }
}
