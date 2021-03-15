package com.meowyf.java.test;

/**
 * 描述
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/20 15:52:30
 */
public class TestJava101 {

    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }
}

abstract class Person {
    public abstract void run();
}

class Student extends Person {

    @Override
    public void run() {

    }
}

