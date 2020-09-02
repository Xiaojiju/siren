package com.summer.siren.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/6/13 23:13
  * @desc  可用类型
  */
public enum UsageType implements IEnum<Integer> {
    /**
     * 邮箱
     */
    EMAIL(0, "email"),
    /**
     * 直接修改
     */
    OLD_MODIFY(1, "modify"),
    /**
     * 手机号码置换
     */
    PHONE(2, "phone"),
    /**
     * 重置
     */
    SYS_RESET(3, "reset");

    UsageType(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    private final Integer value;
    private final String description;


    public Integer getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
