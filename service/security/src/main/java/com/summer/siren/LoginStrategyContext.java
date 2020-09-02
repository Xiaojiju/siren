package com.summer.siren;

import com.summer.siren.api.LoginStrategy;
import com.summer.siren.enums.IdentifyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
  *@date 2020/7/14 23:59
  *@author moyang
  *
  **/

@Component
public class LoginStrategyContext implements StrategyContext<IdentifyType, LoginStrategy> {

    private final Map<IdentifyType, LoginStrategy> strategyMap = new ConcurrentHashMap<>();

    @Autowired
    public void setStrategyMap(Map<String, LoginStrategy> beans) {
        this.strategyMap.clear();
        beans.forEach((k,v) -> strategyMap.put(IdentifyType.valueOf(k), v));
    }

    @Override
    public LoginStrategy create(IdentifyType type) {
        return this.strategyMap.get(type);
    }
}
