package com.example.tarjetascarrousel.cardCarrousel.di

import com.example.tarjetascarrousel.cardCarrousel.data.interfaces.IRealmDatabase
import com.example.tarjetascarrousel.cardCarrousel.data.local.realm.RealmDataBase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface IRealmDataBaseModule {
    @Binds
    fun bind(dataBase: RealmDataBase): IRealmDatabase
}