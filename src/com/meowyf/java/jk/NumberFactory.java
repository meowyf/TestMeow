package com.meowyf.java.jk;

import com.meowyf.java.jk.impl.NumberFactoryImpl;

/**
 * 工厂接口
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/27 13:58:36
 */
public interface NumberFactory {

    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();
}
