// Generated by Dagger (https://dagger.dev).
package com.example.compass_aac.view.favorite;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavoriteFullScreen_Factory implements Factory<FavoriteFullScreen> {
  @Override
  public FavoriteFullScreen get() {
    return newInstance();
  }

  public static FavoriteFullScreen_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FavoriteFullScreen newInstance() {
    return new FavoriteFullScreen();
  }

  private static final class InstanceHolder {
    private static final FavoriteFullScreen_Factory INSTANCE = new FavoriteFullScreen_Factory();
  }
}
