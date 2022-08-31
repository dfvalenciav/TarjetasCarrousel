package com.example.tarjetascarrousel.cardCarrousel.di

import com.example.tarjetascarrousel.cardCarrousel.data.repository.CardCarrouselRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.interfaces.ICardCarrouselRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface IRepositoryModule {
    @Binds
    fun bind(repository: CardCarrouselRepository): ICardCarrouselRepository
}