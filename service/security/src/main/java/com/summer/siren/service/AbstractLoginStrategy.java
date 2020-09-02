package com.summer.siren.service;

import com.summer.siren.api.LoginStrategy;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.siren.entity.auth.Subject;
import com.summer.siren.mapper.auth.SubjectMapper;

public abstract class AbstractLoginStrategy extends ServiceImpl<SubjectMapper, Subject> implements LoginStrategy {

}
