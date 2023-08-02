// Generated by Dagger (https://dagger.dev).
package com.example.compass_aac.module;

import android.content.Context;
import com.example.data.repository.NodeRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NodeRepository_ProvideNodeRepositoryImplFactory implements Factory<NodeRepositoryImpl> {
  private final Provider<Context> contextProvider;

  public NodeRepository_ProvideNodeRepositoryImplFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NodeRepositoryImpl get() {
    return provideNodeRepositoryImpl(contextProvider.get());
  }

  public static NodeRepository_ProvideNodeRepositoryImplFactory create(
      Provider<Context> contextProvider) {
    return new NodeRepository_ProvideNodeRepositoryImplFactory(contextProvider);
  }

  public static NodeRepositoryImpl provideNodeRepositoryImpl(Context context) {
    return Preconditions.checkNotNullFromProvides(NodeRepository.INSTANCE.provideNodeRepositoryImpl(context));
  }
}
