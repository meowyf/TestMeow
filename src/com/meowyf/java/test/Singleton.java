package com.meowyf.java.test;

/**
 * 单例模式
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/28 13:38:32
 */
public class Singleton {

    private static class SingletonTest {
        public static final Singleton SINGLETON = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonTest.SINGLETON;
    }
}
