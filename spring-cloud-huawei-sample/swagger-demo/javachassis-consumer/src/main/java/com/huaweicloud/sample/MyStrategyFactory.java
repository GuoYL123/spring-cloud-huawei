package com.huaweicloud.sample;

import org.apache.servicecomb.qps.strategy.AbstractQpsStrategy;
import org.apache.servicecomb.qps.strategy.IStrategyFactory;

/**
 * @Author GuoYl123
 * @Date 2020/7/29
 **/
public class MyStrategyFactory implements IStrategyFactory {

  @Override
  public AbstractQpsStrategy getStrategy(String strategyName) {
    if (strategyName.equals("My")) {
      return new MyStrategy();
    }
    return null;
  }
}
