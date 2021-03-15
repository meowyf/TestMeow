package com.meowyf.java.jk.impl;

import com.meowyf.java.jk.NumberFactory;

import java.math.BigDecimal;

/**
 * 工厂接口 实现类
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/27 13:59:02
 */
public class NumberFactoryImpl implements NumberFactory {


    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
