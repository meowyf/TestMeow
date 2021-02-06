package com.meowyf.java.test;

import java.util.ArrayList;
import java.util.List;

public class TestJava005 {
    //出现OOM怎么排除？解决办法
    //11。能够看到代码第几行 内存快照分析    MAT Jprofiler（分析Dump内存文件 快速定位内存泄漏； 后的堆中的对象； 获得大对象）
    byte[] bytes = new byte[1 * 10240*1024];
    //-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
    //-Xms 初始内存大小
    //Xmx 设置最大分配的内存
    //-XX:+PrintGCDetails

    public static void main(String[] args) {
        List<TestJava005> list = new ArrayList<>();

        int count = 0;

        try {
            while (true) {
                list.add(new TestJava005()); //问题所在
                count = count +1;
            }
        } catch (Error e) {
            System.out.println(count);
            e.printStackTrace();
        }


    }
}
