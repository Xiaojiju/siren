package com.summer.siren;

/**
  *@date 2020/7/15 0:02
  *@author moyang
  * 抽象策略模式
  **/

public interface StrategyContext<T, R> {

    R create(T type);
}
