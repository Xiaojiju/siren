package com.summer.siren.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum Verifiable implements IEnum<Integer> {

    VALID(0, "valid"), INVALID(1, "invalid"), EXPIRED(2, "expired");

    private final Integer value;
    private final String desc;

    Verifiable(Integer value, String desc) {
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
