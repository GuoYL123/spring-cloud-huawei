package com.huaweicloud.sample;

import org.apache.servicecomb.qps.strategy.AbstractQpsStrategy;

/**
 * @Author GuoYl123
 * @Date 2020/7/29
 **/
public class MyStrategy extends AbstractQpsStrategy {

  @Override
  public boolean isLimitNewRequest() {
    return false;
  }

  @Override
  public String name() {
    return "My";
  }
}
