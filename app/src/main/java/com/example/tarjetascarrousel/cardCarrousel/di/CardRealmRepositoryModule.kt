package com.example.daval.cleanrecyclerview.cardSetup.di


import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import com.example.tarjetascarrousel.cardCarrousel.data.repository.CardRealmRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.interfaces.ICardRealmRepository


@Module
@InstallIn(ViewModelComponent::class)
interface CardRealmRepositoryModule {
    @Binds
    fun bind(repository: CardRealmRepository): ICardRealmRepository
}