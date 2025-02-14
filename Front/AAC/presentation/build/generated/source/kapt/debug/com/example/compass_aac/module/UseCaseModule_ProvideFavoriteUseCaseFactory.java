// Generated by Dagger (https://dagger.dev).
package com.example.compass_aac.module;

import android.speech.tts.TextToSpeech;
import com.example.domain.repository.FavoriteRepository;
import com.example.domain.usecase.FavoriteUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UseCaseModule_ProvideFavoriteUseCaseFactory implements Factory<FavoriteUseCase> {
  private final Provider<FavoriteRepository> favoriteRepositoryProvider;

  private final Provider<TextToSpeech> textToSpeechProvider;

  public UseCaseModule_ProvideFavoriteUseCaseFactory(
      Provider<FavoriteRepository> favoriteRepositoryProvider,
      Provider<TextToSpeech> textToSpeechProvider) {
    this.favoriteRepositoryProvider = favoriteRepositoryProvider;
    this.textToSpeechProvider = textToSpeechProvider;
  }

  @Override
  public FavoriteUseCase get() {
    return provideFavoriteUseCase(favoriteRepositoryProvider.get(), textToSpeechProvider.get());
  }

  public static UseCaseModule_ProvideFavoriteUseCaseFactory create(
      Provider<FavoriteRepository> favoriteRepositoryProvider,
      Provider<TextToSpeech> textToSpeechProvider) {
    return new UseCaseModule_ProvideFavoriteUseCaseFactory(favoriteRepositoryProvider, textToSpeechProvider);
  }

  public static FavoriteUseCase provideFavoriteUseCase(FavoriteRepository favoriteRepository,
      TextToSpeech textToSpeech) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideFavoriteUseCase(favoriteRepository, textToSpeech));
  }
}
