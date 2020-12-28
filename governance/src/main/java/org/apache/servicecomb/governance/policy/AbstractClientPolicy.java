package org.apache.servicecomb.governance.policy;

import java.util.Map;

public abstract class AbstractClientPolicy<T> extends AbstractPolicy {

  private Map<String, T> providers;

  public Map<String, T> getProviders() {
    return providers;
  }

  public void setProviders(Map<String, T> providers) {
    this.providers = providers;
  }
}
