// Generated by Dagger (https://dagger.dev).
package com.example.compass_aac.viewmodel.voiceaac;

import android.app.Application;
import com.example.domain.usecase.LocationUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationViewModel_Factory implements Factory<LocationViewModel> {
  private final Provider<LocationUseCase> usecaseProvider;

  private final Provider<Application> applicationProvider;

  public LocationViewModel_Factory(Provider<LocationUseCase> usecaseProvider,
      Provider<Application> applicationProvider) {
    this.usecaseProvider = usecaseProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocationViewModel get() {
    return newInstance(usecaseProvider.get(), applicationProvider.get());
  }

  public static LocationViewModel_Factory create(Provider<LocationUseCase> usecaseProvider,
      Provider<Application> applicationProvider) {
    return new LocationViewModel_Factory(usecaseProvider, applicationProvider);
  }

  public static LocationViewModel newInstance(LocationUseCase usecase, Application application) {
    return new LocationViewModel(usecase, application);
  }
}
