package com.summer.siren.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/6/30 21:26
  * @desc
  */
public enum ComponentType implements IEnum<Integer> {
    /**
     * 页面级
     */
    PAGE(0),
    /**
     * 组件级
     */
    COMPONENT(1),
    /**
     * 按钮级
     */
    BUTTON(2),
    /**
     * 链接级
     */
    URL(3);

    private final Integer value;

    ComponentType(Integer value) {
        this.value = value;
    }


    @Override
    public Integer getValue() {
        return value;
    }
}
