package com.example.daval.cleanrecyclerview.cardSetup.di


import com.example.tarjetascarrousel.cardCarrousel.data.interfaces.IRealmDataBase
import com.example.tarjetascarrousel.cardCarrousel.data.local.CardsRealmDataBase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
interface RealmDataBaseModule {
    @Binds
    fun bind(dataBase: CardsRealmDataBase): IRealmDataBase
}