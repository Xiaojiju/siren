package com.summer.siren.service;

import com.summer.siren.bo.LoginBoard;
import org.springframework.stereotype.Service;

@Service("WECHAT_LOGIN_TYPE")
public class WechatLoginService extends AbstractLoginStrategy {

    @Override
    public int login(LoginBoard loginBoard) {
        return 0;
    }
}
