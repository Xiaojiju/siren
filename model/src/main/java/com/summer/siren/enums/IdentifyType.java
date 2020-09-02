package com.summer.siren.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum IdentifyType implements IEnum<Integer> {

    /**
     * 传统登录方式
     */
    DEFAULT_LOGIN_TYPE(0, "defaultLoginType"),
    /**
     * 手机登录
     */
    MOBILE_LOGIN_TYPE(1, "mobileLoginType"),
    /**
     * 微信登录
     */
    WECHAT_LOGIN_TYPE(2, "wechatLoginType"),
    /**
     * 微博登录
     */
    WEIBO_LOGIN_TYPE(3, "weiboLoginType"),
    /**
     * QQ登录
     */
    QQ_LOGIN_TYPE(4, "QQLoginType"),
    /**
     * 邮箱登录
     */
    EMAIL_LOGIN_TYPE(5, "emailLoginType");

    private final Integer value;
    private final String desc;

    IdentifyType(Integer value, String desc) {
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
