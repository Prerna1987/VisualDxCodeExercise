// Generated by Dagger (https://dagger.dev).
package com.visualdx.codechallenge.repository;

import com.visualdx.codechallenge.network.EndPointAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyRepository_Factory implements Factory<CurrencyRepository> {
  private final Provider<EndPointAPI> endPointAPIProvider;

  public CurrencyRepository_Factory(Provider<EndPointAPI> endPointAPIProvider) {
    this.endPointAPIProvider = endPointAPIProvider;
  }

  @Override
  public CurrencyRepository get() {
    return newInstance(endPointAPIProvider.get());
  }

  public static CurrencyRepository_Factory create(Provider<EndPointAPI> endPointAPIProvider) {
    return new CurrencyRepository_Factory(endPointAPIProvider);
  }

  public static CurrencyRepository newInstance(EndPointAPI endPointAPI) {
    return new CurrencyRepository(endPointAPI);
  }
}
