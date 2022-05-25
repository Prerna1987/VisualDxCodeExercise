// Generated by Dagger (https://dagger.dev).
package com.visualdx.codechallenge.di;

import com.visualdx.codechallenge.MainActivity;
import com.visualdx.codechallenge.fragments.HomeFragment;
import com.visualdx.codechallenge.fragments.HomeFragment_MembersInjector;
import com.visualdx.codechallenge.network.EndPointAPI;
import com.visualdx.codechallenge.repository.CurrencyRepository;
import com.visualdx.codechallenge.repository.MyCurrencyModelFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApplicationComponent implements ApplicationComponent {
  private final DaggerApplicationComponent applicationComponent = this;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<EndPointAPI> provideEndpointAPIProvider;

  private DaggerApplicationComponent(NetworkModule networkModuleParam) {

    initialize(networkModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  private CurrencyRepository currencyRepository() {
    return new CurrencyRepository(provideEndpointAPIProvider.get());
  }

  private MyCurrencyModelFactory myCurrencyModelFactory() {
    return new MyCurrencyModelFactory(currencyRepository());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam) {
    this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(networkModuleParam));
    this.provideEndpointAPIProvider = DoubleCheck.provider(NetworkModule_ProvideEndpointAPIFactory.create(networkModuleParam, provideRetrofitProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
  }

  @Override
  public void inject(HomeFragment homeFragment) {
    injectHomeFragment(homeFragment);
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectFactory(instance, myCurrencyModelFactory());
    return instance;
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public ApplicationComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerApplicationComponent(networkModule);
    }
  }
}
