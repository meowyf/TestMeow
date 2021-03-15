package com.meowyf.java.enums;

/**
 * 描述
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/27 14:17:53
 */
public enum World {

    // 唯一枚举:
    INSTANCE;

    private String name = "world";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
