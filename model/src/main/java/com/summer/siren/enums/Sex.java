package com.summer.siren.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum Sex implements IEnum<Integer> {

    MALE(0, "男"), FEMALE(1, "女"), HIDE(2, "保密");

    private final Integer value;
    private final String desc;

    Sex(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
