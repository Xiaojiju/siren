package com.summer.siren.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum AccessAlive implements IEnum<Integer> {

    ALIVE(0, "alive"), FREEZE(1, "freeze"), DESERT_JOB(2, "desert_job");

    private final Integer value;
    private final String desc;

    AccessAlive(Integer value, String desc) {
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
