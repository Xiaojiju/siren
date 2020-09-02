package com.summer.siren.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summer.siren.bo.LoginBoard;
import com.summer.siren.entity.auth.Subject;

public interface LoginStrategy extends IService<Subject> {

    int login(LoginBoard loginBoard);
}
