package com.meowyf.java.thread;

import com.sun.tools.javac.util.List;

public class TestThread002 {

    /*public static void main(String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, Comparator.comparing(String::toLowerCase));
        System.out.println(String.join(", ", array));
    }*/

    /*public static void main(String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, TestThread002::cmp);
        System.out.println(String.join(", ", array));
    }

    static int cmp(String s1, String s2) {
        return s1.compareTo(s2);
    }*/

    public static void main(String[] args) {
        /*Stream<String> stringStream = Stream.of("a","b");
        stringStream.forEach(System.out :: println);*/

        /*List.of("a   ", "b   ", "c   ").stream().map(String :: toUpperCase).map(String :: trim).map(TestThread002 :: append).forEach(System.out :: print);*/


        List.of("a", "a", "b", "c", "d" ,"d").stream().distinct().map(String :: toUpperCase).forEach(System.out :: print);


    }

    public static String append (String a) {
        return a += a;
    }
}
