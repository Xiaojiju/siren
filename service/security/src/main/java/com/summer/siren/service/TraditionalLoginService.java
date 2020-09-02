package com.summer.siren.service;

import com.summer.siren.bo.LoginBoard;
import org.springframework.stereotype.Service;

@Service("DEFAULT_LOGIN_TYPE")
public class TraditionalLoginService extends AbstractLoginStrategy {

    @Override
    public int login(LoginBoard loginBoard) {
        return 0;
    }
}
